package com.innovatian.idea.powershell.lang.psi;

import com.intellij.openapi.project.Project;
import com.intellij.psi.PsiClass;
import com.intellij.psi.PsiField;
import com.intellij.psi.PsiFile;
import com.intellij.psi.PsiMethod;
import com.intellij.psi.search.FilenameIndex;
import com.intellij.psi.search.GlobalSearchScope;
import com.intellij.psi.search.PsiShortNamesCache;
import com.intellij.util.containers.HashSet;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class PsShortNamesCache extends PsiShortNamesCache {
    Project myProject;

    public PsShortNamesCache(Project project) {
        myProject = project;
    }


    public void runStartupActivity() {
    }

    @NotNull
    public PsiFile[] getFilesByName(@NotNull String name) {
        return new PsiFile[0];
    }

    @NotNull
    public String[] getAllFileNames() {
        return FilenameIndex.getAllFilenames(myProject);
    }

    @NotNull
    @Override
    public PsiClass[] getClassesByName(@NotNull String name, @NotNull GlobalSearchScope scope) {
        return new PsiClass[0];  //To change body of implemented methods use File | Settings | File Templates.
    }

    @NotNull
    @Override
    public String[] getAllClassNames() {
        return new String[0];  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void getAllClassNames(@NotNull HashSet<String> dest) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    private boolean areClassesCompiled() {
        return false;
    }

    @NotNull
    public PsiMethod[] getMethodsByName(@NonNls String name, @NotNull GlobalSearchScope scope) {
        return new PsiMethod[0];
    }

    @NotNull
    public PsiMethod[] getMethodsByNameIfNotMoreThan(@NonNls String name, @NotNull GlobalSearchScope scope, int maxCount) {
        return new PsiMethod[0];
    }

    @NotNull
    public String[] getAllMethodNames() {
        return new String[0];
    }

    public void getAllMethodNames(@NotNull HashSet<String> set) {
    }

    @NotNull
    public PsiField[] getFieldsByName(@NotNull String name, @NotNull GlobalSearchScope scope) {
        return new PsiField[0];
    }

    @NotNull
    public String[] getAllFieldNames() {
        return new String[0];
    }

    public void getAllFieldNames(@NotNull HashSet<String> set) {
    }

}
