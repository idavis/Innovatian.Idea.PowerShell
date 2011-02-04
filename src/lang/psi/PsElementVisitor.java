package com.innovatian.idea.powershell.lang.psi;

import com.innovatian.idea.powershell.lang.parser.BinaryExpression;
import com.innovatian.idea.powershell.lang.psi.api.statements.expressions.literals.PsLiteral;
import com.innovatian.idea.powershell.lang.psi.api.statements.expressions.literals.PsString;

public abstract class PsElementVisitor {
    public void visitElement(IPsPsiElement element) {
        String s;
    }

    public void visitFile(PsFile file) {
        visitElement(file);
    }

    public void visitBinaryExpression(BinaryExpression binaryExpression) {
        visitElement(binaryExpression);
    }

    public void visitLiteralExpression(PsLiteral psLiteral) {
        visitElement(psLiteral);
    }

    public void visitPsStringExpression(PsString psString) {
        visitElement(psString);
    }
}
