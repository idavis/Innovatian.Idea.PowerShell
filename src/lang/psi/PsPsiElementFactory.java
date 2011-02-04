package com.innovatian.idea.powershell.lang.psi;

import com.intellij.openapi.components.ServiceManager;
import com.intellij.openapi.project.Project;

public abstract class PsPsiElementFactory {
    public static PsPsiElementFactory getInstance(Project project) {
        return ServiceManager.getService(project, PsPsiElementFactory.class);
    }
}
