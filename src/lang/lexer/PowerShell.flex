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
  private Stack <IElementType> blockStack = new Stack<IElementType>();

  private int afterComment = YYINITIAL;

  private void clearStacks(){
    blockStack.clear();
  }

  private Stack<IElementType> braceCount = new Stack <IElementType>();

%}

%init{
%init}

%xstate IN_IDENT_DOLLAR
%xstate IN_INNER_IDENT_BLOCK
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

IDENT = (\$) ({LETTER} | {DECDIGIT} )*
IDENT_NOBUCKS = {LETTER} ({LETTER} | {DECDIGIT})*
IDENT_NOBUCKS_CURLY = "{" ({LETTER} ({LETTER} | {DECDIGIT})*) "}"

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

SINGLE_QUOTED_STRING_BEGIN = \'

SINGLE_QUOTED_STRING_CONTENT = ( {STRING_ESC} | "\"" | [^\\\'\r\n] | "$" )*
SINGLE_QUOTED_STRING = {SINGLE_QUOTED_STRING_BEGIN} {SINGLE_QUOTED_STRING_CONTENT} \'

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

{STRING_LITERAL}               { return STRING_LITERAL; }


// Expando Strings
\"                                         {  yybegin(IN_SINGLE_EXPSTRING); return EXPSTRING_BEGIN; }

{EXPSTRING_LITERAL}                        {  return EXPSTRING_LITERAL; }

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
  {IDENT_NOBUCKS}                         {  return IDENT; }
  "{"                                     {  blockStack.push(LPAREN);
                                             yybegin(IN_INNER_BLOCK);
                                             return LCURLY; }
  [^]                                     {  yypushback(1);
                                             yybegin(IN_SINGLE_EXPSTRING); }
}
<IN_INNER_BLOCK>{
{IDENT_NOBUCKS}                        {  /*yybegin(IN_SINGLE_DOT);*/ return IDENT; }
"}"                                    {  if (!blockStack.isEmpty()) { IElementType br = blockStack.pop(); }
                                          yybegin(IN_SINGLE_EXPSTRING);
                                          return RCURLY; }
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

[Bb][Ee][Gg][Ii][Nn]        { return BEGIN; }  // begin
[Bb][Rr][Ee][Aa][Kk]        { return BREAK; }  // break
[Cc][Aa][Tt][Cc][Hh]        { return CATCH; }  // catch
[Cc][Oo][Nn][Tt][Ii][Nn][Uu][Ee]     { return CONTINUE; }  // continue
[Dd][Aa][Tt][Aa]         { return DATA; }  // data
[Dd][Oo]           { return DO; }  // do
[Ee][Ll][Ss][Ee]         { return ELSE; }  // else
[Ee][Ll][Ss][Ee][Ii][Ff]       { return ELSEIF; }  // elseif
[Ee][Nn][Dd]          { return END; }  // end
[Ee][Xx][Ii][Tt]         { return EXIT; }  // exit
[Ff][Ii][Ll][Tt][Ee][Rr]       { return FILTER; }  // filter
[Ff][Ii][Nn][Aa][Ll][Ll][Yy]      { return FINALLY; }  // finally
[Ff][Oo][Rr]          { return FOR; }  // for
[Ff][Uu][Nn][Cc][Tt][Ii][Oo][Nn]     { return FUNCTION; }  // function
[Ii][Ff]           { return IF; }  // if
[Ii][Nn]           { return IN; }  // in
[Pp][Aa][Rr][Aa][Mm]        { return PARAM; }  // param
[Pp][Rr][Oo][Cc][Ee][Ss][Ss]      { return PROCESS; }  // process
[Rr][Ee][Tt][Uu][Rr][Nn]       { return RETURN; }  // return
[Ss][Ww][Ii][Tt][Cc][Hh]       { return SWITCH; }  // switch
[Tt][Hh][Rr][Oo][Ww]        { return THROW; }  // throw
[Tt][Rr][Yy]          { return TRY; }  // try
[Tt][Rr][Aa][Pp]         { return TRAP; }  // trap
[Ww][Hh][Ii][Ll][Ee]        { return WHILE; }  // while
[Uu][Nn][Tt][Ii][Ll]        { return UNTIL; }  // until

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
//"$__"        { return IMPLICITVAR; } // having trouble with this.
"$$"         { return LASTTOKEN; }
"$" [^_$]    {  yybegin(IN_IDENT_DOLLAR); yypushback(1); return DOLLAR; }

<IN_IDENT_DOLLAR> {
  {IDENT_NOBUCKS}                         {  return IDENT; }
  "{"                                     {  blockStack.push(LPAREN);
                                             yybegin(IN_INNER_IDENT_BLOCK);
                                             return LCURLY; }
  [^]                                     {  return WRONG; }
}

<IN_INNER_IDENT_BLOCK>{
  {IDENT_NOBUCKS}                        {  return IDENT; }
  "}"                                    {  if (!blockStack.isEmpty()) { IElementType br = blockStack.pop(); }
                                          yybegin(YYINITIAL);
                                          return RCURLY; }
  [^]                                     {  return WRONG; }
}

//{IDENT}        { return IDENT;}
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////      Comparison Operators      ///////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

"-"[Ee][Qq]           { return COEQ;}
"-"[Nn][Ee]           { return CONE;}
"-"[Gg][Ee]           { return COGE;}
"-"[Gg][Tt]           { return COGE;}
"-"[Ll][Tt]           { return COLT;}
"-"[Ll][Ee]           { return COLE;}

"-"[Ii][Ee][Qq]          { return COIEQ;}
"-"[Ii][Nn][Ee]          { return COINE;}
"-"[Ii][Gg][Gg]          { return COIGE;}
"-"[Ii][Gg][Tt]          { return COIGT;}
"-"[Ii][Ll][Tt]          { return COILT;}
"-"[Ii][Ll][Ee]          { return COILE;}

"-"[Cc][Ee][Qq]          { return COCEQ;}
"-"[Cc][Nn][Ee]          { return COCNE;}
"-"[Cc][Gg][Ee]          { return COCGE;}
"-"[Cc][Gg][Tt]          { return COCGT;}
"-"[Cc][Ll][Tt]          { return COCLT;}
"-"[Cc][Ll][Ee]          { return COCLE;}

"-"[Ll][Ii][Kk][Ee]         { return COLIKE;}
"-"[Nn][Oo][Tt][Ll][Ii][Kk][Ee]      { return CONOTLIKE;}
"-"[Mm][Aa][Tt][Cc][Hh]        { return COMATCH;}
"-"[Nn][Oo][Tt][Mm][Aa][Tt][Cc][Hh]     { return CONOTMATCH;}

"-"[Ii][Ll][Ii][Kk][Ee]        { return COILIKE;}
"-"[Ii][Nn][Oo][Tt][Ll][Ii][Kk][Ee]     { return COINOTLIKE;}
"-"[Ii][Mm][Aa][Tt][Cc][Hh]       { return COIMATCH;}
"-"[Ii][Nn][Oo][Tt][Mm][Aa][Tt][Cc][Hh]    { return COINOTMATCH;}

"-"[Cc][Ll][Ii][Kk][Ee]        { return COCLIKE;}
"-"[Cc][Nn][Oo][Tt][Ll][Ii][Kk][Ee]     { return COCNOTLIKE;}
"-"[Cc][Mm][Aa][Tt][Cc][Hh]       { return COCMATCH;}
"-"[Cc][Nn][Oo][Tt][Mm][Aa][Tt][Cc][Hh]    { return COCNOTMATCH;}

"-"[Cc][Oo][Nn][Tt][Aa][Ii][Nn][Ss]     { return COCONTAINS;}
"-"[Nn][Oo][Tt][Cc][Oo][Nn][Tt][Aa][Ii][Nn][Ss]  { return CONOTCONTAINS;}

"-"[Ii][Cc][Oo][Nn][Tt][Aa][Ii][Nn][Ss]    { return COICONTAINS;}
"-"[Ii][Nn][Oo][Tt][Cc][Oo][Nn][Tt][Aa][Ii][Nn][Ss] { return COINOTCONTAINS;}

"-"[Cc][Cc][Oo][Nn][Tt][Aa][Ii][Nn][Ss]    { return COCCONTAINS;}
"-"[Cc][Nn][Oo][Tt][Cc][Oo][Nn][Tt][Aa][Ii][Nn][Ss] { return COCNOTCONTAINS;}

"-"[Ii][Ss][Nn][Oo][Tt]        { return COISNOT;}
"-"[Ii][Ss]           { return COIS;}
"-"[As][Ss]           { return COAS;}

"-"[Rr][Ee][Pp][Ll][Aa][Cc][Ee]      { return COREPLACE;}
"-"[Ii][Rr][Ee][Pp][Ll][Aa][Cc][Ee]     { return COIREPLACE;}
"-"[Cc][Rr][Ee][Pp][Ll][Aa][Cc][Ee]     { return COCREPLACE;}

{DECLITERAL}    { return NUMBER; }
{HEXLITERAL}    { return NUMBER; }

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////      Commandlets      ////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
[Aa][Dd][Dd]"-"[Cc][Oo][Nn][Tt][Ee][Nn][Tt]    { return CMDLET; }  // add-content
[Aa][Dd][Dd]"-"[Hh][Ii][Ss][Tt][Oo][Rr][Yy]    { return CMDLET; }  // add-history
[Aa][Dd][Dd]"-"[Mm][Ee][Mm][Bb][Ee][Rr]    { return CMDLET; }  // add-member
[Aa][Dd][Dd]"-"[Pp][Ss][Ss][Nn][Aa][Pp][Ii][Nn]    { return CMDLET; }  // add-pssnapin
[Cc][Ll][Ee][Aa][Rr]"-"[Cc][Oo][Nn][Tt][Ee][Nn][Tt]    { return CMDLET; }  // clear-content
[Cc][Ll][Ee][Aa][Rr]"-"[Ii][Tt][Ee][Mm]    { return CMDLET; }  // clear-item
[Cc][Ll][Ee][Aa][Rr]"-"[Ii][Tt][Ee][Mm][Pp][Rr][Oo][Pp][Ee][Rr][Tt][Yy]    { return CMDLET; }  // clear-itemproperty
[Cc][Ll][Ee][Aa][Rr]"-"[Vv][Aa][Rr][Ii][Aa][Bb][Ll][Ee]    { return CMDLET; }  // clear-variable
[Cc][Oo][Mm][Pp][Aa][Rr][Ee]"-"[Oo][Bb][Jj][Ee][Cc][Tt]    { return CMDLET; }  // compare-object
[Cc][Oo][Nn][Vv][Ee][Rr][Tt][Ff][Rr][Oo][Mm]"-"[Ss][Ee][Cc][Uu][Rr][Ee][Ss][Tt][Rr][Ii][Nn][Gg]    { return CMDLET; }  // convertfrom-securestring
[Cc][Oo][Nn][Vv][Ee][Rr][Tt]"-"[Pp][Aa][Tt][Hh]    { return CMDLET; }  // convert-path
[Cc][Oo][Nn][Vv][Ee][Rr][Tt][Tt][Oo]"-"[Hh][Tt][Mm][Ll]    { return CMDLET; }  // convertto-html
[Cc][Oo][Nn][Vv][Ee][Rr][Tt][Tt][Oo]"-"[Ss][Ee][Cc][Uu][Rr][Ee][Ss][Tt][Rr][Ii][Nn][Gg]    { return CMDLET; }  // convertto-securestring
[Cc][Oo][Pp][Yy]"-"[Ii][Tt][Ee][Mm]    { return CMDLET; }  // copy-item
[Cc][Oo][Pp][Yy]"-"[Ii][Tt][Ee][Mm][Pp][Rr][Oo][Pp][Ee][Rr][Tt][Yy]    { return CMDLET; }  // copy-itemproperty
[Ee][Xx][Pp][Oo][Rr][Tt]"-"[Aa][Ll][Ii][Aa][Ss]    { return CMDLET; }  // export-alias
[Ee][Xx][Pp][Oo][Rr][Tt]"-"[Cc][Ll][Ii][Xx][Mm][Ll]    { return CMDLET; }  // export-clixml
[Ee][Xx][Pp][Oo][Rr][Tt]"-"[Cc][Oo][Nn][Ss][Oo][Ll][Ee]    { return CMDLET; }  // export-console
[Ee][Xx][Pp][Oo][Rr][Tt]"-"[Cc][Ss][Vv]    { return CMDLET; }  // export-csv
[Ff][Oo][Rr][Ee][Aa][Cc][Hh]"-"[Oo][Bb][Jj][Ee][Cc][Tt]    { return CMDLET; }  // foreach-object
[Ff][Oo][Rr][Mm][Aa][Tt]"-"[Cc][Uu][Ss][Tt][Oo][Mm]    { return CMDLET; }  // format-custom
[Ff][Oo][Rr][Mm][Aa][Tt]"-"[Ll][Ii][Ss][Tt]    { return CMDLET; }  // format-list
[Ff][Oo][Rr][Mm][Aa][Tt]"-"[Tt][Aa][Bb][Ll][Ee]    { return CMDLET; }  // format-table
[Ff][Oo][Rr][Mm][Aa][Tt]"-"[Ww][Ii][Dd][Ee]    { return CMDLET; }  // format-wide
[Gg][Ee][Tt]"-"[Aa][Cc][Ll]    { return CMDLET; }  // get-acl
[Gg][Ee][Tt]"-"[Aa][Ll][Ii][Aa][Ss]    { return CMDLET; }  // get-alias
[Gg][Ee][Tt]"-"[Aa][Uu][Tt][Hh][Ee][Nn][Tt][Ii][Cc][Oo][Dd][Ee][Ss][Ii][Gg][Nn][Aa][Tt][Uu][Rr][Ee]    { return CMDLET; }  // get-authenticodesignature
[Gg][Ee][Tt]"-"[Cc][Hh][Ii][Ll][Dd][Ii][Tt][Ee][Mm]    { return CMDLET; }  // get-childitem
[Gg][Ee][Tt]"-"[Cc][Oo][Mm][Mm][Aa][Nn][Dd]    { return CMDLET; }  // get-command
[Gg][Ee][Tt]"-"[Cc][Oo][Nn][Tt][Ee][Nn][Tt]    { return CMDLET; }  // get-content
[Gg][Ee][Tt]"-"[Cc][Rr][Ee][Dd][Ee][Nn][Tt][Ii][Aa][Ll]    { return CMDLET; }  // get-credential
[Gg][Ee][Tt]"-"[Cc][Uu][Ll][Tt][Uu][Rr][Ee]    { return CMDLET; }  // get-culture
[Gg][Ee][Tt]"-"[Dd][Aa][Tt][Ee]    { return CMDLET; }  // get-date
[Gg][Ee][Tt]"-"[Ee][Vv][Ee][Nn][Tt][Ll][Oo][Gg]    { return CMDLET; }  // get-eventlog
[Gg][Ee][Tt]"-"[Ee][Xx][Ee][Cc][Uu][Tt][Ii][Oo][Nn][Pp][Oo][Ll][Ii][Cc][Yy]    { return CMDLET; }  // get-executionpolicy
[Gg][Ee][Tt]"-"[Hh][Ee][Ll][Pp]    { return CMDLET; }  // get-help
[Gg][Ee][Tt]"-"[Hh][Ii][Ss][Tt][Oo][Rr][Yy]    { return CMDLET; }  // get-history
[Gg][Ee][Tt]"-"[Hh][Oo][Ss][Tt]    { return CMDLET; }  // get-host
[Gg][Ee][Tt]"-"[Ii][Tt][Ee][Mm]    { return CMDLET; }  // get-item
[Gg][Ee][Tt]"-"[Ii][Tt][Ee][Mm][Pp][Rr][Oo][Pp][Ee][Rr][Tt][Yy]    { return CMDLET; }  // get-itemproperty
[Gg][Ee][Tt]"-"[Ll][Oo][Cc][Aa][Tt][Ii][Oo][Nn]    { return CMDLET; }  // get-location
[Gg][Ee][Tt]"-"[Mm][Ee][Mm][Bb][Ee][Rr]    { return CMDLET; }  // get-member
[Gg][Ee][Tt]"-"[Pp][Ff][Xx][Cc][Ee][Rr][Tt][Ii][Ff][Ii][Cc][Aa][Tt][Ee]    { return CMDLET; }  // get-pfxcertificate
[Gg][Ee][Tt]"-"[Pp][Rr][Oo][Cc][Ee][Ss][Ss]    { return CMDLET; }  // get-process
[Gg][Ee][Tt]"-"[Pp][Ss][Dd][Rr][Ii][Vv][Ee]    { return CMDLET; }  // get-psdrive
[Gg][Ee][Tt]"-"[Pp][Ss][Pp][Rr][Oo][Vv][Ii][Dd][Ee][Rr]    { return CMDLET; }  // get-psprovider
[Gg][Ee][Tt]"-"[Pp][Ss][Ss][Nn][Aa][Pp][Ii][Nn]    { return CMDLET; }  // get-pssnapin
[Gg][Ee][Tt]"-"[Ss][Ee][Rr][Vv][Ii][Cc][Ee]    { return CMDLET; }  // get-service
[Gg][Ee][Tt]"-"[Tt][Rr][Aa][Cc][Ee][Ss][Oo][Uu][Rr][Cc][Ee]    { return CMDLET; }  // get-tracesource
[Gg][Ee][Tt]"-"[Uu][Ii][Cc][Uu][Ll][Tt][Uu][Rr][Ee]    { return CMDLET; }  // get-uiculture
[Gg][Ee][Tt]"-"[Uu][Nn][Ii][Qq][Uu][Ee]    { return CMDLET; }  // get-unique
[Gg][Ee][Tt]"-"[Vv][Aa][Rr][Ii][Aa][Bb][Ll][Ee]    { return CMDLET; }  // get-variable
[Gg][Ee][Tt]"-"[Ww][Mm][Ii][Oo][Bb][Jj][Ee][Cc][Tt]    { return CMDLET; }  // get-wmiobject
[Gg][Rr][Oo][Uu][Pp]"-"[Oo][Bb][Jj][Ee][Cc][Tt]    { return CMDLET; }  // group-object
[Ii][Mm][Pp][Oo][Rr][Tt]"-"[Aa][Ll][Ii][Aa][Ss]    { return CMDLET; }  // import-alias
[Ii][Mm][Pp][Oo][Rr][Tt]"-"[Cc][Ll][Ii][Xx][Mm][Ll]    { return CMDLET; }  // import-clixml
[Ii][Mm][Pp][Oo][Rr][Tt]"-"[Cc][Ss][Vv]    { return CMDLET; }  // import-csv
[Ii][Nn][Vv][Oo][Kk][Ee]"-"[Ee][Xx][Pp][Rr][Ee][Ss][Ss][Ii][Oo][Nn]    { return CMDLET; }  // invoke-expression
[Ii][Nn][Vv][Oo][Kk][Ee]"-"[Hh][Ii][Ss][Tt][Oo][Rr][Yy]    { return CMDLET; }  // invoke-history
[Ii][Nn][Vv][Oo][Kk][Ee]"-"[Ii][Tt][Ee][Mm]    { return CMDLET; }  // invoke-item
[Jj][Oo][Ii][Nn]"-"[Pp][Aa][Tt][Hh]    { return CMDLET; }  // join-path
[Mm][Ee][Aa][Ss][Uu][Rr][Ee]"-"[Cc][Oo][Mm][Mm][Aa][Nn][Dd]    { return CMDLET; }  // measure-command
[Mm][Ee][Aa][Ss][Uu][Rr][Ee]"-"[Oo][Bb][Jj][Ee][Cc][Tt]    { return CMDLET; }  // measure-object
[Mm][Oo][Vv][Ee]"-"[Ii][Tt][Ee][Mm]    { return CMDLET; }  // move-item
[Mm][Oo][Vv][Ee]"-"[Ii][Tt][Ee][Mm][Pp][Rr][Oo][Pp][Ee][Rr][Tt][Yy]    { return CMDLET; }  // move-itemproperty
[Nn][Ee][Ww]"-"[Aa][Ll][Ii][Aa][Ss]    { return CMDLET; }  // new-alias
[Nn][Ee][Ww]"-"[Ii][Tt][Ee][Mm]    { return CMDLET; }  // new-item
[Nn][Ee][Ww]"-"[Ii][Tt][Ee][Mm][Pp][Rr][Oo][Pp][Ee][Rr][Tt][Yy]    { return CMDLET; }  // new-itemproperty
[Nn][Ee][Ww]"-"[Oo][Bb][Jj][Ee][Cc][Tt]    { return CMDLET; }  // new-object
[Nn][Ee][Ww]"-"[Pp][Ss][Dd][Rr][Ii][Vv][Ee]    { return CMDLET; }  // new-psdrive
[Nn][Ee][Ww]"-"[Ss][Ee][Rr][Vv][Ii][Cc][Ee]    { return CMDLET; }  // new-service
[Nn][Ee][Ww]"-"[Tt][Ii][Mm][Ee][Ss][Pp][Aa][Nn]    { return CMDLET; }  // new-timespan
[Nn][Ee][Ww]"-"[Vv][Aa][Rr][Ii][Aa][Bb][Ll][Ee]    { return CMDLET; }  // new-variable
[Oo][Uu][Tt]"-"[Dd][Ee][Ff][Aa][Uu][Ll][Tt]    { return CMDLET; }  // out-default
[Oo][Uu][Tt]"-"[Ff][Ii][Ll][Ee]    { return CMDLET; }  // out-file
[Oo][Uu][Tt]"-"[Hh][Oo][Ss][Tt]    { return CMDLET; }  // out-host
[Oo][Uu][Tt]"-"[Nn][Uu][Ll][Ll]    { return CMDLET; }  // out-null
[Oo][Uu][Tt]"-"[Pp][Rr][Ii][Nn][Tt][Ee][Rr]    { return CMDLET; }  // out-printer
[Oo][Uu][Tt]"-"[Ss][Tt][Rr][Ii][Nn][Gg]    { return CMDLET; }  // out-string
[Pp][Oo][Pp]"-"[Ll][Oo][Cc][Aa][Tt][Ii][Oo][Nn]    { return CMDLET; }  // pop-location
[Pp][Uu][Ss][Hh]"-"[Ll][Oo][Cc][Aa][Tt][Ii][Oo][Nn]    { return CMDLET; }  // push-location
[Rr][Ee][Aa][Dd]"-"[Hh][Oo][Ss][Tt]    { return CMDLET; }  // read-host
[Rr][Ee][Mm][Oo][Vv][Ee]"-"[Ii][Tt][Ee][Mm]    { return CMDLET; }  // remove-item
[Rr][Ee][Mm][Oo][Vv][Ee]"-"[Ii][Tt][Ee][Mm][Pp][Rr][Oo][Pp][Ee][Rr][Tt][Yy]    { return CMDLET; }  // remove-itemproperty
[Rr][Ee][Mm][Oo][Vv][Ee]"-"[Pp][Ss][Dd][Rr][Ii][Vv][Ee]    { return CMDLET; }  // remove-psdrive
[Rr][Ee][Mm][Oo][Vv][Ee]"-"[Pp][Ss][Ss][Nn][Aa][Pp][Ii][Nn]    { return CMDLET; }  // remove-pssnapin
[Rr][Ee][Mm][Oo][Vv][Ee]"-"[Vv][Aa][Rr][Ii][Aa][Bb][Ll][Ee]    { return CMDLET; }  // remove-variable
[Rr][Ee][Nn][Aa][Mm][Ee]"-"[Ii][Tt][Ee][Mm]    { return CMDLET; }  // rename-item
[Rr][Ee][Nn][Aa][Mm][Ee]"-"[Ii][Tt][Ee][Mm][Pp][Rr][Oo][Pp][Ee][Rr][Tt][Yy]    { return CMDLET; }  // rename-itemproperty
[Rr][Ee][Ss][Oo][Ll][Vv][Ee]"-"[Pp][Aa][Tt][Hh]    { return CMDLET; }  // resolve-path
[Rr][Ee][Ss][Tt][Aa][Rr][Tt]"-"[Ss][Ee][Rr][Vv][Ii][Cc][Ee]    { return CMDLET; }  // restart-service
[Rr][Ee][Ss][Uu][Mm][Ee]"-"[Ss][Ee][Rr][Vv][Ii][Cc][Ee]    { return CMDLET; }  // resume-service
[Ss][Ee][Ll][Ee][Cc][Tt]"-"[Oo][Bb][Jj][Ee][Cc][Tt]    { return CMDLET; }  // select-object
[Ss][Ee][Ll][Ee][Cc][Tt]"-"[Ss][Tt][Rr][Ii][Nn][Gg]    { return CMDLET; }  // select-string
[Ss][Ee][Tt]"-"[Aa][Cc][Ll]    { return CMDLET; }  // set-acl
[Ss][Ee][Tt]"-"[Aa][Ll][Ii][Aa][Ss]    { return CMDLET; }  // set-alias
[Ss][Ee][Tt]"-"[Aa][Uu][Tt][Hh][Ee][Nn][Tt][Ii][Cc][Oo][Dd][Ee][Ss][Ii][Gg][Nn][Aa][Tt][Uu][Rr][Ee]    { return CMDLET; }  // set-authenticodesignature
[Ss][Ee][Tt]"-"[Cc][Oo][Nn][Tt][Ee][Nn][Tt]    { return CMDLET; }  // set-content
[Ss][Ee][Tt]"-"[Dd][Aa][Tt][Ee]    { return CMDLET; }  // set-date
[Ss][Ee][Tt]"-"[Ee][Xx][Ee][Cc][Uu][Tt][Ii][Oo][Nn][Pp][Oo][Ll][Ii][Cc][Yy]    { return CMDLET; }  // set-executionpolicy
[Ss][Ee][Tt]"-"[Ii][Tt][Ee][Mm]    { return CMDLET; }  // set-item
[Ss][Ee][Tt]"-"[Ii][Tt][Ee][Mm][Pp][Rr][Oo][Pp][Ee][Rr][Tt][Yy]    { return CMDLET; }  // set-itemproperty
[Ss][Ee][Tt]"-"[Ll][Oo][Cc][Aa][Tt][Ii][Oo][Nn]    { return CMDLET; }  // set-location
[Ss][Ee][Tt]"-"[Pp][Ss][Dd][Ee][Bb][Uu][Gg]    { return CMDLET; }  // set-psdebug
[Ss][Ee][Tt]"-"[Ss][Ee][Rr][Vv][Ii][Cc][Ee]    { return CMDLET; }  // set-service
[Ss][Ee][Tt]"-"[Tt][Rr][Aa][Cc][Ee][Ss][Oo][Uu][Rr][Cc][Ee]    { return CMDLET; }  // set-tracesource
[Ss][Ee][Tt]"-"[Vv][Aa][Rr][Ii][Aa][Bb][Ll][Ee]    { return CMDLET; }  // set-variable
[Ss][Oo][Rr][Tt]"-"[Oo][Bb][Jj][Ee][Cc][Tt]    { return CMDLET; }  // sort-object
[Ss][Pp][Ll][Ii][Tt]"-"[Pp][Aa][Tt][Hh]    { return CMDLET; }  // split-path
[Ss][Tt][Aa][Rr][Tt]"-"[Ss][Ee][Rr][Vv][Ii][Cc][Ee]    { return CMDLET; }  // start-service
[Ss][Tt][Aa][Rr][Tt]"-"[Ss][Ll][Ee][Ee][Pp]    { return CMDLET; }  // start-sleep
[Ss][Tt][Aa][Rr][Tt]"-"[Tt][Rr][Aa][Nn][Ss][Cc][Rr][Ii][Pp][Tt]    { return CMDLET; }  // start-transcript
[Ss][Tt][Oo][Pp]"-"[Pp][Rr][Oo][Cc][Ee][Ss][Ss]    { return CMDLET; }  // stop-process
[Ss][Tt][Oo][Pp]"-"[Ss][Ee][Rr][Vv][Ii][Cc][Ee]    { return CMDLET; }  // stop-service
[Ss][Tt][Oo][Pp]"-"[Tt][Rr][Aa][Nn][Ss][Cc][Rr][Ii][Pp][Tt]    { return CMDLET; }  // stop-transcript
[Ss][Uu][Ss][Pp][Ee][Nn][Dd]"-"[Ss][Ee][Rr][Vv][Ii][Cc][Ee]    { return CMDLET; }  // suspend-service
[Tt][Ee][Ee]"-"[Oo][Bb][Jj][Ee][Cc][Tt]    { return CMDLET; }  // tee-object
[Tt][Ee][Ss][Tt]"-"[Pp][Aa][Tt][Hh]    { return CMDLET; }  // test-path
[Tt][Rr][Aa][Cc][Ee]"-"[Cc][Oo][Mm][Mm][Aa][Nn][Dd]    { return CMDLET; }  // trace-command
[Uu][Pp][Dd][Aa][Tt][Ee]"-"[Ff][Oo][Rr][Mm][Aa][Tt][Dd][Aa][Tt][Aa]    { return CMDLET; }  // update-formatdata
[Uu][Pp][Dd][Aa][Tt][Ee]"-"[Tt][Yy][Pp][Ee][Dd][Aa][Tt][Aa]    { return CMDLET; }  // update-typedata
[Ww][Hh][Ee][Rr][Ee]"-"[Oo][Bb][Jj][Ee][Cc][Tt]    { return CMDLET; }  // where-object
[Ww][Rr][Ii][Tt][Ee]"-"[Dd][Ee][Bb][Uu][Gg]    { return CMDLET; }  // write-debug
[Ww][Rr][Ii][Tt][Ee]"-"[Ee][Rr][Rr][Oo][Rr]    { return CMDLET; }  // write-error
[Ww][Rr][Ii][Tt][Ee]"-"[Hh][Oo][Ss][Tt]    { return CMDLET; }  // write-host
[Ww][Rr][Ii][Tt][Ee]"-"[Oo][Uu][Tt][Pp][Uu][Tt]    { return CMDLET; }  // write-output
[Ww][Rr][Ii][Tt][Ee]"-"[Pp][Rr][Oo][Gg][Rr][Ee][Ss][Ss]    { return CMDLET; }  // write-progress
[Ww][Rr][Ii][Tt][Ee]"-"[Vv][Ee][Rr][Bb][Oo][Ss][Ee]    { return CMDLET; }  // write-verbose
[Ww][Rr][Ii][Tt][Ee]"-"[Ww][Aa][Rr][Nn][Ii][Nn][Gg]    { return CMDLET; }  // write-warning

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////      Aliases      ////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

[Aa][Cc]    { return ALIAS; }  // ac
[Aa][Ss][Nn][Pp]    { return ALIAS; }  // asnp
[Cc][Ll][Cc]    { return ALIAS; }  // clc
[Cc][Ll][Ii]    { return ALIAS; }  // cli
[Cc][Ll][Pp]    { return ALIAS; }  // clp
[Cc][Ll][Vv]    { return ALIAS; }  // clv
[Cc][Pp][Ii]    { return ALIAS; }  // cpi
[Cc][Pp][Pp]    { return ALIAS; }  // cpp
[Cc][Vv][Pp][Aa]    { return ALIAS; }  // cvpa
[Dd][Ii][Ff][Ff]    { return ALIAS; }  // diff
[Ee][Pp][Aa][Ll]    { return ALIAS; }  // epal
[Ee][Pp][Cc][Ss][Vv]    { return ALIAS; }  // epcsv
[Ff][Cc]    { return ALIAS; }  // fc
[Ff][Ll]    { return ALIAS; }  // fl
[Ff][Oo][Rr][Ee][Aa][Cc][Hh]    { return ALIAS; }  // foreach
[Ff][Tt]    { return ALIAS; }  // ft
[Ff][Ww]    { return ALIAS; }  // fw
[Gg][Aa][Ll]    { return ALIAS; }  // gal
[Gg][Cc]    { return ALIAS; }  // gc
[Gg][Cc][Ii]    { return ALIAS; }  // gci
[Gg][Cc][Mm]    { return ALIAS; }  // gcm
[Gg][Dd][Rr]    { return ALIAS; }  // gdr
[Gg][Hh][Yy]    { return ALIAS; }  // ghy
[Gg][Ii]    { return ALIAS; }  // gi
[Gg][Ll]    { return ALIAS; }  // gl
[Gg][Mm]    { return ALIAS; }  // gm
[Gg][Pp]    { return ALIAS; }  // gp
[Gg][Pp][Ss]    { return ALIAS; }  // gps
[Gg][Rr][Oo][Uu][Pp]    { return ALIAS; }  // group
[Gg][Ss][Vv]    { return ALIAS; }  // gsv
[Gg][Ss][Nn][Pp]    { return ALIAS; }  // gsnp
[Gg][Uu]    { return ALIAS; }  // gu
[Gg][Vv]    { return ALIAS; }  // gv
[Gg][Ww][Mm][Ii]    { return ALIAS; }  // gwmi
[Ii][Ee][Xx]    { return ALIAS; }  // iex
[Ii][Hh][Yy]    { return ALIAS; }  // ihy
[Ii][Ii]    { return ALIAS; }  // ii
[Ii][Pp][Aa][Ll]    { return ALIAS; }  // ipal
[Ii][Pp][Cc][Ss][Vv]    { return ALIAS; }  // ipcsv
[Mm][Ii]    { return ALIAS; }  // mi
[Mm][Pp]    { return ALIAS; }  // mp
[Nn][Aa][Ll]    { return ALIAS; }  // nal
[Nn][Dd][Rr]    { return ALIAS; }  // ndr
[Nn][Ii]    { return ALIAS; }  // ni
[Nn][Vv]    { return ALIAS; }  // nv
[Oo][Hh]    { return ALIAS; }  // oh
[Rr][Dd][Rr]    { return ALIAS; }  // rdr
[Rr][Ii]    { return ALIAS; }  // ri
[Rr][Nn][Ii]    { return ALIAS; }  // rni
[Rr][Nn][Pp]    { return ALIAS; }  // rnp
[Rr][Pp]    { return ALIAS; }  // rp
[Rr][Ss][Nn][Pp]    { return ALIAS; }  // rsnp
[Rr][Vv]    { return ALIAS; }  // rv
[Rr][Vv][Pp][Aa]    { return ALIAS; }  // rvpa
[Ss][Aa][Ll]    { return ALIAS; }  // sal
[Ss][Aa][Ss][Vv]    { return ALIAS; }  // sasv
[Ss][Cc]    { return ALIAS; }  // sc
[Ss][Ee][Ll][Ee][Cc][Tt]    { return ALIAS; }  // select
[Ss][Ii]    { return ALIAS; }  // si
[Ss][Ll]    { return ALIAS; }  // sl
[Ss][Ll][Ee][Ee][Pp]    { return ALIAS; }  // sleep
[Ss][Oo][Rr][Tt]    { return ALIAS; }  // sort
[Ss][Pp]    { return ALIAS; }  // sp
[Ss][Pp][Pp][Ss]    { return ALIAS; }  // spps
[Ss][Pp][Ss][Vv]    { return ALIAS; }  // spsv
[Ss][Vv]    { return ALIAS; }  // sv
[Tt][Ee][Ee]    { return ALIAS; }  // tee
[Ww][Hh][Ee][Rr][Ee]    { return ALIAS; }  // where
[Ww][Rr][Ii][Tt][Ee]    { return ALIAS; }  // write
[Cc][Aa][Tt]    { return ALIAS; }  // cat
[Cc][Dd]    { return ALIAS; }  // cd
[Cc][Ll][Ee][Aa][Rr]    { return ALIAS; }  // clear
[Cc][Pp]    { return ALIAS; }  // cp
[Hh]    { return ALIAS; }  // h
[Hh][Ii][Ss][Tt][Oo][Rr][Yy]    { return ALIAS; }  // history
[Kk][Ii][Ll][Ll]    { return ALIAS; }  // kill
[Ll][Pp]    { return ALIAS; }  // lp
[Ll][Ss]    { return ALIAS; }  // ls
[Mm][Oo][Uu][Nn][Tt]    { return ALIAS; }  // mount
[Mm][Vv]    { return ALIAS; }  // mv
[Pp][Oo][Pp][Dd]    { return ALIAS; }  // popd
[Pp][Ss]    { return ALIAS; }  // ps
[Pp][Uu][Ss][Hh][Dd]    { return ALIAS; }  // pushd
[Pp][Ww][Dd]    { return ALIAS; }  // pwd
[Rr]    { return ALIAS; }  // r
[Rr][Mm]    { return ALIAS; }  // rm
[Rr][Mm][Dd][Ii][Rr]    { return ALIAS; }  // rmdir
[Ee][Cc][Hh][Oo]    { return ALIAS; }  // echo
[Cc][Ll][Ss]    { return ALIAS; }  // cls
[Cc][Hh][Dd][Ii][Rr]    { return ALIAS; }  // chdir
[Cc][Oo][Pp][Yy]    { return ALIAS; }  // copy
[Dd][Ee][Ll]    { return ALIAS; }  // del
[Dd][Ii][Rr]    { return ALIAS; }  // dir
[Ee][Rr][Aa][Ss][Ee]    { return ALIAS; }  // erase
[Mm][Oo][Vv][Ee]    { return ALIAS; }  // move
[Rr][Dd]    { return ALIAS; }  // rd
[Rr][Ee][Nn]    { return ALIAS; }  // ren
[Ss][Ee][Tt]    { return ALIAS; }  // set
[Tt][Yy][Pp][Ee]    { return ALIAS; }  // type

// oh no
.               {   return WRONG; }