package com.innovatian.idea.powershell.lang.parser;

import com.innovatian.idea.powershell.lang.lexer.PsElementType;
import com.innovatian.idea.powershell.lang.lexer.PsTokenSets;
import com.innovatian.idea.powershell.lang.lexer.PsTokenTypes;
import com.innovatian.idea.powershell.lang.parser.parsing.ParserUtils;
import com.innovatian.idea.powershell.lang.parser.parsing.statements.expressions.ConditionalExpression;
import com.innovatian.idea.powershell.lang.parser.parsing.statements.expressions.ExpressionStatement;
import com.intellij.lang.ASTNode;
import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiParser;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NotNull;


public class PsParser implements PsiParser, PsElementTypes {
    @NotNull
    public ASTNode parse(IElementType root, PsiBuilder builder) {
        builder.setDebugMode(true);
        //CompilationUnit.parse(builder, this);
        IElementType elementType = builder.getTokenType();
        PsiBuilder.Marker rootMarker = builder.mark();
        while (!builder.eof()) {
            parseSourceElement(builder);
        }
        rootMarker.done(root);
        return builder.getTreeBuilt();
    }

    public void parseBlockBody(PsiBuilder builder) {

        if (PsTokenTypes.SEMI.equals(builder.getTokenType()) || PsTokenTypes.NLS.equals(builder.getTokenType())) {
            Separators.parse(builder);
        }

        boolean result = parseStatement(builder, false);

        while (result &&
                (PsTokenTypes.SEMI.equals(builder.getTokenType()) ||
                        PsTokenTypes.NLS.equals(builder.getTokenType()))) {
            Separators.parse(builder);

            result = parseStatement(builder, false);
        }
        cleanAfterError(builder);
        Separators.parse(builder);
    }

    protected void cleanAfterError(PsiBuilder builder) {
        int i = 0;
        PsiBuilder.Marker em = builder.mark();
        while (!builder.eof() &&
                !(PsTokenTypes.NLS.equals(builder.getTokenType()) ||
                        PsTokenTypes.RCURLY.equals(builder.getTokenType()) ||
                        PsTokenTypes.SEMI.equals(builder.getTokenType()))
                ) {
            builder.advanceLexer();
            i++;
        }
        if (i > 0) {
            em.error("separator.or.rcurly.expected");
        } else {
            em.drop();
        }
    }

    public void parseSourceElement(PsiBuilder builder) {
        if (StringConstructorExpression.parse(builder, this) != WRONGWAY) {
            return;
        }
        if (ExpressionStatement.parse(builder, this)) {
            return;
        }
        if (builder.getTokenType() == PsTokenTypes.ML_COMMENT) {
            builder.advanceLexer();
            builder.advanceLexer();
        } else {
            parseStatement(builder);
        }
    }

    public void parseStatement(PsiBuilder builder) {
        final IElementType firstToken = builder.getTokenType();
        if (PsTokenTypes.IF.equals(firstToken)) {
            parseIfStatement(builder);
            return;
        }
        if (firstToken == null) return;
        builder.advanceLexer();

    }

    public IElementType parse(PsiBuilder builder) {
        if (EXPSTRING_LITERAL == builder.getTokenType()) {
            return StringConstructorExpression.parse(builder, this);
        }
        if (LPAREN == builder.getTokenType()) {
            return parenthesizedExprParse(builder);
        }
        if (LCURLY == builder.getTokenType()) {
            return parseClosableBlock(builder);
        }
        if (PsTokenSets.CONSTANTS.contains(builder.getTokenType())) {
            ParserUtils.eatElement(builder, LITERAL);
            return LITERAL;
        }
        return WRONGWAY;
    }

    public PsElementType parenthesizedExprParse(PsiBuilder builder) {
        PsiBuilder.Marker marker = builder.mark();
        ParserUtils.getToken(builder, LPAREN);
        if (!AssignmentExpression.parse(builder, this)) {
            builder.error("expression.expected");
        }
        ParserUtils.getToken(builder, NLS);
        if (!ParserUtils.getToken(builder, RPAREN, "rparen.expected")) {
            while (!builder.eof() && NLS != builder.getTokenType() && SEMI != builder.getTokenType() && RPAREN != builder.getTokenType()) {
                builder.error("rparen.expected");
                builder.advanceLexer();
            }
            ParserUtils.getToken(builder, RPAREN);
        }
        marker.done(PARENTHESIZED_EXPRESSION);
        return PARENTHESIZED_EXPRESSION;
    }

