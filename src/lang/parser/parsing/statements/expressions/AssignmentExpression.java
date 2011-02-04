package com.innovatian.idea.powershell.lang.parser.parsing.statements.expressions;

import com.innovatian.idea.powershell.lang.lexer.PsTokenSets;
import com.innovatian.idea.powershell.lang.parser.PsElementTypes;
import com.innovatian.idea.powershell.lang.parser.PsParser;
import com.innovatian.idea.powershell.lang.parser.parsing.ParserUtils;
import com.intellij.lang.PsiBuilder;

public class AssignmentExpression implements PsElementTypes {
    public static boolean parse(PsiBuilder builder, PsParser parser) {
        return parse(builder, parser, false);
    }

    public static boolean parse(PsiBuilder builder, PsParser parser, boolean comExprAllowed) {
        PsiBuilder.Marker marker = builder.mark();
        if (parseSide(builder, parser, comExprAllowed)) {
            if (ParserUtils.getToken(builder, PsTokenSets.ASSIGNMENT_SET)) {
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

