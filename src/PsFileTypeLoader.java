package com.innovatian.idea.powershell;

import com.intellij.openapi.fileTypes.FileTypeConsumer;
import com.intellij.openapi.fileTypes.FileTypeFactory;
import org.jetbrains.annotations.NotNull;

public class PsFileTypeLoader extends FileTypeFactory {
    public void createFileTypes(@NotNull FileTypeConsumer consumer) {
        consumer.consume(PsFileType.PS_FILE_TYPE, PsFileType.DEFAULT_EXTENSION);
    }
}