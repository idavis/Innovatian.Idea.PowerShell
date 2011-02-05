package com.innovatian.idea.powershell.actions;

import com.innovatian.idea.powershell.PsFileType;
import com.intellij.CommonBundle;
import com.intellij.ide.actions.CreateElementActionBase;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.DataContext;
import com.intellij.openapi.actionSystem.LangDataKeys;
import com.intellij.openapi.actionSystem.Presentation;
import com.intellij.openapi.module.Module;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.Messages;
import com.intellij.psi.PsiDirectory;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.util.IncorrectOperationException;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

public abstract class NewPsActionBase extends CreateElementActionBase {

    public NewPsActionBase(String text, String description, Icon icon) {
        super(text, description, icon);
    }

    @NotNull
    protected final PsiElement[] invokeDialog(final Project project, final PsiDirectory directory) {
        final MyInputValidator validator = new MyInputValidator(project, directory);
        Messages.showInputDialog(project, getDialogPrompt(), getDialogTitle(), Messages.getQuestionIcon(), "", validator);

        final PsiElement[] elements = validator.getCreatedElements();
        return elements;
    }

    public void update(final AnActionEvent event) {
        super.update(event);

        final Presentation presentation = event.getPresentation();
        final DataContext context = event.getDataContext();
        Module module = (Module) context.getData(LangDataKeys.MODULE.getName());

        final boolean hasModule = module != null;
        presentation.setEnabled(hasModule);
        presentation.setVisible(hasModule);
    }

    protected static PsiFile createFileFromTemplate(final PsiDirectory directory,
                                                    String className,
                                                    @NonNls String templateName,
                                                    @NonNls String... parameters) throws IncorrectOperationException {
        final String ext = "." + PsFileType.DEFAULT_EXTENSION;
        String filename = (className.endsWith(ext)) ? className : className + ext;
        return PsTemplatesFactory.createFromTemplate(directory, className, filename);
    }

    @NotNull
    protected PsiElement[] create(String newName, PsiDirectory directory) throws Exception {
        return doCreate(newName, directory);
    }

    @NotNull
    protected abstract PsiElement[] doCreate(String newName, PsiDirectory directory);

    protected abstract String getDialogPrompt();

    protected abstract String getDialogTitle();

    protected String getErrorTitle() {
        return CommonBundle.getErrorTitle();
    }

    protected void checkBeforeCreate(String newName, PsiDirectory directory) throws IncorrectOperationException {
        checkCreateFile(directory, newName);
    }

    public static void checkCreateFile(@NotNull PsiDirectory directory, String name) throws IncorrectOperationException {
        final String fileName = name + "." + PsFileType.DEFAULT_EXTENSION;
        directory.checkCreateFile(fileName);
    }
}
