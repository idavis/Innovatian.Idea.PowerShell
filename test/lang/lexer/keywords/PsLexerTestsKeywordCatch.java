package com.innovatian.idea.powershell.test.lang.lexer.keywords;

import com.innovatian.idea.powershell.lang.lexer.PsTokenTypes;
import com.innovatian.idea.powershell.test.lang.lexer.PsLexerTestContext;
import junit.framework.Assert;

public class PsLexerTestsKeywordCatch extends PsLexerTestContext {
    public void testKeyword_CATCH() {
        String toParse = "CATCH";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CATCH, lexer.getTokenType());
        Assert.assertEquals("CATCH", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_CATCh() {
        String toParse = "CATCh";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CATCH, lexer.getTokenType());
        Assert.assertEquals("CATCh", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_CATcH() {
        String toParse = "CATcH";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CATCH, lexer.getTokenType());
        Assert.assertEquals("CATcH", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_CATch() {
        String toParse = "CATch";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CATCH, lexer.getTokenType());
        Assert.assertEquals("CATch", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_CAtCH() {
        String toParse = "CAtCH";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CATCH, lexer.getTokenType());
        Assert.assertEquals("CAtCH", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_CAtCh() {
        String toParse = "CAtCh";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CATCH, lexer.getTokenType());
        Assert.assertEquals("CAtCh", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_CAtcH() {
        String toParse = "CAtcH";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CATCH, lexer.getTokenType());
        Assert.assertEquals("CAtcH", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_CAtch() {
        String toParse = "CAtch";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CATCH, lexer.getTokenType());
        Assert.assertEquals("CAtch", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_CaTCH() {
        String toParse = "CaTCH";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CATCH, lexer.getTokenType());
        Assert.assertEquals("CaTCH", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_CaTCh() {
        String toParse = "CaTCh";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CATCH, lexer.getTokenType());
        Assert.assertEquals("CaTCh", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_CaTcH() {
        String toParse = "CaTcH";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CATCH, lexer.getTokenType());
        Assert.assertEquals("CaTcH", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_CaTch() {
        String toParse = "CaTch";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CATCH, lexer.getTokenType());
        Assert.assertEquals("CaTch", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_CatCH() {
        String toParse = "CatCH";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CATCH, lexer.getTokenType());
        Assert.assertEquals("CatCH", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_CatCh() {
        String toParse = "CatCh";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CATCH, lexer.getTokenType());
        Assert.assertEquals("CatCh", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_CatcH() {
        String toParse = "CatcH";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CATCH, lexer.getTokenType());
        Assert.assertEquals("CatcH", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_Catch() {
        String toParse = "Catch";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CATCH, lexer.getTokenType());
        Assert.assertEquals("Catch", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_cATCH() {
        String toParse = "cATCH";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CATCH, lexer.getTokenType());
        Assert.assertEquals("cATCH", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_cATCh() {
        String toParse = "cATCh";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CATCH, lexer.getTokenType());
        Assert.assertEquals("cATCh", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_cATcH() {
        String toParse = "cATcH";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CATCH, lexer.getTokenType());
        Assert.assertEquals("cATcH", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_cATch() {
        String toParse = "cATch";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CATCH, lexer.getTokenType());
        Assert.assertEquals("cATch", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_cAtCH() {
        String toParse = "cAtCH";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CATCH, lexer.getTokenType());
        Assert.assertEquals("cAtCH", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_cAtCh() {
        String toParse = "cAtCh";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CATCH, lexer.getTokenType());
        Assert.assertEquals("cAtCh", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_cAtcH() {
        String toParse = "cAtcH";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CATCH, lexer.getTokenType());
        Assert.assertEquals("cAtcH", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_cAtch() {
        String toParse = "cAtch";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CATCH, lexer.getTokenType());
        Assert.assertEquals("cAtch", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_caTCH() {
        String toParse = "caTCH";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CATCH, lexer.getTokenType());
        Assert.assertEquals("caTCH", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_caTCh() {
        String toParse = "caTCh";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CATCH, lexer.getTokenType());
        Assert.assertEquals("caTCh", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_caTcH() {
        String toParse = "caTcH";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CATCH, lexer.getTokenType());
        Assert.assertEquals("caTcH", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_caTch() {
        String toParse = "caTch";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CATCH, lexer.getTokenType());
        Assert.assertEquals("caTch", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_catCH() {
        String toParse = "catCH";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CATCH, lexer.getTokenType());
        Assert.assertEquals("catCH", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_catCh() {
        String toParse = "catCh";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CATCH, lexer.getTokenType());
        Assert.assertEquals("catCh", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_catcH() {
        String toParse = "catcH";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CATCH, lexer.getTokenType());
        Assert.assertEquals("catcH", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_catch() {
        String toParse = "catch";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CATCH, lexer.getTokenType());
        Assert.assertEquals("catch", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

}
