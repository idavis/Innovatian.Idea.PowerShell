package com.innovatian.idea.powershell.test.lang.lexer.keywords;

import com.innovatian.idea.powershell.lang.lexer.PsTokenTypes;
import com.innovatian.idea.powershell.test.lang.lexer.PsLexerTestContext;
import junit.framework.Assert;

public class PsLexerTestsKeywordBreak extends PsLexerTestContext {
    public void testKeyword_BREAK() {
        String toParse = "BREAK";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.BREAK, lexer.getTokenType());
        Assert.assertEquals("BREAK", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_BREAk() {
        String toParse = "BREAk";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.BREAK, lexer.getTokenType());
        Assert.assertEquals("BREAk", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_BREaK() {
        String toParse = "BREaK";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.BREAK, lexer.getTokenType());
        Assert.assertEquals("BREaK", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_BREak() {
        String toParse = "BREak";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.BREAK, lexer.getTokenType());
        Assert.assertEquals("BREak", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_BReAK() {
        String toParse = "BReAK";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.BREAK, lexer.getTokenType());
        Assert.assertEquals("BReAK", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_BReAk() {
        String toParse = "BReAk";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.BREAK, lexer.getTokenType());
        Assert.assertEquals("BReAk", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_BReaK() {
        String toParse = "BReaK";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.BREAK, lexer.getTokenType());
        Assert.assertEquals("BReaK", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_BReak() {
        String toParse = "BReak";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.BREAK, lexer.getTokenType());
        Assert.assertEquals("BReak", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_BrEAK() {
        String toParse = "BrEAK";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.BREAK, lexer.getTokenType());
        Assert.assertEquals("BrEAK", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_BrEAk() {
        String toParse = "BrEAk";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.BREAK, lexer.getTokenType());
        Assert.assertEquals("BrEAk", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_BrEaK() {
        String toParse = "BrEaK";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.BREAK, lexer.getTokenType());
        Assert.assertEquals("BrEaK", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_BrEak() {
        String toParse = "BrEak";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.BREAK, lexer.getTokenType());
        Assert.assertEquals("BrEak", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_BreAK() {
        String toParse = "BreAK";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.BREAK, lexer.getTokenType());
        Assert.assertEquals("BreAK", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_BreAk() {
        String toParse = "BreAk";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.BREAK, lexer.getTokenType());
        Assert.assertEquals("BreAk", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_BreaK() {
        String toParse = "BreaK";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.BREAK, lexer.getTokenType());
        Assert.assertEquals("BreaK", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_Break() {
        String toParse = "Break";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.BREAK, lexer.getTokenType());
        Assert.assertEquals("Break", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_bREAK() {
        String toParse = "bREAK";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.BREAK, lexer.getTokenType());
        Assert.assertEquals("bREAK", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_bREAk() {
        String toParse = "bREAk";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.BREAK, lexer.getTokenType());
        Assert.assertEquals("bREAk", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_bREaK() {
        String toParse = "bREaK";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.BREAK, lexer.getTokenType());
        Assert.assertEquals("bREaK", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_bREak() {
        String toParse = "bREak";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.BREAK, lexer.getTokenType());
        Assert.assertEquals("bREak", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_bReAK() {
        String toParse = "bReAK";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.BREAK, lexer.getTokenType());
        Assert.assertEquals("bReAK", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_bReAk() {
        String toParse = "bReAk";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.BREAK, lexer.getTokenType());
        Assert.assertEquals("bReAk", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_bReaK() {
        String toParse = "bReaK";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.BREAK, lexer.getTokenType());
        Assert.assertEquals("bReaK", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_bReak() {
        String toParse = "bReak";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.BREAK, lexer.getTokenType());
        Assert.assertEquals("bReak", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_brEAK() {
        String toParse = "brEAK";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.BREAK, lexer.getTokenType());
        Assert.assertEquals("brEAK", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_brEAk() {
        String toParse = "brEAk";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.BREAK, lexer.getTokenType());
        Assert.assertEquals("brEAk", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_brEaK() {
        String toParse = "brEaK";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.BREAK, lexer.getTokenType());
        Assert.assertEquals("brEaK", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_brEak() {
        String toParse = "brEak";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.BREAK, lexer.getTokenType());
        Assert.assertEquals("brEak", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_breAK() {
        String toParse = "breAK";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.BREAK, lexer.getTokenType());
        Assert.assertEquals("breAK", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_breAk() {
        String toParse = "breAk";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.BREAK, lexer.getTokenType());
        Assert.assertEquals("breAk", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_breaK() {
        String toParse = "breaK";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.BREAK, lexer.getTokenType());
        Assert.assertEquals("breaK", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_break() {
        String toParse = "break";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.BREAK, lexer.getTokenType());
        Assert.assertEquals("break", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

}
