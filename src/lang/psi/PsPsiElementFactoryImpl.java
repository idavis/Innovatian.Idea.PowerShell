package com.innovatian.idea.powershell.lang.psi;

import com.intellij.openapi.project.Project;

public class PsPsiElementFactoryImpl extends PsPsiElementFactory {
  Project project;

  public PsPsiElementFactoryImpl(Project project) {
    this.project = project;
  }
}
