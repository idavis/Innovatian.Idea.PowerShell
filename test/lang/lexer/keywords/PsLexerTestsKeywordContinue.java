package com.innovatian.idea.powershell.test.lang.lexer.keywords;

import com.innovatian.idea.powershell.lang.lexer.PsTokenTypes;
import com.innovatian.idea.powershell.test.lang.lexer.PsLexerTestContext;
import junit.framework.Assert;

public class PsLexerTestsKeywordContinue extends PsLexerTestContext {
    public void testKeyword_CONTINUE() {
        String toParse = "CONTINUE";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("CONTINUE", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_CONTINUe() {
        String toParse = "CONTINUe";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("CONTINUe", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_CONTINuE() {
        String toParse = "CONTINuE";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("CONTINuE", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_CONTINue() {
        String toParse = "CONTINue";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("CONTINue", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_CONTInUE() {
        String toParse = "CONTInUE";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("CONTInUE", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_CONTInUe() {
        String toParse = "CONTInUe";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("CONTInUe", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_CONTInuE() {
        String toParse = "CONTInuE";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("CONTInuE", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_CONTInue() {
        String toParse = "CONTInue";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("CONTInue", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_CONTiNUE() {
        String toParse = "CONTiNUE";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("CONTiNUE", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_CONTiNUe() {
        String toParse = "CONTiNUe";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("CONTiNUe", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_CONTiNuE() {
        String toParse = "CONTiNuE";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("CONTiNuE", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_CONTiNue() {
        String toParse = "CONTiNue";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("CONTiNue", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_CONTinUE() {
        String toParse = "CONTinUE";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("CONTinUE", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_CONTinUe() {
        String toParse = "CONTinUe";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("CONTinUe", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_CONTinuE() {
        String toParse = "CONTinuE";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("CONTinuE", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_CONTinue() {
        String toParse = "CONTinue";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("CONTinue", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_CONtINUE() {
        String toParse = "CONtINUE";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("CONtINUE", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_CONtINUe() {
        String toParse = "CONtINUe";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("CONtINUe", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_CONtINuE() {
        String toParse = "CONtINuE";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("CONtINuE", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_CONtINue() {
        String toParse = "CONtINue";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("CONtINue", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_CONtInUE() {
        String toParse = "CONtInUE";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("CONtInUE", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_CONtInUe() {
        String toParse = "CONtInUe";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("CONtInUe", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_CONtInuE() {
        String toParse = "CONtInuE";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("CONtInuE", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_CONtInue() {
        String toParse = "CONtInue";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("CONtInue", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_CONtiNUE() {
        String toParse = "CONtiNUE";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("CONtiNUE", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_CONtiNUe() {
        String toParse = "CONtiNUe";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("CONtiNUe", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_CONtiNuE() {
        String toParse = "CONtiNuE";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("CONtiNuE", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_CONtiNue() {
        String toParse = "CONtiNue";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("CONtiNue", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_CONtinUE() {
        String toParse = "CONtinUE";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("CONtinUE", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_CONtinUe() {
        String toParse = "CONtinUe";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("CONtinUe", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_CONtinuE() {
        String toParse = "CONtinuE";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("CONtinuE", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_CONtinue() {
        String toParse = "CONtinue";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("CONtinue", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_COnTINUE() {
        String toParse = "COnTINUE";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("COnTINUE", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_COnTINUe() {
        String toParse = "COnTINUe";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("COnTINUe", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_COnTINuE() {
        String toParse = "COnTINuE";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("COnTINuE", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_COnTINue() {
        String toParse = "COnTINue";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("COnTINue", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_COnTInUE() {
        String toParse = "COnTInUE";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("COnTInUE", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_COnTInUe() {
        String toParse = "COnTInUe";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("COnTInUe", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_COnTInuE() {
        String toParse = "COnTInuE";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("COnTInuE", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_COnTInue() {
        String toParse = "COnTInue";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("COnTInue", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_COnTiNUE() {
        String toParse = "COnTiNUE";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("COnTiNUE", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_COnTiNUe() {
        String toParse = "COnTiNUe";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("COnTiNUe", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_COnTiNuE() {
        String toParse = "COnTiNuE";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("COnTiNuE", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_COnTiNue() {
        String toParse = "COnTiNue";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("COnTiNue", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_COnTinUE() {
        String toParse = "COnTinUE";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("COnTinUE", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_COnTinUe() {
        String toParse = "COnTinUe";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("COnTinUe", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_COnTinuE() {
        String toParse = "COnTinuE";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("COnTinuE", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_COnTinue() {
        String toParse = "COnTinue";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("COnTinue", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_COntINUE() {
        String toParse = "COntINUE";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("COntINUE", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_COntINUe() {
        String toParse = "COntINUe";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("COntINUe", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_COntINuE() {
        String toParse = "COntINuE";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("COntINuE", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_COntINue() {
        String toParse = "COntINue";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("COntINue", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_COntInUE() {
        String toParse = "COntInUE";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("COntInUE", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_COntInUe() {
        String toParse = "COntInUe";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("COntInUe", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_COntInuE() {
        String toParse = "COntInuE";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("COntInuE", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_COntInue() {
        String toParse = "COntInue";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("COntInue", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_COntiNUE() {
        String toParse = "COntiNUE";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("COntiNUE", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_COntiNUe() {
        String toParse = "COntiNUe";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("COntiNUe", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_COntiNuE() {
        String toParse = "COntiNuE";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("COntiNuE", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_COntiNue() {
        String toParse = "COntiNue";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("COntiNue", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_COntinUE() {
        String toParse = "COntinUE";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("COntinUE", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_COntinUe() {
        String toParse = "COntinUe";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("COntinUe", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_COntinuE() {
        String toParse = "COntinuE";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("COntinuE", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_COntinue() {
        String toParse = "COntinue";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("COntinue", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_CoNTINUE() {
        String toParse = "CoNTINUE";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("CoNTINUE", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_CoNTINUe() {
        String toParse = "CoNTINUe";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("CoNTINUe", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_CoNTINuE() {
        String toParse = "CoNTINuE";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("CoNTINuE", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_CoNTINue() {
        String toParse = "CoNTINue";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("CoNTINue", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_CoNTInUE() {
        String toParse = "CoNTInUE";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("CoNTInUE", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_CoNTInUe() {
        String toParse = "CoNTInUe";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("CoNTInUe", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_CoNTInuE() {
        String toParse = "CoNTInuE";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("CoNTInuE", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_CoNTInue() {
        String toParse = "CoNTInue";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("CoNTInue", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_CoNTiNUE() {
        String toParse = "CoNTiNUE";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("CoNTiNUE", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_CoNTiNUe() {
        String toParse = "CoNTiNUe";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("CoNTiNUe", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_CoNTiNuE() {
        String toParse = "CoNTiNuE";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("CoNTiNuE", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_CoNTiNue() {
        String toParse = "CoNTiNue";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("CoNTiNue", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_CoNTinUE() {
        String toParse = "CoNTinUE";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("CoNTinUE", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_CoNTinUe() {
        String toParse = "CoNTinUe";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("CoNTinUe", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_CoNTinuE() {
        String toParse = "CoNTinuE";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("CoNTinuE", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_CoNTinue() {
        String toParse = "CoNTinue";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("CoNTinue", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_CoNtINUE() {
        String toParse = "CoNtINUE";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("CoNtINUE", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_CoNtINUe() {
        String toParse = "CoNtINUe";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("CoNtINUe", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_CoNtINuE() {
        String toParse = "CoNtINuE";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("CoNtINuE", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_CoNtINue() {
        String toParse = "CoNtINue";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("CoNtINue", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_CoNtInUE() {
        String toParse = "CoNtInUE";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("CoNtInUE", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_CoNtInUe() {
        String toParse = "CoNtInUe";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("CoNtInUe", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_CoNtInuE() {
        String toParse = "CoNtInuE";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("CoNtInuE", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_CoNtInue() {
        String toParse = "CoNtInue";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("CoNtInue", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_CoNtiNUE() {
        String toParse = "CoNtiNUE";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("CoNtiNUE", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_CoNtiNUe() {
        String toParse = "CoNtiNUe";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("CoNtiNUe", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_CoNtiNuE() {
        String toParse = "CoNtiNuE";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("CoNtiNuE", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_CoNtiNue() {
        String toParse = "CoNtiNue";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("CoNtiNue", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_CoNtinUE() {
        String toParse = "CoNtinUE";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("CoNtinUE", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_CoNtinUe() {
        String toParse = "CoNtinUe";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("CoNtinUe", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_CoNtinuE() {
        String toParse = "CoNtinuE";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("CoNtinuE", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_CoNtinue() {
        String toParse = "CoNtinue";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("CoNtinue", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_ConTINUE() {
        String toParse = "ConTINUE";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("ConTINUE", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_ConTINUe() {
        String toParse = "ConTINUe";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("ConTINUe", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_ConTINuE() {
        String toParse = "ConTINuE";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("ConTINuE", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_ConTINue() {
        String toParse = "ConTINue";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("ConTINue", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_ConTInUE() {
        String toParse = "ConTInUE";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("ConTInUE", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_ConTInUe() {
        String toParse = "ConTInUe";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("ConTInUe", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_ConTInuE() {
        String toParse = "ConTInuE";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("ConTInuE", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_ConTInue() {
        String toParse = "ConTInue";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("ConTInue", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_ConTiNUE() {
        String toParse = "ConTiNUE";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("ConTiNUE", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_ConTiNUe() {
        String toParse = "ConTiNUe";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("ConTiNUe", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_ConTiNuE() {
        String toParse = "ConTiNuE";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("ConTiNuE", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_ConTiNue() {
        String toParse = "ConTiNue";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("ConTiNue", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_ConTinUE() {
        String toParse = "ConTinUE";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("ConTinUE", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_ConTinUe() {
        String toParse = "ConTinUe";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("ConTinUe", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_ConTinuE() {
        String toParse = "ConTinuE";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("ConTinuE", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_ConTinue() {
        String toParse = "ConTinue";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("ConTinue", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_ContINUE() {
        String toParse = "ContINUE";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("ContINUE", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_ContINUe() {
        String toParse = "ContINUe";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("ContINUe", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_ContINuE() {
        String toParse = "ContINuE";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("ContINuE", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_ContINue() {
        String toParse = "ContINue";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("ContINue", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_ContInUE() {
        String toParse = "ContInUE";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("ContInUE", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_ContInUe() {
        String toParse = "ContInUe";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("ContInUe", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_ContInuE() {
        String toParse = "ContInuE";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("ContInuE", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_ContInue() {
        String toParse = "ContInue";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("ContInue", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_ContiNUE() {
        String toParse = "ContiNUE";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("ContiNUE", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_ContiNUe() {
        String toParse = "ContiNUe";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("ContiNUe", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_ContiNuE() {
        String toParse = "ContiNuE";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("ContiNuE", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_ContiNue() {
        String toParse = "ContiNue";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("ContiNue", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_ContinUE() {
        String toParse = "ContinUE";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("ContinUE", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_ContinUe() {
        String toParse = "ContinUe";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("ContinUe", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_ContinuE() {
        String toParse = "ContinuE";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("ContinuE", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_Continue() {
        String toParse = "Continue";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("Continue", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_cONTINUE() {
        String toParse = "cONTINUE";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("cONTINUE", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_cONTINUe() {
        String toParse = "cONTINUe";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("cONTINUe", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_cONTINuE() {
        String toParse = "cONTINuE";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("cONTINuE", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_cONTINue() {
        String toParse = "cONTINue";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("cONTINue", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_cONTInUE() {
        String toParse = "cONTInUE";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("cONTInUE", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_cONTInUe() {
        String toParse = "cONTInUe";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("cONTInUe", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_cONTInuE() {
        String toParse = "cONTInuE";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("cONTInuE", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_cONTInue() {
        String toParse = "cONTInue";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("cONTInue", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_cONTiNUE() {
        String toParse = "cONTiNUE";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("cONTiNUE", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_cONTiNUe() {
        String toParse = "cONTiNUe";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("cONTiNUe", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_cONTiNuE() {
        String toParse = "cONTiNuE";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("cONTiNuE", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_cONTiNue() {
        String toParse = "cONTiNue";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("cONTiNue", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_cONTinUE() {
        String toParse = "cONTinUE";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("cONTinUE", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_cONTinUe() {
        String toParse = "cONTinUe";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("cONTinUe", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_cONTinuE() {
        String toParse = "cONTinuE";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("cONTinuE", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_cONTinue() {
        String toParse = "cONTinue";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("cONTinue", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_cONtINUE() {
        String toParse = "cONtINUE";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("cONtINUE", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_cONtINUe() {
        String toParse = "cONtINUe";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("cONtINUe", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_cONtINuE() {
        String toParse = "cONtINuE";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("cONtINuE", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_cONtINue() {
        String toParse = "cONtINue";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("cONtINue", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_cONtInUE() {
        String toParse = "cONtInUE";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("cONtInUE", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_cONtInUe() {
        String toParse = "cONtInUe";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("cONtInUe", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_cONtInuE() {
        String toParse = "cONtInuE";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("cONtInuE", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_cONtInue() {
        String toParse = "cONtInue";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("cONtInue", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_cONtiNUE() {
        String toParse = "cONtiNUE";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("cONtiNUE", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_cONtiNUe() {
        String toParse = "cONtiNUe";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("cONtiNUe", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_cONtiNuE() {
        String toParse = "cONtiNuE";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("cONtiNuE", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_cONtiNue() {
        String toParse = "cONtiNue";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("cONtiNue", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_cONtinUE() {
        String toParse = "cONtinUE";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("cONtinUE", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_cONtinUe() {
        String toParse = "cONtinUe";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("cONtinUe", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_cONtinuE() {
        String toParse = "cONtinuE";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("cONtinuE", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_cONtinue() {
        String toParse = "cONtinue";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("cONtinue", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_cOnTINUE() {
        String toParse = "cOnTINUE";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("cOnTINUE", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_cOnTINUe() {
        String toParse = "cOnTINUe";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("cOnTINUe", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_cOnTINuE() {
        String toParse = "cOnTINuE";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("cOnTINuE", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_cOnTINue() {
        String toParse = "cOnTINue";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("cOnTINue", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_cOnTInUE() {
        String toParse = "cOnTInUE";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("cOnTInUE", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_cOnTInUe() {
        String toParse = "cOnTInUe";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("cOnTInUe", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_cOnTInuE() {
        String toParse = "cOnTInuE";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("cOnTInuE", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_cOnTInue() {
        String toParse = "cOnTInue";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("cOnTInue", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_cOnTiNUE() {
        String toParse = "cOnTiNUE";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("cOnTiNUE", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_cOnTiNUe() {
        String toParse = "cOnTiNUe";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("cOnTiNUe", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_cOnTiNuE() {
        String toParse = "cOnTiNuE";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("cOnTiNuE", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_cOnTiNue() {
        String toParse = "cOnTiNue";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("cOnTiNue", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_cOnTinUE() {
        String toParse = "cOnTinUE";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("cOnTinUE", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_cOnTinUe() {
        String toParse = "cOnTinUe";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("cOnTinUe", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_cOnTinuE() {
        String toParse = "cOnTinuE";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("cOnTinuE", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_cOnTinue() {
        String toParse = "cOnTinue";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("cOnTinue", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_cOntINUE() {
        String toParse = "cOntINUE";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("cOntINUE", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_cOntINUe() {
        String toParse = "cOntINUe";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("cOntINUe", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_cOntINuE() {
        String toParse = "cOntINuE";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("cOntINuE", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_cOntINue() {
        String toParse = "cOntINue";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("cOntINue", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_cOntInUE() {
        String toParse = "cOntInUE";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("cOntInUE", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_cOntInUe() {
        String toParse = "cOntInUe";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("cOntInUe", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_cOntInuE() {
        String toParse = "cOntInuE";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("cOntInuE", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_cOntInue() {
        String toParse = "cOntInue";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("cOntInue", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_cOntiNUE() {
        String toParse = "cOntiNUE";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("cOntiNUE", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_cOntiNUe() {
        String toParse = "cOntiNUe";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("cOntiNUe", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_cOntiNuE() {
        String toParse = "cOntiNuE";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("cOntiNuE", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_cOntiNue() {
        String toParse = "cOntiNue";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("cOntiNue", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_cOntinUE() {
        String toParse = "cOntinUE";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("cOntinUE", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_cOntinUe() {
        String toParse = "cOntinUe";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("cOntinUe", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_cOntinuE() {
        String toParse = "cOntinuE";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("cOntinuE", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_cOntinue() {
        String toParse = "cOntinue";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("cOntinue", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_coNTINUE() {
        String toParse = "coNTINUE";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("coNTINUE", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_coNTINUe() {
        String toParse = "coNTINUe";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("coNTINUe", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_coNTINuE() {
        String toParse = "coNTINuE";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("coNTINuE", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_coNTINue() {
        String toParse = "coNTINue";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("coNTINue", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_coNTInUE() {
        String toParse = "coNTInUE";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("coNTInUE", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_coNTInUe() {
        String toParse = "coNTInUe";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("coNTInUe", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_coNTInuE() {
        String toParse = "coNTInuE";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("coNTInuE", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_coNTInue() {
        String toParse = "coNTInue";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("coNTInue", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_coNTiNUE() {
        String toParse = "coNTiNUE";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("coNTiNUE", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_coNTiNUe() {
        String toParse = "coNTiNUe";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("coNTiNUe", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_coNTiNuE() {
        String toParse = "coNTiNuE";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("coNTiNuE", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_coNTiNue() {
        String toParse = "coNTiNue";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("coNTiNue", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_coNTinUE() {
        String toParse = "coNTinUE";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("coNTinUE", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_coNTinUe() {
        String toParse = "coNTinUe";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("coNTinUe", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_coNTinuE() {
        String toParse = "coNTinuE";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("coNTinuE", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_coNTinue() {
        String toParse = "coNTinue";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("coNTinue", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_coNtINUE() {
        String toParse = "coNtINUE";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("coNtINUE", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_coNtINUe() {
        String toParse = "coNtINUe";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("coNtINUe", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_coNtINuE() {
        String toParse = "coNtINuE";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("coNtINuE", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_coNtINue() {
        String toParse = "coNtINue";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("coNtINue", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_coNtInUE() {
        String toParse = "coNtInUE";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("coNtInUE", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_coNtInUe() {
        String toParse = "coNtInUe";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("coNtInUe", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_coNtInuE() {
        String toParse = "coNtInuE";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("coNtInuE", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_coNtInue() {
        String toParse = "coNtInue";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("coNtInue", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_coNtiNUE() {
        String toParse = "coNtiNUE";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("coNtiNUE", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_coNtiNUe() {
        String toParse = "coNtiNUe";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("coNtiNUe", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_coNtiNuE() {
        String toParse = "coNtiNuE";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("coNtiNuE", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_coNtiNue() {
        String toParse = "coNtiNue";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("coNtiNue", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_coNtinUE() {
        String toParse = "coNtinUE";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("coNtinUE", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_coNtinUe() {
        String toParse = "coNtinUe";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("coNtinUe", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_coNtinuE() {
        String toParse = "coNtinuE";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("coNtinuE", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_coNtinue() {
        String toParse = "coNtinue";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("coNtinue", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_conTINUE() {
        String toParse = "conTINUE";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("conTINUE", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_conTINUe() {
        String toParse = "conTINUe";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("conTINUe", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_conTINuE() {
        String toParse = "conTINuE";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("conTINuE", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_conTINue() {
        String toParse = "conTINue";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("conTINue", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_conTInUE() {
        String toParse = "conTInUE";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("conTInUE", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_conTInUe() {
        String toParse = "conTInUe";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("conTInUe", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_conTInuE() {
        String toParse = "conTInuE";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("conTInuE", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_conTInue() {
        String toParse = "conTInue";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("conTInue", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_conTiNUE() {
        String toParse = "conTiNUE";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("conTiNUE", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_conTiNUe() {
        String toParse = "conTiNUe";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("conTiNUe", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_conTiNuE() {
        String toParse = "conTiNuE";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("conTiNuE", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_conTiNue() {
        String toParse = "conTiNue";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("conTiNue", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_conTinUE() {
        String toParse = "conTinUE";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("conTinUE", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_conTinUe() {
        String toParse = "conTinUe";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("conTinUe", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_conTinuE() {
        String toParse = "conTinuE";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("conTinuE", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_conTinue() {
        String toParse = "conTinue";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("conTinue", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_contINUE() {
        String toParse = "contINUE";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("contINUE", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_contINUe() {
        String toParse = "contINUe";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("contINUe", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_contINuE() {
        String toParse = "contINuE";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("contINuE", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_contINue() {
        String toParse = "contINue";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("contINue", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_contInUE() {
        String toParse = "contInUE";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("contInUE", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_contInUe() {
        String toParse = "contInUe";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("contInUe", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_contInuE() {
        String toParse = "contInuE";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("contInuE", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_contInue() {
        String toParse = "contInue";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("contInue", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_contiNUE() {
        String toParse = "contiNUE";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("contiNUE", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_contiNUe() {
        String toParse = "contiNUe";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("contiNUe", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_contiNuE() {
        String toParse = "contiNuE";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("contiNuE", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_contiNue() {
        String toParse = "contiNue";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("contiNue", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_continUE() {
        String toParse = "continUE";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("continUE", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_continUe() {
        String toParse = "continUe";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("continUe", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_continuE() {
        String toParse = "continuE";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("continuE", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_continue() {
        String toParse = "continue";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.CONTINUE, lexer.getTokenType());
        Assert.assertEquals("continue", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

}
