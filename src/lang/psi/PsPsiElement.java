package com.innovatian.idea.powershell.lang.psi;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.NotNull;

public abstract class PsPsiElement extends ASTWrapperPsiElement implements IPsPsiElement{
    public PsPsiElement(@NotNull ASTNode astNode) {
        super(astNode);
    }

    public void accept(PsElementVisitor visitor) {
        visitor.visitElement(this);
    }

    public void acceptChildren(PsElementVisitor visitor) {
        acceptPsChildren(this, visitor);
    }

    public static void acceptPsChildren(PsiElement parent, PsElementVisitor visitor) {
        PsiElement child = parent.getFirstChild();
        while (child != null) {
            if (child instanceof PsPsiElement) {
                ((PsPsiElement) child).accept(visitor);
            }

            child = child.getNextSibling();
        }
    }
}
