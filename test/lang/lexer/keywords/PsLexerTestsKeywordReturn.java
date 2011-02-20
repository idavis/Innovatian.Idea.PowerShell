package com.innovatian.idea.powershell.test.lang.lexer.keywords;

import com.innovatian.idea.powershell.lang.lexer.PsTokenTypes;
import com.innovatian.idea.powershell.test.lang.lexer.PsLexerTestContext;
import junit.framework.Assert;

public class PsLexerTestsKeywordReturn extends PsLexerTestContext {
    public void testKeyword_RETURN() {
        String toParse = "RETURN";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.RETURN, lexer.getTokenType());
        Assert.assertEquals("RETURN", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_RETURn() {
        String toParse = "RETURn";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.RETURN, lexer.getTokenType());
        Assert.assertEquals("RETURn", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_RETUrN() {
        String toParse = "RETUrN";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.RETURN, lexer.getTokenType());
        Assert.assertEquals("RETUrN", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_RETUrn() {
        String toParse = "RETUrn";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.RETURN, lexer.getTokenType());
        Assert.assertEquals("RETUrn", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_RETuRN() {
        String toParse = "RETuRN";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.RETURN, lexer.getTokenType());
        Assert.assertEquals("RETuRN", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_RETuRn() {
        String toParse = "RETuRn";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.RETURN, lexer.getTokenType());
        Assert.assertEquals("RETuRn", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_RETurN() {
        String toParse = "RETurN";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.RETURN, lexer.getTokenType());
        Assert.assertEquals("RETurN", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_RETurn() {
        String toParse = "RETurn";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.RETURN, lexer.getTokenType());
        Assert.assertEquals("RETurn", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_REtURN() {
        String toParse = "REtURN";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.RETURN, lexer.getTokenType());
        Assert.assertEquals("REtURN", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_REtURn() {
        String toParse = "REtURn";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.RETURN, lexer.getTokenType());
        Assert.assertEquals("REtURn", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_REtUrN() {
        String toParse = "REtUrN";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.RETURN, lexer.getTokenType());
        Assert.assertEquals("REtUrN", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_REtUrn() {
        String toParse = "REtUrn";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.RETURN, lexer.getTokenType());
        Assert.assertEquals("REtUrn", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_REtuRN() {
        String toParse = "REtuRN";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.RETURN, lexer.getTokenType());
        Assert.assertEquals("REtuRN", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_REtuRn() {
        String toParse = "REtuRn";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.RETURN, lexer.getTokenType());
        Assert.assertEquals("REtuRn", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_REturN() {
        String toParse = "REturN";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.RETURN, lexer.getTokenType());
        Assert.assertEquals("REturN", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_REturn() {
        String toParse = "REturn";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.RETURN, lexer.getTokenType());
        Assert.assertEquals("REturn", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_ReTURN() {
        String toParse = "ReTURN";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.RETURN, lexer.getTokenType());
        Assert.assertEquals("ReTURN", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_ReTURn() {
        String toParse = "ReTURn";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.RETURN, lexer.getTokenType());
        Assert.assertEquals("ReTURn", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_ReTUrN() {
        String toParse = "ReTUrN";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.RETURN, lexer.getTokenType());
        Assert.assertEquals("ReTUrN", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_ReTUrn() {
        String toParse = "ReTUrn";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.RETURN, lexer.getTokenType());
        Assert.assertEquals("ReTUrn", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_ReTuRN() {
        String toParse = "ReTuRN";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.RETURN, lexer.getTokenType());
        Assert.assertEquals("ReTuRN", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_ReTuRn() {
        String toParse = "ReTuRn";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.RETURN, lexer.getTokenType());
        Assert.assertEquals("ReTuRn", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_ReTurN() {
        String toParse = "ReTurN";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.RETURN, lexer.getTokenType());
        Assert.assertEquals("ReTurN", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_ReTurn() {
        String toParse = "ReTurn";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.RETURN, lexer.getTokenType());
        Assert.assertEquals("ReTurn", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_RetURN() {
        String toParse = "RetURN";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.RETURN, lexer.getTokenType());
        Assert.assertEquals("RetURN", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_RetURn() {
        String toParse = "RetURn";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.RETURN, lexer.getTokenType());
        Assert.assertEquals("RetURn", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_RetUrN() {
        String toParse = "RetUrN";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.RETURN, lexer.getTokenType());
        Assert.assertEquals("RetUrN", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_RetUrn() {
        String toParse = "RetUrn";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.RETURN, lexer.getTokenType());
        Assert.assertEquals("RetUrn", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_RetuRN() {
        String toParse = "RetuRN";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.RETURN, lexer.getTokenType());
        Assert.assertEquals("RetuRN", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_RetuRn() {
        String toParse = "RetuRn";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.RETURN, lexer.getTokenType());
        Assert.assertEquals("RetuRn", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_ReturN() {
        String toParse = "ReturN";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.RETURN, lexer.getTokenType());
        Assert.assertEquals("ReturN", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_Return() {
        String toParse = "Return";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.RETURN, lexer.getTokenType());
        Assert.assertEquals("Return", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_rETURN() {
        String toParse = "rETURN";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.RETURN, lexer.getTokenType());
        Assert.assertEquals("rETURN", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_rETURn() {
        String toParse = "rETURn";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.RETURN, lexer.getTokenType());
        Assert.assertEquals("rETURn", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_rETUrN() {
        String toParse = "rETUrN";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.RETURN, lexer.getTokenType());
        Assert.assertEquals("rETUrN", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_rETUrn() {
        String toParse = "rETUrn";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.RETURN, lexer.getTokenType());
        Assert.assertEquals("rETUrn", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_rETuRN() {
        String toParse = "rETuRN";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.RETURN, lexer.getTokenType());
        Assert.assertEquals("rETuRN", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_rETuRn() {
        String toParse = "rETuRn";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.RETURN, lexer.getTokenType());
        Assert.assertEquals("rETuRn", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_rETurN() {
        String toParse = "rETurN";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.RETURN, lexer.getTokenType());
        Assert.assertEquals("rETurN", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_rETurn() {
        String toParse = "rETurn";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.RETURN, lexer.getTokenType());
        Assert.assertEquals("rETurn", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_rEtURN() {
        String toParse = "rEtURN";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.RETURN, lexer.getTokenType());
        Assert.assertEquals("rEtURN", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_rEtURn() {
        String toParse = "rEtURn";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.RETURN, lexer.getTokenType());
        Assert.assertEquals("rEtURn", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_rEtUrN() {
        String toParse = "rEtUrN";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.RETURN, lexer.getTokenType());
        Assert.assertEquals("rEtUrN", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_rEtUrn() {
        String toParse = "rEtUrn";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.RETURN, lexer.getTokenType());
        Assert.assertEquals("rEtUrn", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_rEtuRN() {
        String toParse = "rEtuRN";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.RETURN, lexer.getTokenType());
        Assert.assertEquals("rEtuRN", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_rEtuRn() {
        String toParse = "rEtuRn";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.RETURN, lexer.getTokenType());
        Assert.assertEquals("rEtuRn", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_rEturN() {
        String toParse = "rEturN";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.RETURN, lexer.getTokenType());
        Assert.assertEquals("rEturN", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_rEturn() {
        String toParse = "rEturn";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.RETURN, lexer.getTokenType());
        Assert.assertEquals("rEturn", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_reTURN() {
        String toParse = "reTURN";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.RETURN, lexer.getTokenType());
        Assert.assertEquals("reTURN", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_reTURn() {
        String toParse = "reTURn";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.RETURN, lexer.getTokenType());
        Assert.assertEquals("reTURn", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_reTUrN() {
        String toParse = "reTUrN";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.RETURN, lexer.getTokenType());
        Assert.assertEquals("reTUrN", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_reTUrn() {
        String toParse = "reTUrn";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.RETURN, lexer.getTokenType());
        Assert.assertEquals("reTUrn", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_reTuRN() {
        String toParse = "reTuRN";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.RETURN, lexer.getTokenType());
        Assert.assertEquals("reTuRN", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_reTuRn() {
        String toParse = "reTuRn";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.RETURN, lexer.getTokenType());
        Assert.assertEquals("reTuRn", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_reTurN() {
        String toParse = "reTurN";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.RETURN, lexer.getTokenType());
        Assert.assertEquals("reTurN", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_reTurn() {
        String toParse = "reTurn";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.RETURN, lexer.getTokenType());
        Assert.assertEquals("reTurn", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_retURN() {
        String toParse = "retURN";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.RETURN, lexer.getTokenType());
        Assert.assertEquals("retURN", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_retURn() {
        String toParse = "retURn";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.RETURN, lexer.getTokenType());
        Assert.assertEquals("retURn", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_retUrN() {
        String toParse = "retUrN";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.RETURN, lexer.getTokenType());
        Assert.assertEquals("retUrN", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_retUrn() {
        String toParse = "retUrn";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.RETURN, lexer.getTokenType());
        Assert.assertEquals("retUrn", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_retuRN() {
        String toParse = "retuRN";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.RETURN, lexer.getTokenType());
        Assert.assertEquals("retuRN", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_retuRn() {
        String toParse = "retuRn";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.RETURN, lexer.getTokenType());
        Assert.assertEquals("retuRn", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_returN() {
        String toParse = "returN";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.RETURN, lexer.getTokenType());
        Assert.assertEquals("returN", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_return() {
        String toParse = "return";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.RETURN, lexer.getTokenType());
        Assert.assertEquals("return", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

}
