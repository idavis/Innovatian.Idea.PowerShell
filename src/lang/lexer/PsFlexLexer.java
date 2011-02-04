package com.innovatian.idea.powershell.lang.lexer;


import com.intellij.lexer.FlexAdapter;

import java.io.Reader;

public class PsFlexLexer extends FlexAdapter {
    public PsFlexLexer() {
        super(new _PowerShellLexer((Reader) null));
    }
}
