package com.innovatian.idea.powershell;

import com.intellij.lang.Language;
import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;


public class PsFileType extends LanguageFileType {

    public static final PsFileType PS_FILE_TYPE = new PsFileType();
    public static final Language PS_LANGUAGE = PS_FILE_TYPE.getLanguage();

    @NonNls
    public static final String DEFAULT_EXTENSION = "ps1";

    private PsFileType() {
        super(new PowerShellLanguage());
    }

    @NotNull
    @NonNls
    public String getName() {
        return "PowerShell";
    }

    @NonNls
    @NotNull
    public String getDescription() {
        return "PowerShell Files";
    }

    @NotNull
    @NonNls
    public String getDefaultExtension() {
        return DEFAULT_EXTENSION;
    }

    public Icon getIcon() {
        return null;
    }

//  public EditorHighlighter getEditorHighlighter(@Nullable Project project, @Nullable VirtualFile virtualFile, @NotNull EditorColorsScheme colors) {
//    return new PsEditorHighlighter(colors, project, virtualFile);
//  }
}