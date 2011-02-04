package com.innovatian.idea.powershell.lang.parser;

import com.innovatian.idea.powershell.lang.psi.PsElementVisitor;
import com.innovatian.idea.powershell.lang.psi.PsPsiElement;
import com.intellij.lang.ASTNode;
import org.jetbrains.annotations.NotNull;

public abstract class BinaryExpression extends PsPsiElement {
    public BinaryExpression(@NotNull ASTNode astNode) {
        super(astNode);
    }

    public void accept(PsElementVisitor visitor) {
        visitor.visitBinaryExpression(this);
    }
}
