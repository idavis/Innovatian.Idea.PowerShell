package com.innovatian.idea.powershell.lang.parser;

import com.intellij.lang.ASTNode;
import org.jetbrains.annotations.NotNull;

public class LogicalExpression extends BinaryExpression {
    public LogicalExpression(@NotNull ASTNode node) {
        super(node);
    }
}
