package com.innovatian.idea.powershell.lang.psi;

import com.intellij.psi.tree.IElementType;

public class PsPsiKeywordToken extends PsPsiToken {

    public PsPsiKeywordToken(IElementType iElementType, CharSequence charSequence) {
        super(iElementType, charSequence);
    }

    @Override
    public String toString() {
        return "PsKeyword:" + getElementType().toString();
    }
}
