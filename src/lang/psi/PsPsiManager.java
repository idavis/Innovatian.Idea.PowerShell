package com.innovatian.idea.powershell.lang.psi;

import com.innovatian.idea.powershell.PsFileType;
import com.intellij.openapi.application.ApplicationManager;
import com.intellij.openapi.components.ProjectComponent;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.startup.StartupManager;
import com.intellij.psi.*;
import com.intellij.psi.search.FilenameIndex;
import com.intellij.psi.search.GlobalSearchScope;
import com.intellij.psi.search.PsiShortNamesCache;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

import java.util.HashSet;

public class PsPsiManager implements ProjectComponent
{
  private final Project myProject;
  private PsShortNamesCache myCache;
  private PsiFile myDummyFile;

  public PsPsiManager(Project project)
  {
    myProject = project;
  }

  public void projectOpened()
  {
  }

  public void projectClosed()
  {
  }

  @NotNull
  public String getComponentName()
  {
    return "PsPsiManager";
  }

  public void initComponent()
  {
    myCache = new PsShortNamesCache(myProject);
    StartupManager.getInstance(myProject).registerPostStartupActivity(new Runnable()
    {
      public void run()
      {
        ApplicationManager.getApplication().runWriteAction(new Runnable()
        {
          public void run()
          {
            if (!myProject.isDisposed())
            {
              JavaPsiFacade.getInstance(myProject).registerShortNamesCache(getNamesCache());
            }
          }
        });
      }
    });

    myDummyFile =
      PsiFileFactory.getInstance(myProject)
        .createFileFromText("dummy." + PsFileType.PS_FILE_TYPE.getDefaultExtension(), "");
  }

  public void disposeComponent()
  {
  }

  public static PsPsiManager getInstance(Project project)
  {
    return project.getComponent(PsPsiManager.class);
  }

  public PsShortNamesCache getNamesCache()
  {
    return myCache;
  }

}