    public boolean parseIfStatement(PsiBuilder builder) {
        //allow error messages
        PsiBuilder.Marker ifStmtMarker = builder.mark();

        if (!ParserUtils.getToken(builder, PsTokenTypes.IF)) {
            ifStmtMarker.rollbackTo();
            builder.error("if.expected");
            return false;
        }

        if (!ParserUtils.getToken(builder, PsTokenTypes.LPAREN, "lparen.expected")) {
//      ifStmtMarker.done(IF_STATEMENT);
//      return IF_STATEMENT;
            ifStmtMarker.drop();
            return false;
        }

        if (!ConditionalExpression.parse(builder, this)) {
            builder.error("expression.expected");
        }

        ParserUtils.getToken(builder, PsTokenTypes.NLS);

        if (!ParserUtils.getToken(builder, PsTokenTypes.RPAREN, "rparen.expected")) {
            while (!builder.eof()) {
                final IElementType type = builder.getTokenType();
                if (PsTokenTypes.NLS == type || PsTokenTypes.RPAREN == type ||
                        PsTokenTypes.LCURLY == type || PsTokenTypes.RCURLY == type) {
                    break;
                }

                builder.advanceLexer();
                builder.error("rparen.expected");
            }
            if (!ParserUtils.getToken(builder, PsTokenTypes.RPAREN)) {
                ifStmtMarker.done(PsElementTypes.IF_STATEMENT);
                return true;
            }
        }

        PsiBuilder.Marker warn = builder.mark();
        if (builder.getTokenType() == PsTokenTypes.NLS) {
            ParserUtils.getToken(builder, PsTokenTypes.NLS);
        }

        if (!parseStatement(builder, true)) {
            warn.rollbackTo();
            builder.error("expression.expected");
            ifStmtMarker.done(PsElementTypes.IF_STATEMENT);
            return true;
        } else {
            warn.drop();
        }

        PsiBuilder.Marker rb = builder.mark();
        if (PsTokenTypes.ELSE.equals(builder.getTokenType()) ||
                (Separators.parse(builder) &&
                        builder.getTokenType() == PsTokenTypes.ELSE)) {
            rb.drop();
            ParserUtils.getToken(builder, PsTokenTypes.ELSE);

            warn = builder.mark();
            if (builder.getTokenType() == PsTokenTypes.NLS) {
                ParserUtils.getToken(builder, PsTokenTypes.NLS);
            }

            if (!parseStatement(builder, true)) {
                warn.rollbackTo();
                builder.error("expression.expected");
                ifStmtMarker.done(PsElementTypes.IF_STATEMENT);
                return true;
            } else {
                warn.drop();
            }

            ifStmtMarker.done(PsElementTypes.IF_STATEMENT);
            return true;

        } else {
            rb.rollbackTo();
            ifStmtMarker.done(PsElementTypes.IF_STATEMENT);
            return true;
        }
    }

    public boolean parseStatement(PsiBuilder builder, boolean isBlockStatementNeeded) {
        if (isBlockStatementNeeded && PsTokenTypes.LCURLY.equals(builder.getTokenType())) {
            return parseBlockStatement(builder);
        }


        if (PsTokenTypes.IF.equals(builder.getTokenType())) {
            return parseIfStatement(builder);
        }
        /*
if (PsTokenTypes.SWITCH.equals(builder.getTokenType())) {
  return SwitchStatement.parse(builder, this);
}
if (PsTokenTypes.TRY.equals(builder.getTokenType())) {
  return TryCatchStatement.parse(builder, this);
}
if (PsTokenTypes.WHILE.equals(builder.getTokenType())) {
  return parseWhileStatement(builder);
}
if (PsTokenTypes.FOR.equals(builder.getTokenType())) {
  return parseForStatement(builder);
}
        */

        // Possible errors
        if (PsTokenTypes.ELSE.equals(builder.getTokenType())) {
            ParserUtils.wrapError(builder, "else.without.if");
            parseStatement(builder, true);
            return true;
        }
        if (PsTokenTypes.CATCH.equals(builder.getTokenType())) {
            ParserUtils.wrapError(builder, "catch.without.try");
            parseStatement(builder, false);
            return true;
        }
        if (PsTokenTypes.FINALLY.equals(builder.getTokenType())) {
            ParserUtils.wrapError(builder, "finally.without.try");
            parseStatement(builder, false);
            return true;
        }
        if (PsTokenTypes.IDENT.equals(builder.getTokenType())) {
            ParserUtils.wrapError(builder, "identifier.expected");
            parseStatement(builder, false);
            return true;
        }
        /*if (PsTokenTypes.CASE.equals(builder.getTokenType())) {
           // case statements in powershell are literals
         PsiBuilder.Marker marker = builder.mark();
         SwitchStatement.parseCaseLabel(builder, this);
         marker.error(GroovyBundle.message("case.without.switch"));
         parseStatement(builder, false);
         return true;
       } */


        return false;

    }

    public boolean parseOpenBlock(PsiBuilder builder) {
        return parseOpenBlockInDifferentContext(builder, false);
    }


    public boolean parseBlockStatement(PsiBuilder builder) {
        return parseOpenBlockInDifferentContext(builder, true);
    }

    public boolean parseOpenBlockInDifferentContext(PsiBuilder builder, boolean isBlockStatement) {
        PsiBuilder.Marker blockStatementMarker = builder.mark();
        PsiBuilder.Marker marker = builder.mark();
        if (!ParserUtils.getToken(builder, LCURLY)) {
            marker.drop();
            blockStatementMarker.drop();
            return false;
        }
        ParserUtils.getToken(builder, NLS);
        parseBlockBody(builder);
        while (!builder.eof() &&
                !RCURLY.equals(builder.getTokenType())) {
            builder.error("expression.expected");
            builder.advanceLexer();
        }
        ParserUtils.getToken(builder, RCURLY, "rcurly.expected");
        marker.done(OPEN_BLOCK);
        if (isBlockStatement) {
            blockStatementMarker.done(BLOCK_STATEMENT);
        } else {
            blockStatementMarker.drop();
        }
        return true;
    }

    public PsElementType parseClosableBlock(PsiBuilder builder) {
        PsiBuilder.Marker marker = builder.mark();
        if (!ParserUtils.getToken(builder, LCURLY)) {
            marker.drop();
            return WRONGWAY;
        }
        ParserUtils.getToken(builder, NLS);
        parseBlockBody(builder);
        ParserUtils.getToken(builder, RCURLY, "rcurly.expected");
        marker.done(CLOSABLE_BLOCK);
        return CLOSABLE_BLOCK;
    }
}
