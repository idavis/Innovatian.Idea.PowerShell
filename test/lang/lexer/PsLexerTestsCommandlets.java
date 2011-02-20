package com.innovatian.idea.powershell.test.lang.lexer;

import com.innovatian.idea.powershell.lang.lexer.PsTokenTypes;
import junit.framework.Assert;

public class PsLexerTestsCommandlets extends PsLexerTestContext {

    public void testadd_content() {
        String toParse = "add-content";
        lexer.start(toParse);

        Assert.assertEquals(PsTokenTypes.CMDLET, lexer.getTokenType());
        Assert.assertEquals("add-content", lexer.getTokenText());

        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testAdd_Content() {
        String toParse = "Add-Content";
        lexer.start(toParse);

        Assert.assertEquals(PsTokenTypes.CMDLET, lexer.getTokenType());
        Assert.assertEquals("Add-Content", lexer.getTokenText());

        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }
}
