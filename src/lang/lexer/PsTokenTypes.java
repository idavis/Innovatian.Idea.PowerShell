package com.innovatian.idea.powershell.lang.lexer;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.tree.TokenSet;

public interface PsTokenTypes {
    IElementType WRONG = new PsElementType("wrong token");
    IElementType LITERAL = new PsElementType("Literal");

    /* **************************************************************************************************
   *  Whitespaces & NewLines
   * ****************************************************************************************************/

    IElementType WS = new PsElementType("white space");
    IElementType NEWLINE = new PsElementType("new line");
    IElementType NLS = new PsElementType("new line spaces");

    /* **************************************************************************************************
   *  Comments
   * ****************************************************************************************************/

    IElementType SL_COMMENT = new PsElementType("line comment");
    IElementType ML_COMMENT = new PsElementType("block comment");

    /* **************************************************************************************************
   *  Identifiers
   * ****************************************************************************************************/

    IElementType IDENT = new PsElementType("identifier");
    IElementType IDENT_NOBUCKS = new PsElementType("identifier");

    /* **************************************************************************************************
   *  Integers & floats
   * ****************************************************************************************************/

    IElementType NUMBER = new PsElementType("number");

    /* **************************************************************************************************
   *  Strings & regular expressions
   * ****************************************************************************************************/

    IElementType STRING_LITERAL = new PsElementType("string");
    IElementType EXPSTRING_LITERAL = new PsElementType("string");
    TokenSet STRING_LITERAL_SET = TokenSet.create(STRING_LITERAL, EXPSTRING_LITERAL);
    IElementType PSSTRING_INJECTION = new PsElementType("PsString injection");
    IElementType UNTERMINATED_STRING = new PsElementType("unterminated string");
    IElementType EXPSTRING_BEGIN = new PsElementType("PsString begin");
    IElementType EXPSTRING_CONTENT = new PsElementType("PsString content");
    IElementType EXPSTRING_END = new PsElementType("PsString end");

    /* **************************************************************************************************
   *  Common tokens: operators, braces etc.
   * ****************************************************************************************************/

    IElementType DIV = new PsElementType("/");
    IElementType MULT = new PsElementType("*");
    IElementType LPAREN = new PsElementType("(");
    IElementType RPAREN = new PsElementType(")");
    IElementType LBRACK = new PsElementType("[");
    IElementType RBRACK = new PsElementType("]");
    IElementType LCURLY = new PsElementType("{");
    IElementType RCURLY = new PsElementType("}");
    IElementType COLON = new PsElementType(":");
    IElementType COMMA = new PsElementType(",");
    IElementType DOT = new PsElementType(".");
    IElementType SEMI = new PsElementType(";");
    IElementType EQ = new PsElementType("==");

    IElementType PLUS = new PsElementType("+");
    IElementType MINUS = new PsElementType("-");
    IElementType GE = new PsElementType(">=");
    IElementType GT = new PsElementType(">");
    IElementType EXP = new PsElementType("^");
    IElementType LE = new PsElementType("<=");
    IElementType LT = new PsElementType("<");
    IElementType ELLIPSIS = new PsElementType("...");
    IElementType RANGE = new PsElementType("..");
    IElementType GETN = new PsElementType("#");
    IElementType MOD = new PsElementType("%");

    IElementType DOLLAR = new PsElementType("$");

    /* **************************************************************************************************
   * assignment operators
   * ****************************************************************************************************/

    IElementType ASSIGN = new PsElementType("=");
    IElementType ASSIGNPLUS = new PsElementType("+=");
    IElementType ASSIGNMINUS = new PsElementType("-=");
    IElementType ASSIGNMULT = new PsElementType("*=");
    IElementType ASSIGNDIV = new PsElementType("/=");
    IElementType ASSIGNMOD = new PsElementType("%=");

    /* **************************************************************************************************
   * logical operators
   * ****************************************************************************************************/

    IElementType OPAND = new PsElementType("-and");
    IElementType OPOR = new PsElementType("-or");

    /* **************************************************************************************************
   * bitwise operators
   * ****************************************************************************************************/

    IElementType BWOPAND = new PsElementType("-band");
    IElementType BWOPOR = new PsElementType("-bor");

    /* **************************************************************************************************
   * redirection operators "2>&1" | ">>" | ">" | "<<" | "<" | ">|" | "2>" | "2>>" | "1>>"
   * ****************************************************************************************************/

