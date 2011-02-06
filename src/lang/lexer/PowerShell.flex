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

{IDENT}        { return IDENT;}
 
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
//"$__"        { return IMPLICITVAR; } // having trouble with this.
"$$"         { return LASTTOKEN; }
"$" [^_$]          { return DOLLAR;  }

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

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////      Commandlets      ////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
"add-content"    { return CMDLET; }
"add-history"    { return CMDLET; }
"add-member"    { return CMDLET; }
"add-pssnapin"    { return CMDLET; }
"clear-content"    { return CMDLET; }
"clear-item"    { return CMDLET; }
"clear-itemproperty"    { return CMDLET; }
"clear-variable"    { return CMDLET; }
"compare-object"    { return CMDLET; }
"convertfrom-securestring"    { return CMDLET; }
"convert-path"    { return CMDLET; }
"convertto-html"    { return CMDLET; }
"convertto-securestring"    { return CMDLET; }
"copy-item"    { return CMDLET; }
"copy-itemproperty"    { return CMDLET; }
"export-alias"    { return CMDLET; }
"export-clixml"    { return CMDLET; }
"export-console"    { return CMDLET; }
"export-csv"    { return CMDLET; }
"foreach-object"    { return CMDLET; }
"format-custom"    { return CMDLET; }
"format-list"    { return CMDLET; }
"format-table"    { return CMDLET; }
"format-wide"    { return CMDLET; }
"get-acl"    { return CMDLET; }
"get-alias"    { return CMDLET; }
"get-authenticodesignature"    { return CMDLET; }
"get-childitem"    { return CMDLET; }
"get-command"    { return CMDLET; }
"get-content"    { return CMDLET; }
"get-credential"    { return CMDLET; }
"get-culture"    { return CMDLET; }
"get-date"    { return CMDLET; }
"get-eventlog"    { return CMDLET; }
"get-executionpolicy"    { return CMDLET; }
"get-help"    { return CMDLET; }
"get-history"    { return CMDLET; }
"get-host"    { return CMDLET; }
"get-item"    { return CMDLET; }
"get-itemproperty"    { return CMDLET; }
"get-location"    { return CMDLET; }
"get-member"    { return CMDLET; }
"get-pfxcertificate"    { return CMDLET; }
"get-process"    { return CMDLET; }
"get-psdrive"    { return CMDLET; }
"get-psprovider"    { return CMDLET; }
"get-pssnapin"    { return CMDLET; }
"get-service"    { return CMDLET; }
"get-tracesource"    { return CMDLET; }
"get-uiculture"    { return CMDLET; }
"get-unique"    { return CMDLET; }
"get-variable"    { return CMDLET; }
"get-wmiobject"    { return CMDLET; }
"group-object"    { return CMDLET; }
"import-alias"    { return CMDLET; }
"import-clixml"    { return CMDLET; }
"import-csv"    { return CMDLET; }
"invoke-expression"    { return CMDLET; }
"invoke-history"    { return CMDLET; }
"invoke-item"    { return CMDLET; }
"join-path"    { return CMDLET; }
"measure-command"    { return CMDLET; }
"measure-object"    { return CMDLET; }
"move-item"    { return CMDLET; }
"move-itemproperty"    { return CMDLET; }
"new-alias"    { return CMDLET; }
"new-item"    { return CMDLET; }
"new-itemproperty"    { return CMDLET; }
"new-object"    { return CMDLET; }
"new-psdrive"    { return CMDLET; }
"new-service"    { return CMDLET; }
"new-timespan"    { return CMDLET; }
"new-variable"    { return CMDLET; }
"out-default"    { return CMDLET; }
"out-file"    { return CMDLET; }
"out-host"    { return CMDLET; }
"out-null"    { return CMDLET; }
"out-printer"    { return CMDLET; }
"out-string"    { return CMDLET; }
"pop-location"    { return CMDLET; }
"push-location"    { return CMDLET; }
"read-host"    { return CMDLET; }
"remove-item"    { return CMDLET; }
"remove-itemproperty"    { return CMDLET; }
"remove-psdrive"    { return CMDLET; }
"remove-pssnapin"    { return CMDLET; }
"remove-variable"    { return CMDLET; }
"rename-item"    { return CMDLET; }
"rename-itemproperty"    { return CMDLET; }
"resolve-path"    { return CMDLET; }
"restart-service"    { return CMDLET; }
"resume-service"    { return CMDLET; }
"select-object"    { return CMDLET; }
"select-string"    { return CMDLET; }
"set-acl"    { return CMDLET; }
"set-alias"    { return CMDLET; }
"set-authenticodesignature"    { return CMDLET; }
"set-content"    { return CMDLET; }
"set-date"    { return CMDLET; }
"set-executionpolicy"    { return CMDLET; }
"set-item"    { return CMDLET; }
"set-itemproperty"    { return CMDLET; }
"set-location"    { return CMDLET; }
"set-psdebug"    { return CMDLET; }
"set-service"    { return CMDLET; }
"set-tracesource"    { return CMDLET; }
"set-variable"    { return CMDLET; }
"sort-object"    { return CMDLET; }
"split-path"    { return CMDLET; }
"start-service"    { return CMDLET; }
"start-sleep"    { return CMDLET; }
"start-transcript"    { return CMDLET; }
"stop-process"    { return CMDLET; }
"stop-service"    { return CMDLET; }
"stop-transcript"    { return CMDLET; }
"suspend-service"    { return CMDLET; }
"tee-object"    { return CMDLET; }
"test-path"    { return CMDLET; }
"trace-command"    { return CMDLET; }
"update-formatdata"    { return CMDLET; }
"update-typedata"    { return CMDLET; }
"where-object"    { return CMDLET; }
"write-debug"    { return CMDLET; }
"write-error"    { return CMDLET; }
"write-host"    { return CMDLET; }
"write-output"    { return CMDLET; }
"write-progress"    { return CMDLET; }
"write-verbose"    { return CMDLET; }
"write-warning"    { return CMDLET; }

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////      Aliases      ////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

