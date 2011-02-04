package com.innovatian.idea.powershell.lang.parser;

import com.intellij.psi.PsiElement;
import com.intellij.psi.stubs.StringStubIndexExtension;
import com.intellij.psi.stubs.StubIndexKey;

public class PsAnnotatedMemberIndex extends StringStubIndexExtension<PsiElement> {
  public static final StubIndexKey<String, PsiElement> KEY = StubIndexKey.createIndexKey("ps1.annot.members");

  public StubIndexKey<String, PsiElement> getKey() {
    return KEY;
  }
}
