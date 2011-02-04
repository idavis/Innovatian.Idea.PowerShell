package com.innovatian.idea.powershell.lang.lexer;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import java.util.*;
import java.lang.reflect.Field;
import org.jetbrains.annotations.NotNull;

%%

%class _PowerShellLexer
%implements FlexLexer, PsTokenTypes

%unicode

%function advance
%type IElementType

%eof{ return;
%eof}

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////// User code //////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

%{

  private Stack <IElementType> gStringStack = new Stack<IElementType>();
  private Stack <IElementType> blockStack = new Stack<IElementType>();

  private int afterComment = YYINITIAL;

  private void clearStacks(){
    gStringStack.clear();
    blockStack.clear();
  }

  private Stack<IElementType> braceCount = new Stack <IElementType>();

%}

%init{
%init}

%xstate IN_SINGLE_EXPSTRING_DOLLAR
%xstate IN_SINGLE_EXPSTRING
%xstate IN_SINGLE_IDENT
%xstate IN_SINGLE_DOT
%xstate IN_SINGLE_QUOTESTRING

%xstate NLS_AFTER_LBRACE


%state IN_INNER_BLOCK

//VARIABLE = \$[A-Za-z]+ | \$\{.+\}
PARAMETERARGUMENTTOKEN = [^-($0-9].*[^ \t]
PARAMETERTOKEN = -[A-Za-z]+[:]{PARAMETERARGUMENTTOKEN}
CALLARGUMENTSEPARATOR= ' |'
COMMATOKEN = ' |'

DECDIGIT         =     [0-9]
HEXDIGIT       =       [0-9A-Fa-f]
DECLITERAL     =       {DECDIGIT}+
HEXLITERAL     =       0[xX]{HEXDIGIT}+

LETTER = [:letter:] | "_"

IDENT = ({LETTER}|\$) ({LETTER} | {DECDIGIT} | \$)*
IDENT_NOBUCKS = {LETTER} ({LETTER} | {DECDIGIT})*

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////// NewLines and spaces /////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

ONE_NL = \r | \n | \r\n                                    // NewLines
WS = " " | \t | \f | \\ {ONE_NL}                          // Whitespaces
NLS = {ONE_NL}({ONE_NL}|{WS})*

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////// Strings /////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

STRING_NL = {ONE_NL}
STRING_ESC = \\ [^]

SINGLE_QUOTED_STRING_BEGIN = "\'"

SINGLE_QUOTED_STRING_CONTENT = ( {STRING_ESC} | "\"" | [^\\\'\r\n] | "$" )*
SINGLE_QUOTED_STRING = {SINGLE_QUOTED_STRING_BEGIN} \'

STRING_LITERAL = {SINGLE_QUOTED_STRING}


// Single-double-quoted strings
EXPSTRING_SINGLE_CONTENT = ({STRING_ESC}
    | [^\\\"\r\n"$"]
    | "\'" )+

EXPSTRING_LITERAL = \"\"
    | \" ([^\\\"\n\r"$"] | {STRING_ESC})? {EXPSTRING_SINGLE_CONTENT} \"

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////// Comments ////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

C_STYLE_COMMENT=("/*" [^"*"] {COMMENT_TAIL} ) | "/*"
COMMENT_TAIL=( [^"*"]* ("*"+ [^"*""/"] )? )* ("*" | "*"+"/")?


%%

#[^\r\n]*       { return SL_COMMENT; }
{C_STYLE_COMMENT} { return ML_COMMENT; }

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////// Strings /////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

<IN_SINGLE_QUOTESTRING>
{
  {SINGLE_QUOTED_STRING_CONTENT}           { return EXPSTRING_CONTENT; }
  \\                                       {  return EXPSTRING_CONTENT; }
  \'           { yybegin(YYINITIAL); return EXPSTRING_END; }
  {NLS}        { return WRONG;  }
}

{SINGLE_QUOTED_STRING_BEGIN}               {  yybegin(IN_SINGLE_QUOTESTRING); return EXPSTRING_BEGIN; }


// Expando Strings
\"                                                         {  yybegin(IN_SINGLE_EXPSTRING);
                                                              gStringStack.push(LPAREN);
                                                              return EXPSTRING_BEGIN; }

{EXPSTRING_LITERAL}                                         {  return EXPSTRING_LITERAL; }

// Single double-quoted Expando String
<IN_SINGLE_IDENT>{
  {IDENT_NOBUCKS}                        {  yybegin(IN_SINGLE_DOT);
                                             return IDENT;  }
  [^]                                     {  yypushback(1);
                                             yybegin(IN_SINGLE_EXPSTRING);  }
}
<IN_SINGLE_DOT>{
  "." /{IDENT_NOBUCKS}                   {  yybegin(IN_SINGLE_IDENT);
                                             return DOT;  }
  [^]                                     {  yypushback(1);
                                             yybegin(IN_SINGLE_EXPSTRING);  }
}

<IN_SINGLE_EXPSTRING_DOLLAR> {

"begin"        { return BEGIN; }
"break"        { return BREAK; }
"catch"        { return CATCH; }
"continue"     { return CONTINUE; }
"data"         { return DATA; }
"do"           { return DO; }
"else"         { return ELSE; }
"elseif"       { return ELSEIF; }
"end"          { return END; }
"exit"         { return EXIT; }
"filter"       { return FILTER; }
"finally"      { return FINALLY; }
"for"          { return FOR; }
"function"     { return FUNCTION; }
"if"           { return IF; }
"in"           { return IN; }
"param"        { return PARAM; }
"process"      { return PROCESS; }
"return"       { return RETURN; }
"switch"       { return SWITCH; }
"throw"        { return THROW; }
"try"          { return TRY; }
"trap"         { return TRAP; }
"while"        { return WHILE; }
"until"        { return UNTIL; }

  {IDENT_NOBUCKS}                        {  yybegin(IN_SINGLE_DOT);
                                             return IDENT; }
  "{"                                     {  blockStack.push(LPAREN);
                                             yybegin(IN_INNER_BLOCK);
                                             return LCURLY; }
  [^]                                     {  yypushback(1);
                                             yybegin(IN_SINGLE_EXPSTRING); }
}
<IN_INNER_BLOCK>{
  "}"                                     {  if (!blockStack.isEmpty()) {
                                               IElementType br = blockStack.pop();
                                             }
                                             return RCURLY; }
{IDENT_NOBUCKS}                        {  yybegin(IN_SINGLE_DOT); return IDENT; }
"."              { return WRONG; }
}
<IN_SINGLE_EXPSTRING> {
  {EXPSTRING_SINGLE_CONTENT} (\\)?         {  return EXPSTRING_CONTENT; }
  \\                                      {  return EXPSTRING_CONTENT; }

  \"                                      {  yybegin(YYINITIAL); return EXPSTRING_END; }
  "$"                                     {  yybegin(IN_SINGLE_EXPSTRING_DOLLAR);
                                             return DOLLAR;
                                          }
  {NLS}                                  {  return WRONG; }
}

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////// Keywords ////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

"begin"        { return BEGIN; }
"break"        { return BREAK; }
"catch"        { return CATCH; }
"continue"     { return CONTINUE; }
"data"         { return DATA; }
"do"           { return DO; }
"else"         { return ELSE; }
"elseif"       { return ELSEIF; }
"end"          { return END; }
"exit"         { return EXIT; }
"filter"       { return FILTER; }
"finally"      { return FINALLY; }
"for"          { return FOR; }
"function"     { return FUNCTION; }
"if"           { return IF; }
"in"           { return IN; }
"param"        { return PARAM; }
"process"      { return PROCESS; }
"return"       { return RETURN; }
"switch"       { return SWITCH; }
"throw"        { return THROW; }
"try"          { return TRY; }
"trap"         { return TRAP; }
"while"        { return WHILE; }
"until"        { return UNTIL; }

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////// Operators ///////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

{WS}         { return WS; }
"..."        { return ELLIPSIS; }
".."         { return RANGE; }
"=="         { return EQ; }
">="         { return GE; }
"<="         { return LE; }
"-"          { return MINUS; }
"+"          { return PLUS;}
"*"          { return MULT;}
"%"          { return MOD;}
"/"          { return DIV; }
"="          { return ASSIGN;}
">"          { return GT;}
"<"          { return LT;}
"("          { return LPAREN;}
")"          { return RPAREN;}
"["          { return LBRACK;}
"]"          { return RBRACK;}
"{"          { return LCURLY;}
"}"          { return RCURLY;}
","          { return COMMA; }
";"          { return SEMI; }
":"          { return COLON; }
"."          { return DOT;}
"^"          { return EXP;}
{NLS}        { return NEWLINE; }
"$"          { return DOLLAR;  }

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////      Comparison Operators      ///////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

"-eq"           { return COEQ;}
"-ne"           { return CONE;}
"-ge"           { return COGE;}
"-gt"           { return COGE;}
"-lt"           { return COLT;}
"-le"           { return COLE;}

"-ieq"          { return COIEQ;}
"-ine"          { return COINE;}
"-ige"          { return COIGE;}
"-igt"          { return COIGT;}
"-ilt"          { return COILT;}
"-ile"          { return COILE;}

"-ceq"          { return COCEQ;}
"-cne"          { return COCNE;}
"-cge"          { return COCGE;}
"-cgt"          { return COCGT;}
"-clt"          { return COCLT;}
"-cle"          { return COCLE;}

"-like"         { return COLIKE;}
"-notlike"      { return CONOTLIKE;}
"-match"        { return COMATCH;}
"-notmatch"     { return CONOTMATCH;}

"-ilike"        { return COILIKE;}
"-inotlike"     { return COINOTLIKE;}
"-imatch"       { return COIMATCH;}
"-inotmatch"    { return COINOTMATCH;}

"-clike"        { return COCLIKE;}
"-cnotlike"     { return COCNOTLIKE;}
"-cmatch"       { return COCMATCH;}
"-cnotmatch"    { return COCNOTMATCH;}

"-contains"     { return COCONTAINS;}
"-notcontains"  { return CONOTCONTAINS;}

"-icontains"    { return COICONTAINS;}
"-inotcontains" { return COINOTCONTAINS;}

"-ccontains"    { return COCCONTAINS;}
"-cnotcontains" { return COCNOTCONTAINS;}

"-isnot"        { return COISNOT;}
"-is"           { return COIS;}
"-as"           { return COAS;}

"-replace"      { return COREPLACE;}
"-ireplace"     { return COIREPLACE;}
"-creplace"     { return COCREPLACE;}

{DECLITERAL}    { return NUMBER; }
{HEXLITERAL}    { return NUMBER; }


// oh no
.               {   return WRONG; }