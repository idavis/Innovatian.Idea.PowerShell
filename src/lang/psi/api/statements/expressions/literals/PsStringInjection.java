package com.innovatian.idea.powershell.lang.psi.api.statements.expressions.literals;

import com.innovatian.idea.powershell.lang.parser.parsing.statements.expressions.ExpressionStatement;
import com.innovatian.idea.powershell.lang.psi.PsPsiElement;
import com.intellij.lang.ASTNode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class PsStringInjection extends PsPsiElement {
    PsStringInjection[] EMPTY_ARRAY = new PsStringInjection[0];

    public PsStringInjection(@NotNull ASTNode node) {
        super(node);
    }

    @Nullable
    public ExpressionStatement getExpression() {
        final ExpressionStatement expression = findChildByClass(ExpressionStatement.class);
        return expression;
    }

    @Override
    public String toString() {
        return "PsString injection";
    }
}
