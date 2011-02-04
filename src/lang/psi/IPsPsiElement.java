package com.innovatian.idea.powershell.lang.psi;

import com.intellij.lang.ASTNode;
import org.jetbrains.annotations.NotNull;

public interface IPsPsiElement extends com.intellij.psi.NavigatablePsiElement {
    @NotNull
    ASTNode getNode();

    public void accept(PsElementVisitor visitor);

    public void acceptChildren(PsElementVisitor visitor);
}
