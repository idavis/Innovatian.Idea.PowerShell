package com.innovatian.idea.powershell.lang.lexer;

import com.innovatian.idea.powershell.PsFileType;
import com.intellij.psi.tree.IElementType;


public class PsElementType extends IElementType {

    private String debugName = null;

    public PsElementType(String debugName) {
        super(debugName, PsFileType.PS_FILE_TYPE.getLanguage());
        this.debugName = debugName;
    }

    @Override
    public String toString() {
        return debugName;
    }
}