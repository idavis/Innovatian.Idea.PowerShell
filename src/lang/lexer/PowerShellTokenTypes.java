package com.innovatian.idea.powershell.lang.lexer;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.tree.TokenSet;

public interface PowerShellTokenTypes {
    IElementType WRONG = new PsElementType("wrong token");


    /* **************************************************************************************************
   *  Whitespaces & NewLines
   * ****************************************************************************************************/

    IElementType WS = new PsElementType("white space");
    IElementType NEWLINE = new PsElementType("new line");
    IElementType NLS = new PsElementType("new line spaces");

    TokenSet WHITE_SPACES_SET = TokenSet.create(WS, NEWLINE, NLS);

    /* **************************************************************************************************
   *  Comments
   * ****************************************************************************************************/

    IElementType SH_COMMENT = new PsElementType("shell comment");
    IElementType SL_COMMENT = new PsElementType("line comment");
    IElementType ML_COMMENT = new PsElementType("block comment");
    TokenSet COMMENT_SET = TokenSet.create(ML_COMMENT, SH_COMMENT, SL_COMMENT);

    /* **************************************************************************************************
   *  Identifiers
   * ****************************************************************************************************/

    IElementType NAME = new PsElementType("identifier");

    /* **************************************************************************************************
   *  Integers & floats
   * ****************************************************************************************************/

    IElementType NUMBER = new PsElementType("number");

    /* **************************************************************************************************
   *  Strings & regular expressions
   * ****************************************************************************************************/

    IElementType STRING = new PsElementType("string");
    IElementType LONGSTRING = new PsElementType("long string");

    IElementType LONGSTRING_BEGIN = new PsElementType("long string start bracket");
    IElementType LONGSTRING_END = new PsElementType("long string end bracket");
    TokenSet STRING_LITERAL_SET = TokenSet.create(STRING, LONGSTRING, LONGSTRING_BEGIN, LONGSTRING_END);


    IElementType UNTERMINATED_STRING = new PsElementType("unterminated string");


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
    IElementType ASSIGN = new PsElementType("=");
    IElementType SEMI = new PsElementType(";");
    IElementType EQ = new PsElementType("==");
    IElementType NE = new PsElementType("~=");
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

    TokenSet COMPARISONOPS = TokenSet.create(
            COEQ,
            CONE,
            COGE,
            COGT,
            COLT,
            COLE,
            COIEQ,
            COINE,
            COIGE,
            COIGT,
            COILT,
            COILE,
            COCEQ,
            COCNE,
            COCGE,
            COCGT,
            COCLT,
            COCLE,
            COLIKE,
            CONOTLIKE,
            COMATCH,
            CONOTMATCH,
            COILIKE,
            COINOTLIKE,
            COIMATCH,
            COINOTMATCH,
            COCLIKE,
            COCNOTLIKE,
            COCMATCH,
            COCNOTMATCH,
            COCONTAINS,
            CONOTCONTAINS,
            COICONTAINS,
            COINOTCONTAINS,
            COCCONTAINS,
            COCNOTCONTAINS,
            COISNOT,
            COIS,
            COAS,
            COREPLACE,
            COIREPLACE,
            COCREPLACE
    );


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

    TokenSet KEYWORDS = TokenSet.create(
            BEGIN, BREAK, CATCH, CONTINUE, DATA, DO, DYNAMICPARAM, ELSE, ELSEIF, END, EXIT, FILTER, FINALLY,
            FOR, FOREACH, FROM, FUNCTION, IF, IN, PARAM, PROCESS, RETURN, SWITCH, THROW, TRAP, TRY, UNTIL, WHILE
    );

    TokenSet BRACES = TokenSet.create(LCURLY, RCURLY);
    TokenSet PARENS = TokenSet.create(LPAREN, RPAREN);
    TokenSet BRACKS = TokenSet.create(LBRACK, RBRACK);

    TokenSet BAD_INPUT = TokenSet.create(WRONG, UNTERMINATED_STRING);

    TokenSet UNARY_OP_SET = TokenSet.create(MINUS, GETN);

    TokenSet BINARY_OP_SET = TokenSet.create(
            EQ, GE, GT, LT, LE, NE, DOT, COLON,
            MINUS, PLUS, DIV, MULT, EXP, MOD
    );

    TokenSet DOTS = TokenSet.create(DOT);

    TokenSet LITERALS_SET = TokenSet.create(NUMBER, STRING, LONGSTRING, LONGSTRING_BEGIN, LONGSTRING_END);

    TokenSet IDENTIFIERS_SET = TokenSet.create(NAME);
}
