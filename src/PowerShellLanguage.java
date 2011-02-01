package com.innovatian.idea.powershell;

import com.intellij.lang.Language;

public class PowerShellLanguage extends Language {

    public PowerShellLanguage() {
        super("PowerShell");
    }

    @Override
    public boolean isCaseSensitive() {
        return true;
    }
}
