package com.innovatian.idea.powershell.test.lang.lexer.keywords;

import com.innovatian.idea.powershell.lang.lexer.PsTokenTypes;
import com.innovatian.idea.powershell.test.lang.lexer.PsLexerTestContext;
import junit.framework.Assert;

public class PsLexerTestsKeywordData extends PsLexerTestContext {
    public void testKeyword_DATA() {
        String toParse = "DATA";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.DATA, lexer.getTokenType());
        Assert.assertEquals("DATA", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_DATa() {
        String toParse = "DATa";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.DATA, lexer.getTokenType());
        Assert.assertEquals("DATa", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_DAtA() {
        String toParse = "DAtA";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.DATA, lexer.getTokenType());
        Assert.assertEquals("DAtA", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_DAta() {
        String toParse = "DAta";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.DATA, lexer.getTokenType());
        Assert.assertEquals("DAta", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_DaTA() {
        String toParse = "DaTA";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.DATA, lexer.getTokenType());
        Assert.assertEquals("DaTA", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_DaTa() {
        String toParse = "DaTa";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.DATA, lexer.getTokenType());
        Assert.assertEquals("DaTa", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_DatA() {
        String toParse = "DatA";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.DATA, lexer.getTokenType());
        Assert.assertEquals("DatA", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_Data() {
        String toParse = "Data";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.DATA, lexer.getTokenType());
        Assert.assertEquals("Data", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_dATA() {
        String toParse = "dATA";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.DATA, lexer.getTokenType());
        Assert.assertEquals("dATA", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_dATa() {
        String toParse = "dATa";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.DATA, lexer.getTokenType());
        Assert.assertEquals("dATa", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_dAtA() {
        String toParse = "dAtA";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.DATA, lexer.getTokenType());
        Assert.assertEquals("dAtA", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_dAta() {
        String toParse = "dAta";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.DATA, lexer.getTokenType());
        Assert.assertEquals("dAta", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_daTA() {
        String toParse = "daTA";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.DATA, lexer.getTokenType());
        Assert.assertEquals("daTA", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_daTa() {
        String toParse = "daTa";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.DATA, lexer.getTokenType());
        Assert.assertEquals("daTa", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_datA() {
        String toParse = "datA";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.DATA, lexer.getTokenType());
        Assert.assertEquals("datA", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_data() {
        String toParse = "data";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.DATA, lexer.getTokenType());
        Assert.assertEquals("data", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

}
