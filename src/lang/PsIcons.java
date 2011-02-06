package com.innovatian.idea.powershell.lang;

import com.innovatian.idea.powershell.PsFileType;

import javax.swing.*;
import javax.swing.filechooser.FileSystemView;
import java.io.File;
import java.io.IOException;

public abstract class PsIcons {
    public static Icon FileIcon = getFileIcon();

    private static Icon getFileIcon() {
        Icon icon = null;
        try {
            File file = File.createTempFile("icon", "." + PsFileType.DEFAULT_EXTENSION);

            FileSystemView view = FileSystemView.getFileSystemView();
            icon = view.getSystemIcon(file);
            file.delete();
        } catch (IOException ioe) {
        }
        return icon;
    }
}
