package com.innovatian.idea.powershell.lang.parser.parsing.statements.expressions;

import com.innovatian.idea.powershell.lang.parser.PsElementTypes;
import com.innovatian.idea.powershell.lang.parser.PsParser;
import com.intellij.lang.PsiBuilder;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.Nullable;

public class ExpressionStatement implements PsElementTypes {

    @Nullable
    private static IElementType parseExpressionStatement(PsiBuilder builder, PsParser parser) {
        if(ComparisonExpressionStatement.parse(builder, parser))
        {
            return CONDITIONAL_EXPRESSION;
        }
        return WRONGWAY;
    }

    public static boolean parse(PsiBuilder builder, PsParser parser) {
        final IElementType result = parseExpressionStatement(builder, parser);
        if (result == WRONGWAY) {
            return false;
        }
        return true;
    }
}

