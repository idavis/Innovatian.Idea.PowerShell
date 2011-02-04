package com.innovatian.idea.powershell.lang.parser;

import com.innovatian.idea.powershell.lang.parser.parsing.ParserUtils;
import com.intellij.lang.PsiBuilder;

public class Separators implements PsElementTypes {

    public static boolean parse(PsiBuilder builder) {
        if (SEMI.equals(builder.getTokenType()) || NLS.equals(builder.getTokenType())) {
            builder.advanceLexer();
            while (ParserUtils.getToken(builder, NLS) || ParserUtils.getToken(builder, SEMI)) {
                // Parse newLines
            }
            return true;
        }

        return false;
    }

}
