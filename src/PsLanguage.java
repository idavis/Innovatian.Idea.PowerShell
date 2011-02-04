package com.innovatian.idea.powershell;

import com.intellij.lang.Language;

public class PsLanguage extends Language {

    public PsLanguage() {
        super("PowerShell");
    }

    @Override
    public boolean isCaseSensitive() {
        return true;
    }
}
