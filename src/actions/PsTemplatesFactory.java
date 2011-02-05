package com.innovatian.idea.powershell.actions;

import com.innovatian.idea.powershell.PsFileType;
import com.innovatian.idea.powershell.lang.PsIcons;
import com.intellij.ide.fileTemplates.FileTemplateGroupDescriptor;
import com.intellij.ide.fileTemplates.FileTemplateGroupDescriptorFactory;
import com.intellij.psi.PsiDirectory;
import com.intellij.psi.PsiFile;
import com.intellij.psi.PsiFileFactory;
import com.intellij.util.IncorrectOperationException;

public class PsTemplatesFactory implements FileTemplateGroupDescriptorFactory {
    private static int fileNumber = 0;
    private static final String FILE_NAME = "Untitled1.ps1";
    private final FileTemplateGroupDescriptor templateGroup;

    public PsTemplatesFactory() {
        templateGroup = new FileTemplateGroupDescriptor("file.template.group.title.bash", PsIcons.FileIcon);
        templateGroup.addTemplate(getFileName());
    }

    public static String getFileName() {
        return "Untitled" + (++fileNumber) + PsFileType.DEFAULT_EXTENSION;
    }

    public FileTemplateGroupDescriptor getFileTemplatesDescriptor() {
        return templateGroup;
    }

    public static PsiFile createFromTemplate(final PsiDirectory directory, final String name, String fileName) throws IncorrectOperationException {
        final String text = "";
        final PsiFileFactory factory = PsiFileFactory.getInstance(directory.getProject());

        final PsiFile file = factory.createFileFromText(fileName, PsFileType.PS_FILE_TYPE, text);

        return (PsiFile) directory.add(file);
    }

}
