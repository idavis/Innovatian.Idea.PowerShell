package com.innovatian.idea.powershell.test.lang.lexer.keywords;

import com.innovatian.idea.powershell.lang.lexer.PsTokenTypes;
import com.innovatian.idea.powershell.test.lang.lexer.PsLexerTestContext;
import junit.framework.Assert;

public class PsLexerTestsKeywordWhile extends PsLexerTestContext {
    public void testKeyword_WHILE() {
        String toParse = "WHILE";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.WHILE, lexer.getTokenType());
        Assert.assertEquals("WHILE", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_WHILe() {
        String toParse = "WHILe";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.WHILE, lexer.getTokenType());
        Assert.assertEquals("WHILe", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_WHIlE() {
        String toParse = "WHIlE";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.WHILE, lexer.getTokenType());
        Assert.assertEquals("WHIlE", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_WHIle() {
        String toParse = "WHIle";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.WHILE, lexer.getTokenType());
        Assert.assertEquals("WHIle", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_WHiLE() {
        String toParse = "WHiLE";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.WHILE, lexer.getTokenType());
        Assert.assertEquals("WHiLE", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_WHiLe() {
        String toParse = "WHiLe";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.WHILE, lexer.getTokenType());
        Assert.assertEquals("WHiLe", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_WHilE() {
        String toParse = "WHilE";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.WHILE, lexer.getTokenType());
        Assert.assertEquals("WHilE", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_WHile() {
        String toParse = "WHile";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.WHILE, lexer.getTokenType());
        Assert.assertEquals("WHile", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_WhILE() {
        String toParse = "WhILE";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.WHILE, lexer.getTokenType());
        Assert.assertEquals("WhILE", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_WhILe() {
        String toParse = "WhILe";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.WHILE, lexer.getTokenType());
        Assert.assertEquals("WhILe", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_WhIlE() {
        String toParse = "WhIlE";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.WHILE, lexer.getTokenType());
        Assert.assertEquals("WhIlE", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_WhIle() {
        String toParse = "WhIle";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.WHILE, lexer.getTokenType());
        Assert.assertEquals("WhIle", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_WhiLE() {
        String toParse = "WhiLE";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.WHILE, lexer.getTokenType());
        Assert.assertEquals("WhiLE", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_WhiLe() {
        String toParse = "WhiLe";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.WHILE, lexer.getTokenType());
        Assert.assertEquals("WhiLe", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_WhilE() {
        String toParse = "WhilE";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.WHILE, lexer.getTokenType());
        Assert.assertEquals("WhilE", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_While() {
        String toParse = "While";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.WHILE, lexer.getTokenType());
        Assert.assertEquals("While", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_wHILE() {
        String toParse = "wHILE";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.WHILE, lexer.getTokenType());
        Assert.assertEquals("wHILE", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_wHILe() {
        String toParse = "wHILe";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.WHILE, lexer.getTokenType());
        Assert.assertEquals("wHILe", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_wHIlE() {
        String toParse = "wHIlE";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.WHILE, lexer.getTokenType());
        Assert.assertEquals("wHIlE", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_wHIle() {
        String toParse = "wHIle";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.WHILE, lexer.getTokenType());
        Assert.assertEquals("wHIle", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_wHiLE() {
        String toParse = "wHiLE";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.WHILE, lexer.getTokenType());
        Assert.assertEquals("wHiLE", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_wHiLe() {
        String toParse = "wHiLe";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.WHILE, lexer.getTokenType());
        Assert.assertEquals("wHiLe", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_wHilE() {
        String toParse = "wHilE";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.WHILE, lexer.getTokenType());
        Assert.assertEquals("wHilE", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_wHile() {
        String toParse = "wHile";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.WHILE, lexer.getTokenType());
        Assert.assertEquals("wHile", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_whILE() {
        String toParse = "whILE";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.WHILE, lexer.getTokenType());
        Assert.assertEquals("whILE", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_whILe() {
        String toParse = "whILe";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.WHILE, lexer.getTokenType());
        Assert.assertEquals("whILe", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_whIlE() {
        String toParse = "whIlE";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.WHILE, lexer.getTokenType());
        Assert.assertEquals("whIlE", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_whIle() {
        String toParse = "whIle";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.WHILE, lexer.getTokenType());
        Assert.assertEquals("whIle", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_whiLE() {
        String toParse = "whiLE";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.WHILE, lexer.getTokenType());
        Assert.assertEquals("whiLE", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_whiLe() {
        String toParse = "whiLe";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.WHILE, lexer.getTokenType());
        Assert.assertEquals("whiLe", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_whilE() {
        String toParse = "whilE";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.WHILE, lexer.getTokenType());
        Assert.assertEquals("whilE", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_while() {
        String toParse = "while";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.WHILE, lexer.getTokenType());
        Assert.assertEquals("while", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

}