"ac"    { return ALIAS; }
"asnp"    { return ALIAS; }
"clc"    { return ALIAS; }
"cli"    { return ALIAS; }
"clp"    { return ALIAS; }
"clv"    { return ALIAS; }
"cpi"    { return ALIAS; }
"cpp"    { return ALIAS; }
"cvpa"    { return ALIAS; }
"diff"    { return ALIAS; }
"epal"    { return ALIAS; }
"epcsv"    { return ALIAS; }
"fc"    { return ALIAS; }
"fl"    { return ALIAS; }
"foreach"    { return ALIAS; }
"ft"    { return ALIAS; }
"fw"    { return ALIAS; }
"gal"    { return ALIAS; }
"gc"    { return ALIAS; }
"gci"    { return ALIAS; }
"gcm"    { return ALIAS; }
"gdr"    { return ALIAS; }
"ghy"    { return ALIAS; }
"gi"    { return ALIAS; }
"gl"    { return ALIAS; }
"gm"    { return ALIAS; }
"gp"    { return ALIAS; }
"gps"    { return ALIAS; }
"group"    { return ALIAS; }
"gsv"    { return ALIAS; }
"gsnp"    { return ALIAS; }
"gu"    { return ALIAS; }
"gv"    { return ALIAS; }
"gwmi"    { return ALIAS; }
"iex"    { return ALIAS; }
"ihy"    { return ALIAS; }
"ii"    { return ALIAS; }
"ipal"    { return ALIAS; }
"ipcsv"    { return ALIAS; }
"mi"    { return ALIAS; }
"mp"    { return ALIAS; }
"nal"    { return ALIAS; }
"ndr"    { return ALIAS; }
"ni"    { return ALIAS; }
"nv"    { return ALIAS; }
"oh"    { return ALIAS; }
"rdr"    { return ALIAS; }
"ri"    { return ALIAS; }
"rni"    { return ALIAS; }
"rnp"    { return ALIAS; }
"rp"    { return ALIAS; }
"rsnp"    { return ALIAS; }
"rv"    { return ALIAS; }
"rvpa"    { return ALIAS; }
"sal"    { return ALIAS; }
"sasv"    { return ALIAS; }
"sc"    { return ALIAS; }
"select"    { return ALIAS; }
"si"    { return ALIAS; }
"sl"    { return ALIAS; }
"sleep"    { return ALIAS; }
"sort"    { return ALIAS; }
"sp"    { return ALIAS; }
"spps"    { return ALIAS; }
"spsv"    { return ALIAS; }
"sv"    { return ALIAS; }
"tee"    { return ALIAS; }
"where"    { return ALIAS; }
"write"    { return ALIAS; }
"cat"    { return ALIAS; }
"cd"    { return ALIAS; }
"clear"    { return ALIAS; }
"cp"    { return ALIAS; }
"h"    { return ALIAS; }
"history"    { return ALIAS; }
"kill"    { return ALIAS; }
"lp"    { return ALIAS; }
"ls"    { return ALIAS; }
"mount"    { return ALIAS; }
"mv"    { return ALIAS; }
"popd"    { return ALIAS; }
"ps"    { return ALIAS; }
"pushd"    { return ALIAS; }
"pwd"    { return ALIAS; }
"r"    { return ALIAS; }
"rm"    { return ALIAS; }
"rmdir"    { return ALIAS; }
"echo"    { return ALIAS; }
"cls"    { return ALIAS; }
"chdir"    { return ALIAS; }
"copy"    { return ALIAS; }
"del"    { return ALIAS; }
"dir"    { return ALIAS; }
"erase"    { return ALIAS; }
"move"    { return ALIAS; }
"rd"    { return ALIAS; }
"ren"    { return ALIAS; }
"set"    { return ALIAS; }
"type"    { return ALIAS; }

// oh no
.               {   return WRONG; }