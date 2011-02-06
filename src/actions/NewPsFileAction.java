package com.innovatian.idea.powershell.actions;

import com.innovatian.idea.powershell.lang.PsIcons;
import com.intellij.psi.PsiDirectory;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import org.jetbrains.annotations.NotNull;

public class NewPsFileAction extends NewPsActionBase {
    public NewPsFileAction() {
        super("New PowerShell Script",
                "New PowerShell Script",
                PsIcons.FileIcon);
    }

    protected String getDialogPrompt() {
        return"New PowerShell Script";
    }

    protected String getDialogTitle() {
        return "New PowerShell Script";
    }

    protected String getCommandName() {
        return "New PowerShell Script";
    }

    protected String getActionName(PsiDirectory directory, String newName) {
        return "New PowerShell Script";
    }

    @NotNull
    protected PsiElement[] doCreate(String newName, PsiDirectory directory) {
        PsiFile file = createFileFromTemplate(directory, newName, "Untitled1.ps1");
        PsiElement child = file.getLastChild();
        return child != null ? new PsiElement[]{file, child} : new PsiElement[]{file};
    }
}