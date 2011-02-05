package com.innovatian.idea.powershell.actions;

import com.innovatian.idea.powershell.Bundle;
import com.innovatian.idea.powershell.lang.PsIcons;
import com.intellij.psi.PsiDirectory;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import org.jetbrains.annotations.NotNull;

public class NewPsFileAction extends NewPsActionBase {
    public NewPsFileAction() {
        super(Bundle.message("newfile.menu.action.text"),
                Bundle.message("newfile.menu.action.description"),
                PsIcons.FileIcon);
    }


    protected String getDialogPrompt() {
        return Bundle.message("newfile.dialog.prompt");
    }

    protected String getDialogTitle() {
        return Bundle.message("newfile.dialog.title");
    }

    protected String getCommandName() {
        return Bundle.message("newfile.command.name");
    }

    protected String getActionName(PsiDirectory directory, String newName) {
        return Bundle.message("newfile.menu.action.text");
    }

    @NotNull
    protected PsiElement[] doCreate(String newName, PsiDirectory directory) {
        PsiFile file = createFileFromTemplate(directory, newName, "Untitled1.ps1");
        PsiElement child = file.getLastChild();
        return child != null ? new PsiElement[]{file, child} : new PsiElement[]{file};
    }
}