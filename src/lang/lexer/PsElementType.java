package com.innovatian.idea.powershell.lang.lexer;

import com.innovatian.idea.powershell.PsFileType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NotNull;


public class PsElementType extends IElementType {

    private String debugName = null;

    public PsElementType(String debugName) {
        super(debugName, PsFileType.PS_FILE_TYPE.getLanguage());
        this.debugName = debugName;
    }

    public String toString() {
        return debugName;
    }

    public static abstract class PsiCreator extends PsElementType {
        protected PsiCreator(String debugName) {
            super(debugName);
        }

        public abstract PsElementType createPsi(@NotNull ASTNode node);
    }
}