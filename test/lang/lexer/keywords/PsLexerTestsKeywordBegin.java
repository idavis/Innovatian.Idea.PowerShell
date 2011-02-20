package com.innovatian.idea.powershell.test.lang.lexer.keywords;

import com.innovatian.idea.powershell.lang.lexer.PsTokenTypes;
import com.innovatian.idea.powershell.test.lang.lexer.PsLexerTestContext;
import junit.framework.Assert;

public class PsLexerTestsKeywordBegin extends PsLexerTestContext {
    public void testKeyword_BEGIN() {
        String toParse = "BEGIN";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.BEGIN, lexer.getTokenType());
        Assert.assertEquals("BEGIN", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_BEGIn() {
        String toParse = "BEGIn";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.BEGIN, lexer.getTokenType());
        Assert.assertEquals("BEGIn", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_BEGiN() {
        String toParse = "BEGiN";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.BEGIN, lexer.getTokenType());
        Assert.assertEquals("BEGiN", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_BEGin() {
        String toParse = "BEGin";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.BEGIN, lexer.getTokenType());
        Assert.assertEquals("BEGin", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_BEgIN() {
        String toParse = "BEgIN";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.BEGIN, lexer.getTokenType());
        Assert.assertEquals("BEgIN", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_BEgIn() {
        String toParse = "BEgIn";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.BEGIN, lexer.getTokenType());
        Assert.assertEquals("BEgIn", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_BEgiN() {
        String toParse = "BEgiN";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.BEGIN, lexer.getTokenType());
        Assert.assertEquals("BEgiN", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_BEgin() {
        String toParse = "BEgin";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.BEGIN, lexer.getTokenType());
        Assert.assertEquals("BEgin", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_BeGIN() {
        String toParse = "BeGIN";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.BEGIN, lexer.getTokenType());
        Assert.assertEquals("BeGIN", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_BeGIn() {
        String toParse = "BeGIn";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.BEGIN, lexer.getTokenType());
        Assert.assertEquals("BeGIn", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_BeGiN() {
        String toParse = "BeGiN";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.BEGIN, lexer.getTokenType());
        Assert.assertEquals("BeGiN", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_BeGin() {
        String toParse = "BeGin";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.BEGIN, lexer.getTokenType());
        Assert.assertEquals("BeGin", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_BegIN() {
        String toParse = "BegIN";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.BEGIN, lexer.getTokenType());
        Assert.assertEquals("BegIN", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_BegIn() {
        String toParse = "BegIn";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.BEGIN, lexer.getTokenType());
        Assert.assertEquals("BegIn", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_BegiN() {
        String toParse = "BegiN";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.BEGIN, lexer.getTokenType());
        Assert.assertEquals("BegiN", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_Begin() {
        String toParse = "Begin";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.BEGIN, lexer.getTokenType());
        Assert.assertEquals("Begin", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_bEGIN() {
        String toParse = "bEGIN";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.BEGIN, lexer.getTokenType());
        Assert.assertEquals("bEGIN", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_bEGIn() {
        String toParse = "bEGIn";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.BEGIN, lexer.getTokenType());
        Assert.assertEquals("bEGIn", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_bEGiN() {
        String toParse = "bEGiN";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.BEGIN, lexer.getTokenType());
        Assert.assertEquals("bEGiN", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_bEGin() {
        String toParse = "bEGin";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.BEGIN, lexer.getTokenType());
        Assert.assertEquals("bEGin", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_bEgIN() {
        String toParse = "bEgIN";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.BEGIN, lexer.getTokenType());
        Assert.assertEquals("bEgIN", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_bEgIn() {
        String toParse = "bEgIn";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.BEGIN, lexer.getTokenType());
        Assert.assertEquals("bEgIn", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_bEgiN() {
        String toParse = "bEgiN";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.BEGIN, lexer.getTokenType());
        Assert.assertEquals("bEgiN", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_bEgin() {
        String toParse = "bEgin";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.BEGIN, lexer.getTokenType());
        Assert.assertEquals("bEgin", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_beGIN() {
        String toParse = "beGIN";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.BEGIN, lexer.getTokenType());
        Assert.assertEquals("beGIN", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_beGIn() {
        String toParse = "beGIn";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.BEGIN, lexer.getTokenType());
        Assert.assertEquals("beGIn", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_beGiN() {
        String toParse = "beGiN";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.BEGIN, lexer.getTokenType());
        Assert.assertEquals("beGiN", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_beGin() {
        String toParse = "beGin";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.BEGIN, lexer.getTokenType());
        Assert.assertEquals("beGin", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_begIN() {
        String toParse = "begIN";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.BEGIN, lexer.getTokenType());
        Assert.assertEquals("begIN", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_begIn() {
        String toParse = "begIn";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.BEGIN, lexer.getTokenType());
        Assert.assertEquals("begIn", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_begiN() {
        String toParse = "begiN";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.BEGIN, lexer.getTokenType());
        Assert.assertEquals("begiN", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_begin() {
        String toParse = "begin";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.BEGIN, lexer.getTokenType());
        Assert.assertEquals("begin", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

}
