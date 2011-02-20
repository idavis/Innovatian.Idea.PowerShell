package com.innovatian.idea.powershell.test.lang.lexer;

import com.innovatian.idea.powershell.lang.lexer.PsTokenTypes;
import junit.framework.Assert;

public class PsLexerTestsKeywords extends PsLexerTestContext {
    public void testbegin() {
        String toParse = "begin";
        lexer.start(toParse);

        Assert.assertEquals(PsTokenTypes.BEGIN, lexer.getTokenType());
        Assert.assertEquals("begin", lexer.getTokenText());

        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testBegin() {
        String toParse = "Begin";
        lexer.start(toParse);

        Assert.assertEquals(PsTokenTypes.BEGIN, lexer.getTokenType());
        Assert.assertEquals("Begin", lexer.getTokenText());

        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testBreak() {
        String toParse = "Break";
        lexer.start(toParse);

        Assert.assertEquals(PsTokenTypes.BREAK, lexer.getTokenType());
        Assert.assertEquals("Break", lexer.getTokenText());

        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testbreak() {
        String toParse = "break";
        lexer.start(toParse);

        Assert.assertEquals(PsTokenTypes.BREAK, lexer.getTokenType());
        Assert.assertEquals("break", lexer.getTokenText());

        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testCatch() {
        String toParse = "Catch";
        lexer.start(toParse);

        Assert.assertEquals(PsTokenTypes.CATCH, lexer.getTokenType());
        Assert.assertEquals("Catch", lexer.getTokenText());

        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testcatch() {
        String toParse = "catch";
        lexer.start(toParse);

        Assert.assertEquals(PsTokenTypes.CATCH, lexer.getTokenType());
        Assert.assertEquals("catch", lexer.getTokenText());

        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }


    public void testContinue() {
        String toParse = "Continue";
        lexer.start(toParse);

        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("Continue", lexer.getTokenText());

        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testcontinue() {
        String toParse = "continue";
        lexer.start(toParse);

        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("continue", lexer.getTokenText());

        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }
}
