package com.innovatian.idea.powershell.test.lang.lexer.keywords;

import com.innovatian.idea.powershell.lang.lexer.PsTokenTypes;
import com.innovatian.idea.powershell.test.lang.lexer.PsLexerTestContext;
import junit.framework.Assert;

public class PsLexerTestsKeywordTrap extends PsLexerTestContext {
    public void testKeyword_TRAP() {
        String toParse = "TRAP";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.TRAP, lexer.getTokenType());
        Assert.assertEquals("TRAP", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_TRAp() {
        String toParse = "TRAp";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.TRAP, lexer.getTokenType());
        Assert.assertEquals("TRAp", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_TRaP() {
        String toParse = "TRaP";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.TRAP, lexer.getTokenType());
        Assert.assertEquals("TRaP", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_TRap() {
        String toParse = "TRap";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.TRAP, lexer.getTokenType());
        Assert.assertEquals("TRap", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_TrAP() {
        String toParse = "TrAP";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.TRAP, lexer.getTokenType());
        Assert.assertEquals("TrAP", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_TrAp() {
        String toParse = "TrAp";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.TRAP, lexer.getTokenType());
        Assert.assertEquals("TrAp", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_TraP() {
        String toParse = "TraP";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.TRAP, lexer.getTokenType());
        Assert.assertEquals("TraP", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_Trap() {
        String toParse = "Trap";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.TRAP, lexer.getTokenType());
        Assert.assertEquals("Trap", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_tRAP() {
        String toParse = "tRAP";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.TRAP, lexer.getTokenType());
        Assert.assertEquals("tRAP", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_tRAp() {
        String toParse = "tRAp";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.TRAP, lexer.getTokenType());
        Assert.assertEquals("tRAp", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_tRaP() {
        String toParse = "tRaP";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.TRAP, lexer.getTokenType());
        Assert.assertEquals("tRaP", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_tRap() {
        String toParse = "tRap";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.TRAP, lexer.getTokenType());
        Assert.assertEquals("tRap", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_trAP() {
        String toParse = "trAP";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.TRAP, lexer.getTokenType());
        Assert.assertEquals("trAP", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_trAp() {
        String toParse = "trAp";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.TRAP, lexer.getTokenType());
        Assert.assertEquals("trAp", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_traP() {
        String toParse = "traP";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.TRAP, lexer.getTokenType());
        Assert.assertEquals("traP", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_trap() {
        String toParse = "trap";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.TRAP, lexer.getTokenType());
        Assert.assertEquals("trap", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

}
