package com.innovatian.idea.powershell.lang.parser;

import com.innovatian.idea.powershell.PsFileType;
import com.intellij.openapi.roots.ProjectFileIndex;
import com.intellij.openapi.roots.ProjectRootManager;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.psi.search.DelegatingGlobalSearchScope;
import com.intellij.psi.search.GlobalSearchScope;
import org.jetbrains.annotations.NotNull;

public class PsSourceFilterScope extends DelegatingGlobalSearchScope {
    private final ProjectFileIndex myIndex;

    public PsSourceFilterScope(@NotNull final GlobalSearchScope delegate) {
        super(delegate, "groovy.sourceFilter");
        myIndex = ProjectRootManager.getInstance(getProject()).getFileIndex();
    }

    public boolean contains(final VirtualFile file) {
        return super.contains(file) && myIndex.isInSourceContent(file) && PsFileType.PS_FILE_TYPE == file.getFileType();
    }

}
