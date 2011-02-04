package com.innovatian.idea.powershell.lang.parser;

import com.innovatian.idea.powershell.lang.psi.PsFile;
import com.intellij.psi.stubs.StringStubIndexExtension;
import com.intellij.psi.stubs.StubIndexKey;

public class PsScriptClassNameIndex extends StringStubIndexExtension<PsFile> {
    public static final StubIndexKey<String, PsFile> KEY = StubIndexKey.createIndexKey("ps1.script.class");

    public StubIndexKey<String, PsFile> getKey() {
        return KEY;
    }
}
