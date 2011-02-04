package com.innovatian.idea.powershell.lang.parser.parsing.statements.expressions;

import com.innovatian.idea.powershell.lang.parser.PsParser;
import com.innovatian.idea.powershell.lang.parser.parsing.ParserUtils;
import com.intellij.lang.PsiBuilder;

public class ComparisonExpressionStatement extends BitwiseExpressionStatement {
    /*
    <comparisonExpressionRule> = <addExpressionRule> [ <ComparisonOperatorToken> <addExpressionRule> ]*
     */
    public static boolean parse(PsiBuilder builder, PsParser parser) {
        PsiBuilder.Marker marker = builder.mark();
        if (ParserUtils.getToken(builder, NUMBER)) {
            ParserUtils.getToken(builder, NLS);
            if (ParserUtils.getToken(builder, COMPARISONOPS)) {
                ParserUtils.getToken(builder, NLS);
                if (ParserUtils.getToken(builder, NUMBER)) {
                    marker.done(CONDITIONAL_EXPRESSION);
                    return true;
                }
            }
        }
        marker.drop();
        return false;
    }
}
