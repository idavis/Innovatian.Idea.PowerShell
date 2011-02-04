package com.innovatian.idea.powershell.lang.lexer;

import com.intellij.psi.tree.TokenSet;

public interface PsTokenSets extends PsTokenTypes {

    public static TokenSet WHITE_SPACES_SET = TokenSet.create(WS, NEWLINE, NLS);

    public static TokenSet COMMENT_SET = TokenSet.create(ML_COMMENT, SL_COMMENT);

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
            EQ, GE, GT, LT, LE, DOT, COLON,
            MINUS, PLUS, DIV, MULT, EXP, MOD
    );

    TokenSet DOTS = TokenSet.create(DOT);

    public static TokenSet LITERALS_SET = TokenSet.create(NUMBER, STRING_LITERAL, EXPSTRING_LITERAL);

    TokenSet IDENTIFIERS_SET = TokenSet.create(IDENT);
    TokenSet ASSIGNMENT_SET = TokenSet.create(ASSIGN, ASSIGNPLUS, ASSIGNMINUS, ASSIGNMULT, ASSIGNDIV, ASSIGNMOD);
    TokenSet LOGICALOP_SET = TokenSet.create(OPAND, OPOR);
    TokenSet BITWISEOP_SET = TokenSet.create(BWOPAND, BWOPOR);
    TokenSet REDIRECTIONOP_SET = TokenSet.create(ROPOUTFILEOVER, ROPOUTFILAPPEND, ROPERRFILEOVER, ROPERRFILEAPPEND, ROPERRTOSTDOUT);
    TokenSet FUNCTIONDECL_SET = TokenSet.create(FUNCTION, FILTER);

    public static final TokenSet CONSTANTS = TokenSet.create(
            NUMBER,
            STRING_LITERAL,
            EXPSTRING_LITERAL
    );
}
