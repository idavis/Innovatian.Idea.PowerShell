package com.innovatian.idea.powershell.lang.psi.api.statements.expressions.literals;

import com.innovatian.idea.powershell.lang.psi.PsElementVisitor;
import com.innovatian.idea.powershell.lang.psi.PsPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiLiteral;
import org.jetbrains.annotations.NotNull;

public class PsString extends PsPsiElement implements PsiLiteral {
    public PsString(@NotNull ASTNode astNode) {
        super(astNode);
    }

    public String toString() {
        return "Compound PsString";
    }

    public PsStringInjection[] getInjections() {
        return findChildrenByClass(PsStringInjection.class);
    }

    @Override
    public void accept(PsElementVisitor visitor) {
        visitor.visitPsStringExpression(this);
    }

    @Override
    public Object getValue() {
        return null;
    }
}
