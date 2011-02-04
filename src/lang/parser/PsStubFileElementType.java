package com.innovatian.idea.powershell.lang.parser;

import com.innovatian.idea.powershell.lang.psi.PsFile;
import com.intellij.lang.Language;
import com.intellij.psi.PsiFile;
import com.intellij.psi.StubBuilder;
import com.intellij.psi.stubs.*;
import com.intellij.psi.tree.IStubFileElementType;
import com.intellij.util.io.StringRef;

import java.io.IOException;

public class PsStubFileElementType extends IStubFileElementType<PsFileStub> {

    public PsStubFileElementType(Language language) {
        super(language);
    }

    public StubBuilder getBuilder() {
        return new DefaultStubBuilder() {
            protected StubElement createStubForFile(final PsiFile file) {
                if (file instanceof PsFile) {
                    return new PsFileStub((PsFile) file);
                }

                return super.createStubForFile(file);
            }
        };
    }

    @Override
    public int getStubVersion() {
        return super.getStubVersion() + 9;
    }

    public String getExternalId() {
        return "powershell.FILE";
    }

    @Override
    public void indexStub(PsiFileStub stub, IndexSink sink) {
        super.indexStub(stub, sink);
    }

    @Override
    public void serialize(final PsFileStub stub, final StubOutputStream dataStream) throws IOException {
        dataStream.writeName(stub.getName().toString());
    }

    @Override
    public PsFileStub deserialize(final StubInputStream dataStream, final StubElement parentStub) throws IOException {
        StringRef name = dataStream.readName();
        return new PsFileStub(name);
    }

    public void indexStub(PsFileStub stub, IndexSink sink) {
        String name = stub.getName().toString();
        if (name != null) {
            sink.occurrence(PsFullScriptNameIndex.KEY, name.hashCode());
        }
    }

}
