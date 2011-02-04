package com.innovatian.idea.powershell.lang.psi.api.statements.expressions.literals;

import com.innovatian.idea.powershell.lang.psi.PsPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiLiteral;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NotNull;

public class PsLiteral extends PsPsiElement implements PsiLiteral{
      public PsLiteral(@NotNull ASTNode node) {
    super(node);
  }

  public String toString() {
    return "Literal";
  }

  public Object getValue() {
    final PsiElement child = getFirstChild();
    IElementType elemType = child.getNode().getElementType();
    String text = child.getText();
    return text;
  }
}

