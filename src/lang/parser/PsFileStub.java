package com.innovatian.idea.powershell.lang.parser;

import com.innovatian.idea.powershell.lang.psi.PsFile;
import com.intellij.openapi.util.text.StringUtil;
import com.intellij.psi.stubs.PsiFileStubImpl;
import com.intellij.psi.tree.IStubFileElementType;
import com.intellij.util.io.StringRef;

public class PsFileStub extends PsiFileStubImpl<PsFile> {
    private final StringRef fileName;


    public PsFileStub(PsFile file) {
        super(file);
        fileName = StringRef.fromString(StringUtil.trimEnd(file.getName(), ".ps1"));
    }

    public PsFileStub(StringRef name) {
        super(null);
        fileName = name;
    }

    public IStubFileElementType getType() {
        return PsParserDefinition.PS_FILE;
    }

    public StringRef getName() {
        return fileName;
    }
}
