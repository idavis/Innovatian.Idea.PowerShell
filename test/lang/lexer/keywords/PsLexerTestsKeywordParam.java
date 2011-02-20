package com.innovatian.idea.powershell.test.lang.lexer.keywords;

import com.innovatian.idea.powershell.lang.lexer.PsTokenTypes;
import com.innovatian.idea.powershell.test.lang.lexer.PsLexerTestContext;
import junit.framework.Assert;

public class PsLexerTestsKeywordParam extends PsLexerTestContext {
    public void testKeyword_PARAM() {
        String toParse = "PARAM";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.PARAM, lexer.getTokenType());
        Assert.assertEquals("PARAM", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_PARAm() {
        String toParse = "PARAm";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.PARAM, lexer.getTokenType());
        Assert.assertEquals("PARAm", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_PARaM() {
        String toParse = "PARaM";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.PARAM, lexer.getTokenType());
        Assert.assertEquals("PARaM", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_PARam() {
        String toParse = "PARam";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.PARAM, lexer.getTokenType());
        Assert.assertEquals("PARam", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_PArAM() {
        String toParse = "PArAM";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.PARAM, lexer.getTokenType());
        Assert.assertEquals("PArAM", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_PArAm() {
        String toParse = "PArAm";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.PARAM, lexer.getTokenType());
        Assert.assertEquals("PArAm", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_PAraM() {
        String toParse = "PAraM";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.PARAM, lexer.getTokenType());
        Assert.assertEquals("PAraM", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_PAram() {
        String toParse = "PAram";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.PARAM, lexer.getTokenType());
        Assert.assertEquals("PAram", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_PaRAM() {
        String toParse = "PaRAM";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.PARAM, lexer.getTokenType());
        Assert.assertEquals("PaRAM", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_PaRAm() {
        String toParse = "PaRAm";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.PARAM, lexer.getTokenType());
        Assert.assertEquals("PaRAm", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_PaRaM() {
        String toParse = "PaRaM";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.PARAM, lexer.getTokenType());
        Assert.assertEquals("PaRaM", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_PaRam() {
        String toParse = "PaRam";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.PARAM, lexer.getTokenType());
        Assert.assertEquals("PaRam", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_ParAM() {
        String toParse = "ParAM";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.PARAM, lexer.getTokenType());
        Assert.assertEquals("ParAM", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_ParAm() {
        String toParse = "ParAm";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.PARAM, lexer.getTokenType());
        Assert.assertEquals("ParAm", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_ParaM() {
        String toParse = "ParaM";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.PARAM, lexer.getTokenType());
        Assert.assertEquals("ParaM", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_Param() {
        String toParse = "Param";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.PARAM, lexer.getTokenType());
        Assert.assertEquals("Param", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_pARAM() {
        String toParse = "pARAM";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.PARAM, lexer.getTokenType());
        Assert.assertEquals("pARAM", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_pARAm() {
        String toParse = "pARAm";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.PARAM, lexer.getTokenType());
        Assert.assertEquals("pARAm", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_pARaM() {
        String toParse = "pARaM";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.PARAM, lexer.getTokenType());
        Assert.assertEquals("pARaM", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_pARam() {
        String toParse = "pARam";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.PARAM, lexer.getTokenType());
        Assert.assertEquals("pARam", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_pArAM() {
        String toParse = "pArAM";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.PARAM, lexer.getTokenType());
        Assert.assertEquals("pArAM", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_pArAm() {
        String toParse = "pArAm";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.PARAM, lexer.getTokenType());
        Assert.assertEquals("pArAm", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_pAraM() {
        String toParse = "pAraM";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.PARAM, lexer.getTokenType());
        Assert.assertEquals("pAraM", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_pAram() {
        String toParse = "pAram";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.PARAM, lexer.getTokenType());
        Assert.assertEquals("pAram", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_paRAM() {
        String toParse = "paRAM";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.PARAM, lexer.getTokenType());
        Assert.assertEquals("paRAM", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_paRAm() {
        String toParse = "paRAm";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.PARAM, lexer.getTokenType());
        Assert.assertEquals("paRAm", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_paRaM() {
        String toParse = "paRaM";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.PARAM, lexer.getTokenType());
        Assert.assertEquals("paRaM", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_paRam() {
        String toParse = "paRam";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.PARAM, lexer.getTokenType());
        Assert.assertEquals("paRam", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_parAM() {
        String toParse = "parAM";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.PARAM, lexer.getTokenType());
        Assert.assertEquals("parAM", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_parAm() {
        String toParse = "parAm";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.PARAM, lexer.getTokenType());
        Assert.assertEquals("parAm", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_paraM() {
        String toParse = "paraM";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.PARAM, lexer.getTokenType());
        Assert.assertEquals("paraM", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_param() {
        String toParse = "param";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.PARAM, lexer.getTokenType());
        Assert.assertEquals("param", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

}
