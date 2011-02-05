package com.innovatian.idea.powershell.highlighter;

import com.intellij.openapi.editor.colors.EditorColorsScheme;
import com.intellij.openapi.editor.ex.util.LayeredLexerEditorHighlighter;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.vfs.VirtualFile;

public class PsEditorHighlighter extends LayeredLexerEditorHighlighter {
    public PsEditorHighlighter(EditorColorsScheme scheme, Project project, VirtualFile virtualFile) {
      super(new PsSyntaxHighlighter(), scheme);
    }
}
