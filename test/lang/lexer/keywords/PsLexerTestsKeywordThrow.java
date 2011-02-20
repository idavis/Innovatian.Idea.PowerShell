package com.innovatian.idea.powershell.test.lang.lexer.keywords;

import com.innovatian.idea.powershell.lang.lexer.PsTokenTypes;
import com.innovatian.idea.powershell.test.lang.lexer.PsLexerTestContext;
import junit.framework.Assert;

public class PsLexerTestsKeywordThrow extends PsLexerTestContext {
    public void testKeyword_THROW() {
        String toParse = "THROW";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.THROW, lexer.getTokenType());
        Assert.assertEquals("THROW", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_THROw() {
        String toParse = "THROw";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.THROW, lexer.getTokenType());
        Assert.assertEquals("THROw", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_THRoW() {
        String toParse = "THRoW";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.THROW, lexer.getTokenType());
        Assert.assertEquals("THRoW", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_THRow() {
        String toParse = "THRow";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.THROW, lexer.getTokenType());
        Assert.assertEquals("THRow", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_THrOW() {
        String toParse = "THrOW";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.THROW, lexer.getTokenType());
        Assert.assertEquals("THrOW", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_THrOw() {
        String toParse = "THrOw";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.THROW, lexer.getTokenType());
        Assert.assertEquals("THrOw", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_THroW() {
        String toParse = "THroW";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.THROW, lexer.getTokenType());
        Assert.assertEquals("THroW", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_THrow() {
        String toParse = "THrow";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.THROW, lexer.getTokenType());
        Assert.assertEquals("THrow", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_ThROW() {
        String toParse = "ThROW";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.THROW, lexer.getTokenType());
        Assert.assertEquals("ThROW", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_ThROw() {
        String toParse = "ThROw";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.THROW, lexer.getTokenType());
        Assert.assertEquals("ThROw", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_ThRoW() {
        String toParse = "ThRoW";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.THROW, lexer.getTokenType());
        Assert.assertEquals("ThRoW", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_ThRow() {
        String toParse = "ThRow";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.THROW, lexer.getTokenType());
        Assert.assertEquals("ThRow", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_ThrOW() {
        String toParse = "ThrOW";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.THROW, lexer.getTokenType());
        Assert.assertEquals("ThrOW", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_ThrOw() {
        String toParse = "ThrOw";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.THROW, lexer.getTokenType());
        Assert.assertEquals("ThrOw", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_ThroW() {
        String toParse = "ThroW";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.THROW, lexer.getTokenType());
        Assert.assertEquals("ThroW", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_Throw() {
        String toParse = "Throw";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.THROW, lexer.getTokenType());
        Assert.assertEquals("Throw", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_tHROW() {
        String toParse = "tHROW";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.THROW, lexer.getTokenType());
        Assert.assertEquals("tHROW", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_tHROw() {
        String toParse = "tHROw";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.THROW, lexer.getTokenType());
        Assert.assertEquals("tHROw", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_tHRoW() {
        String toParse = "tHRoW";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.THROW, lexer.getTokenType());
        Assert.assertEquals("tHRoW", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_tHRow() {
        String toParse = "tHRow";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.THROW, lexer.getTokenType());
        Assert.assertEquals("tHRow", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_tHrOW() {
        String toParse = "tHrOW";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.THROW, lexer.getTokenType());
        Assert.assertEquals("tHrOW", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_tHrOw() {
        String toParse = "tHrOw";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.THROW, lexer.getTokenType());
        Assert.assertEquals("tHrOw", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_tHroW() {
        String toParse = "tHroW";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.THROW, lexer.getTokenType());
        Assert.assertEquals("tHroW", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_tHrow() {
        String toParse = "tHrow";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.THROW, lexer.getTokenType());
        Assert.assertEquals("tHrow", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_thROW() {
        String toParse = "thROW";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.THROW, lexer.getTokenType());
        Assert.assertEquals("thROW", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_thROw() {
        String toParse = "thROw";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.THROW, lexer.getTokenType());
        Assert.assertEquals("thROw", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_thRoW() {
        String toParse = "thRoW";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.THROW, lexer.getTokenType());
        Assert.assertEquals("thRoW", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_thRow() {
        String toParse = "thRow";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.THROW, lexer.getTokenType());
        Assert.assertEquals("thRow", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_thrOW() {
        String toParse = "thrOW";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.THROW, lexer.getTokenType());
        Assert.assertEquals("thrOW", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_thrOw() {
        String toParse = "thrOw";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.THROW, lexer.getTokenType());
        Assert.assertEquals("thrOw", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_throW() {
        String toParse = "throW";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.THROW, lexer.getTokenType());
        Assert.assertEquals("throW", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_throw() {
        String toParse = "throw";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.THROW, lexer.getTokenType());
        Assert.assertEquals("throw", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

}
