package com.innovatian.idea.powershell;

import com.innovatian.idea.powershell.highlighter.PsEditorHighlighter;
import com.innovatian.idea.powershell.lang.PsIcons;
import com.intellij.lang.Language;
import com.intellij.openapi.editor.colors.EditorColorsScheme;
import com.intellij.openapi.editor.highlighter.EditorHighlighter;
import com.intellij.openapi.fileTypes.LanguageFileType;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.vfs.VirtualFile;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;


public class PsFileType extends LanguageFileType {

    public static final PsFileType PS_FILE_TYPE = new PsFileType();
    public static final Language PS_LANGUAGE = PS_FILE_TYPE.getLanguage();

    @NonNls
    public static final String DEFAULT_EXTENSION = "ps1";

    private PsFileType() {
        super(new PsLanguage());
    }

    @NotNull
    @NonNls
    public String getName() {
        return "PowerShell";
    }

    @NonNls
    @NotNull
    public String getDescription() {
        return "PowerShell File";
    }

    @NotNull
    @NonNls
    public String getDefaultExtension() {
        return DEFAULT_EXTENSION;
    }

    public Icon getIcon() {
        return PsIcons.FileIcon;
    }

    public EditorHighlighter getEditorHighlighter(@Nullable Project project, @Nullable VirtualFile virtualFile, @NotNull EditorColorsScheme colors) {
        return new PsEditorHighlighter(colors, project, virtualFile);
    }
}