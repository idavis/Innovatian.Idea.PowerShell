package com.innovatian.idea.powershell;

import com.intellij.CommonBundle;
import com.intellij.lang.Language;
import com.intellij.reference.SoftReference;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.PropertyKey;

import java.lang.ref.Reference;
import java.util.ResourceBundle;

public class PsLanguage extends Language {

    public PsLanguage() {
        super("PowerShell");
    }

    @Override
    public boolean isCaseSensitive() {
        return true;
    }
}
