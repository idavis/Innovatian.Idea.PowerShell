package com.innovatian.idea.powershell.lang.psi;

import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.PsiReferenceExpression;

public abstract class PsPsiElementVisitor extends PsiElementVisitor {
    protected PsElementVisitor psElementVisitor;

    public PsPsiElementVisitor(PsElementVisitor groovyElementVisitor) {
        psElementVisitor = groovyElementVisitor;
    }

    public void visitElement(PsiElement element) {
        if (element instanceof PsPsiElement) {
            ((PsPsiElement) element).accept(psElementVisitor);
        }
    }

    public void visitToken(PsPsiToken e) {
        visitElement(e);
    }

    public void visitReferenceExpression(PsiReferenceExpression expression) {
    }
}
