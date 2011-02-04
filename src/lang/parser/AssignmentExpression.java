package com.innovatian.idea.powershell.lang.parser;

import com.innovatian.idea.powershell.lang.parser.parsing.ParserUtils;
import com.innovatian.idea.powershell.lang.parser.parsing.statements.expressions.ConditionalExpression;
import com.innovatian.idea.powershell.lang.parser.parsing.statements.expressions.ExpressionStatement;
import com.intellij.lang.PsiBuilder;
import com.intellij.psi.tree.TokenSet;

public class AssignmentExpression implements PsElementTypes {

    private static final TokenSet ASSIGNMENTS = TokenSet.create(
            ASSIGN,
            ASSIGNPLUS,
            ASSIGNMINUS,
            ASSIGNMULT,
            ASSIGNDIV,
            ASSIGNMOD
    );

    public static boolean parse(PsiBuilder builder, PsParser parser) {
        return parse(builder, parser, false);
    }

    public static boolean parse(PsiBuilder builder, PsParser parser, boolean comExprAllowed) {
        PsiBuilder.Marker marker = builder.mark();
        if (parseSide(builder, parser, comExprAllowed)) {
            if (ParserUtils.getToken(builder, ASSIGNMENTS)) {
                ParserUtils.getToken(builder, NLS);
                if (!parse(builder, parser, comExprAllowed)) {
                    builder.error("expression.expected");
                }
                marker.done(ASSIGNMENT_EXPRESSION);
            } else {
                marker.drop();
            }
            return true;
        } else {
            marker.drop();
            return false;
        }
    }

    private static boolean parseSide(PsiBuilder builder, PsParser parser, boolean comExprAllowed) {

        if (comExprAllowed) {
            PsiBuilder.Marker marker = builder.mark();
            if (ExpressionStatement.parse(builder, parser)) {
                marker.drop();
                return true;
            } else {
                marker.rollbackTo();
            }
        }
        return ConditionalExpression.parse(builder, parser);
    }
}
