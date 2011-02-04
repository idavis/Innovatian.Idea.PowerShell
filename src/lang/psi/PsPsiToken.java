package com.innovatian.idea.powershell.lang.psi;

import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.impl.source.tree.LeafPsiElement;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NotNull;

public class PsPsiToken extends LeafPsiElement {
    public PsPsiToken(IElementType iElementType, CharSequence charSequence) {
        super(iElementType, charSequence);
    }

    public IElementType getTokenType() {
        return getElementType();
    }

    public void accept(@NotNull PsiElementVisitor visitor) {
        if (visitor instanceof PsPsiElementVisitor) {
            ((PsPsiElementVisitor) visitor).visitToken(this);
        } else {
            visitor.visitElement(this);
        }
    }

    @Override
    public String toString() {
        return "PsToken:" + getElementType().toString();
    }
}
