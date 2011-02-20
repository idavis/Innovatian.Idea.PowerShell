package com.innovatian.idea.powershell.test.lang.lexer;

import com.innovatian.idea.powershell.lang.lexer.PsTokenTypes;
import junit.framework.Assert;

public class PsLexerTestsVariables extends PsLexerTestContext {
    public void testSimpleVariable() {
        final String toParse = "$a";
        lexer.start(toParse);

        Assert.assertEquals(PsTokenTypes.DOLLAR, lexer.getTokenType());
        Assert.assertEquals("$", lexer.getTokenText());

        lexer.advance();

        Assert.assertEquals(PsTokenTypes.IDENT, lexer.getTokenType());
        Assert.assertEquals(lexer.getTokenText(), "a");

        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testBlockVariable() {
        final String toParse = "${a}";
        lexer.start(toParse);

        Assert.assertEquals(PsTokenTypes.DOLLAR, lexer.getTokenType());
        Assert.assertEquals("$", lexer.getTokenText());

        lexer.advance();

        Assert.assertEquals(PsTokenTypes.LCURLY, lexer.getTokenType());
        Assert.assertEquals("{", lexer.getTokenText());

        lexer.advance();

        Assert.assertEquals(PsTokenTypes.IDENT, lexer.getTokenType());
        Assert.assertEquals(lexer.getTokenText(), "a");

        lexer.advance();

        Assert.assertEquals(PsTokenTypes.RCURLY, lexer.getTokenType());
        Assert.assertEquals("}", lexer.getTokenText());


        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }
}