    IElementType ROPOUTFILEOVER = new PsElementType(">");
    IElementType ROPOUTFILAPPEND = new PsElementType(">>");
    IElementType ROPERRFILEOVER = new PsElementType("2>");
    IElementType ROPERRFILEAPPEND = new PsElementType("2>>");
    IElementType ROPERRTOSTDOUT = new PsElementType("2>&1");
    /* missing   "<<" | "<" | ">|" | "1>>" */

    /* **************************************************************************************************
   *  Comparison Operator Token
   * ****************************************************************************************************/

    IElementType COEQ = new PsElementType("-eq");
    IElementType CONE = new PsElementType("-ne");
    IElementType COGE = new PsElementType("-ge");
    IElementType COGT = new PsElementType("-gt");
    IElementType COLT = new PsElementType("-lt");
    IElementType COLE = new PsElementType("-le");
    IElementType COIEQ = new PsElementType("-ieq");
    IElementType COINE = new PsElementType("-ine");
    IElementType COIGE = new PsElementType("-ige");
    IElementType COIGT = new PsElementType("-igt");
    IElementType COILT = new PsElementType("-ilt");
    IElementType COILE = new PsElementType("-ile");
    IElementType COCEQ = new PsElementType("-ceq");
    IElementType COCNE = new PsElementType("-cne");
    IElementType COCGE = new PsElementType("-cge");
    IElementType COCGT = new PsElementType("-cgt");
    IElementType COCLT = new PsElementType("-clt");
    IElementType COCLE = new PsElementType("-cle");
    IElementType COLIKE = new PsElementType("-like");
    IElementType CONOTLIKE = new PsElementType("-notlike");
    IElementType COMATCH = new PsElementType("-match");
    IElementType CONOTMATCH = new PsElementType("-notmatch");
    IElementType COILIKE = new PsElementType("-ilike");
    IElementType COINOTLIKE = new PsElementType("-inotlike");
    IElementType COIMATCH = new PsElementType("-imatch");
    IElementType COINOTMATCH = new PsElementType("-inotmatch");
    IElementType COCLIKE = new PsElementType("-clike");
    IElementType COCNOTLIKE = new PsElementType("-cnotlike");
    IElementType COCMATCH = new PsElementType("-cmatch");
    IElementType COCNOTMATCH = new PsElementType("-cnotmatch");
    IElementType COCONTAINS = new PsElementType("-contains");
    IElementType CONOTCONTAINS = new PsElementType("-notcontains");
    IElementType COICONTAINS = new PsElementType("-icontains");
    IElementType COINOTCONTAINS = new PsElementType("-inotcontains");
    IElementType COCCONTAINS = new PsElementType("-ccontains");
    IElementType COCNOTCONTAINS = new PsElementType("-cnotcontains");
    IElementType COISNOT = new PsElementType("-isnot");
    IElementType COIS = new PsElementType("-is");
    IElementType COAS = new PsElementType("-as");
    IElementType COREPLACE = new PsElementType("-replace");
    IElementType COIREPLACE = new PsElementType("-ireplace");
    IElementType COCREPLACE = new PsElementType("-creplace");

    /* **************************************************************************************************
   *  Keywords
   * ****************************************************************************************************/

    IElementType BEGIN = new PsElementType("begin");
    IElementType BREAK = new PsElementType("break");
    IElementType CATCH = new PsElementType("catch");
    IElementType CONTINUE = new PsElementType("continue");
    IElementType DATA = new PsElementType("data");
    IElementType DO = new PsElementType("do");
    IElementType DYNAMICPARAM = new PsElementType("dynamicparam");
    IElementType ELSE = new PsElementType("else");
    IElementType ELSEIF = new PsElementType("elseif");
    IElementType END = new PsElementType("end");
    IElementType EXIT = new PsElementType("exit");
    IElementType FILTER = new PsElementType("filter");
    IElementType FINALLY = new PsElementType("finally");
    IElementType FOR = new PsElementType("for");
    IElementType FOREACH = new PsElementType("foreach");
    IElementType FROM = new PsElementType("from");
    IElementType FUNCTION = new PsElementType("function");
    IElementType IF = new PsElementType("if");
    IElementType IN = new PsElementType("in");
    IElementType PARAM = new PsElementType("param");
    IElementType PROCESS = new PsElementType("process");
    IElementType RETURN = new PsElementType("return");
    IElementType SWITCH = new PsElementType("switch");
    IElementType THROW = new PsElementType("throw");
    IElementType TRAP = new PsElementType("trap");
    IElementType TRY = new PsElementType("try");
    IElementType UNTIL = new PsElementType("until");
    IElementType WHILE = new PsElementType("while");
}