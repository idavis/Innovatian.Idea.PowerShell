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

%init{
%init}

%x XSTRINGQ
%x XSTRINGA

VARIABLE = \$[A-Za-z]+ | \$\{.+\}
PARAMETERARGUMENTTOKEN = [^-($0-9].*[^ \t]
PARAMETERTOKEN = -[A-Za-z]+[:]{PARAMETERARGUMENTTOKEN}
CALLARGUMENTSEPARATOR= ' |'
COMMATOKEN = ' |'

DECDIGIT         =     [0-9]
HEXDIGIT       =       [0-9A-Fa-f]
DECLITERAL     =       {DECDIGIT}+
HEXLITERAL     =       0[xX]{HEXDIGIT}+

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////// NewLines and spaces /////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

ONE_NL = \r | \n | \r\n                                    // NewLines
WS = " " | \t | \f | \\ {ONE_NL}                          // Whitespaces
NLS = {ONE_NL}({ONE_NL}|{WS})*

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

"\""         { yybegin(XSTRINGQ);  return EXPSTRING; }
'            { yybegin(XSTRINGA); return STRING; }

<XSTRINGQ>
{
  \"\"       {yybegin(XSTRINGQ); return EXPSTRING;}
  \"         { yybegin(YYINITIAL); return EXPSTRING; }
  \\[abfnrt] {return EXPSTRING;}
  "$"        { return DOLLAR;  }
  "{"        { return LCURLY;}
  "}"        { return RCURLY;}
  \\\n       {yybegin(YYINITIAL);return WRONG;}
  \\\"       {return EXPSTRING; }
  \\'        {return EXPSTRING;}
  \\\\       { return EXPSTRING; }
  {NLS}  { yybegin(YYINITIAL); return WRONG; }
  .          {return EXPSTRING;}
}

<XSTRINGA>
{
  ''         { yybegin(XSTRINGA); return STRING; }
  '          { yybegin(YYINITIAL); return STRING; }
  \\[abfnrt] { return STRING; }
  \\\n       { yybegin(YYINITIAL);return WRONG; }
  \\\'       { return STRING; }
  \\'        { yybegin(YYINITIAL); return STRING; }
  \\\\       { return STRING; }
  {NLS}  { yybegin(YYINITIAL);return WRONG;  }
  .          { return STRING; }
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

{VARIABLE}      { return NAME; }
{DECLITERAL}    { return NUMBER; }
{HEXLITERAL}    { return NUMBER; }


// oh no
.               {   return WRONG; }