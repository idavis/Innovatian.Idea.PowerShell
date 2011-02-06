package com.innovatian.idea.powershell.test.lang.lexer;

import com.innovatian.idea.powershell.lang.lexer.PsLexer;
import junit.framework.TestCase;

public class PsLexerTestContext extends TestCase {
    protected PsLexer lexer = null;

    protected void setUp() {
        lexer = new PsLexer();
    }
}

