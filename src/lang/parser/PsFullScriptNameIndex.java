package com.innovatian.idea.powershell.lang.parser;

import com.innovatian.idea.powershell.lang.psi.PsFile;
import com.intellij.openapi.project.Project;
import com.intellij.psi.search.GlobalSearchScope;
import com.intellij.psi.stubs.IntStubIndexExtension;
import com.intellij.psi.stubs.StubIndexKey;

import java.util.Collection;

public class PsFullScriptNameIndex extends IntStubIndexExtension<PsFile> {
    public static final StubIndexKey<Integer, PsFile> KEY = StubIndexKey.createIndexKey("gr.script.fqn");

    private static final PsFullScriptNameIndex ourInstance = new PsFullScriptNameIndex();

    public static PsFullScriptNameIndex getInstance() {
        return ourInstance;
    }

    @Override
    public int getVersion() {
        return super.getVersion() + 1;
    }

    public StubIndexKey<Integer, PsFile> getKey() {
        return KEY;
    }

    public Collection<PsFile> get(final Integer integer, final Project project, final GlobalSearchScope scope) {
        return super.get(integer, project, new PsSourceFilterScope(scope));
    }
}
