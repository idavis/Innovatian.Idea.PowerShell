package com.innovatian.idea.powershell.test.lang.lexer.keywords;

import com.innovatian.idea.powershell.lang.lexer.PsTokenTypes;
import com.innovatian.idea.powershell.test.lang.lexer.PsLexerTestContext;
import junit.framework.Assert;

public class PsLexerTestsKeywordElse extends PsLexerTestContext {
    public void testKeyword_ELSE() {
        String toParse = "ELSE";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.ELSE, lexer.getTokenType());
        Assert.assertEquals("ELSE", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_ELSe() {
        String toParse = "ELSe";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.ELSE, lexer.getTokenType());
        Assert.assertEquals("ELSe", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_ELsE() {
        String toParse = "ELsE";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.ELSE, lexer.getTokenType());
        Assert.assertEquals("ELsE", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_ELse() {
        String toParse = "ELse";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.ELSE, lexer.getTokenType());
        Assert.assertEquals("ELse", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_ElSE() {
        String toParse = "ElSE";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.ELSE, lexer.getTokenType());
        Assert.assertEquals("ElSE", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_ElSe() {
        String toParse = "ElSe";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.ELSE, lexer.getTokenType());
        Assert.assertEquals("ElSe", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_ElsE() {
        String toParse = "ElsE";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.ELSE, lexer.getTokenType());
        Assert.assertEquals("ElsE", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_Else() {
        String toParse = "Else";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.ELSE, lexer.getTokenType());
        Assert.assertEquals("Else", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_eLSE() {
        String toParse = "eLSE";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.ELSE, lexer.getTokenType());
        Assert.assertEquals("eLSE", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_eLSe() {
        String toParse = "eLSe";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.ELSE, lexer.getTokenType());
        Assert.assertEquals("eLSe", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_eLsE() {
        String toParse = "eLsE";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.ELSE, lexer.getTokenType());
        Assert.assertEquals("eLsE", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_eLse() {
        String toParse = "eLse";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.ELSE, lexer.getTokenType());
        Assert.assertEquals("eLse", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_elSE() {
        String toParse = "elSE";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.ELSE, lexer.getTokenType());
        Assert.assertEquals("elSE", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_elSe() {
        String toParse = "elSe";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.ELSE, lexer.getTokenType());
        Assert.assertEquals("elSe", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_elsE() {
        String toParse = "elsE";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.ELSE, lexer.getTokenType());
        Assert.assertEquals("elsE", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_else() {
        String toParse = "else";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.ELSE, lexer.getTokenType());
        Assert.assertEquals("else", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

}
