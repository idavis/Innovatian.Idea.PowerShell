package com.innovatian.idea.powershell.test.lang.lexer.keywords;

import com.innovatian.idea.powershell.lang.lexer.PsTokenTypes;
import com.innovatian.idea.powershell.test.lang.lexer.PsLexerTestContext;
import junit.framework.Assert;

public class PsLexerTestsKeywordTry extends PsLexerTestContext {
    public void testKeyword_TRY() {
        String toParse = "TRY";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.TRY, lexer.getTokenType());
        Assert.assertEquals("TRY", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_TRy() {
        String toParse = "TRy";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.TRY, lexer.getTokenType());
        Assert.assertEquals("TRy", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_TrY() {
        String toParse = "TrY";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.TRY, lexer.getTokenType());
        Assert.assertEquals("TrY", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_Try() {
        String toParse = "Try";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.TRY, lexer.getTokenType());
        Assert.assertEquals("Try", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_tRY() {
        String toParse = "tRY";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.TRY, lexer.getTokenType());
        Assert.assertEquals("tRY", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_tRy() {
        String toParse = "tRy";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.TRY, lexer.getTokenType());
        Assert.assertEquals("tRy", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_trY() {
        String toParse = "trY";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.TRY, lexer.getTokenType());
        Assert.assertEquals("trY", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_try() {
        String toParse = "try";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.TRY, lexer.getTokenType());
        Assert.assertEquals("try", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

}
