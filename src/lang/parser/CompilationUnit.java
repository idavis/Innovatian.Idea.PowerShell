package com.innovatian.idea.powershell.lang.parser;

import com.innovatian.idea.powershell.lang.parser.parsing.ParserUtils;
import com.intellij.lang.PsiBuilder;

public class CompilationUnit implements PsElementTypes {

  public static void parse(PsiBuilder builder, PsParser parser) {

    ParserUtils.getToken(builder, ML_COMMENT);
    ParserUtils.getToken(builder, NLS);

  }
}