package com.innovatian.idea.powershell;

import com.intellij.openapi.application.ApplicationManager;
import com.intellij.openapi.components.ApplicationComponent;
import com.intellij.openapi.fileTypes.FileTypeManager;
import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NotNull;

public class PsSupportLoader implements ApplicationComponent {
    public static final LanguageFileType PS = PsFileType.PS_FILE_TYPE;

    public void initComponent() {
        ApplicationManager.getApplication().runWriteAction(
                new Runnable() {
                    public void run() {
                        FileTypeManager.getInstance().registerFileType(PS, new String[]{PsFileType.DEFAULT_EXTENSION});
                    }
                }
        );
    }

    public void disposeComponent() {
    }

    @NotNull
    public String getComponentName() {
        return PsComponents.PS_LOADER;
    }
}
