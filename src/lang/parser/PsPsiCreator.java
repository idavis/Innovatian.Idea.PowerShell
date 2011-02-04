package com.innovatian.idea.powershell.lang.parser;

import com.innovatian.idea.powershell.lang.psi.api.statements.expressions.literals.PsLiteral;
import com.innovatian.idea.powershell.lang.psi.api.statements.expressions.literals.PsString;
import com.innovatian.idea.powershell.lang.psi.api.statements.expressions.literals.PsStringInjection;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.tree.IElementType;


public class PsPsiCreator implements PsElementTypes {
    public static PsiElement createElement(ASTNode node) {
        IElementType elem = node.getElementType();
        if (elem.equals(LITERAL)) return new PsLiteral(node);
        if (elem.equals(STRING_LITERAL)) return new PsString(node);
        if (elem.equals(EXPSTRING_LITERAL)) return new PsString(node);
        if (elem.equals(EXPSTRING)) return new PsString(node);
        if (elem.equals(PSSTRING_INJECTION)) return new PsStringInjection(node);
        if (elem.equals(LOGICAL_OP_EXPRESSION)) return new LogicalExpression(node);

        return new ASTWrapperPsiElement(node);
    }
}

