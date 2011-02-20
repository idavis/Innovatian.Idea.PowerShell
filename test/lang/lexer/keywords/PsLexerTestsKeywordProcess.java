package com.innovatian.idea.powershell.test.lang.lexer.keywords;

import com.innovatian.idea.powershell.lang.lexer.PsTokenTypes;
import com.innovatian.idea.powershell.test.lang.lexer.PsLexerTestContext;
import junit.framework.Assert;

public class PsLexerTestsKeywordProcess extends PsLexerTestContext {
    public void testKeyword_PROCESS() {
        String toParse = "PROCESS";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.PROCESS, lexer.getTokenType());
        Assert.assertEquals("PROCESS", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_PROCESs() {
        String toParse = "PROCESs";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.PROCESS, lexer.getTokenType());
        Assert.assertEquals("PROCESs", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_PROCEsS() {
        String toParse = "PROCEsS";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.PROCESS, lexer.getTokenType());
        Assert.assertEquals("PROCEsS", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_PROCEss() {
        String toParse = "PROCEss";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.PROCESS, lexer.getTokenType());
        Assert.assertEquals("PROCEss", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_PROCeSS() {
        String toParse = "PROCeSS";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.PROCESS, lexer.getTokenType());
        Assert.assertEquals("PROCeSS", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_PROCeSs() {
        String toParse = "PROCeSs";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.PROCESS, lexer.getTokenType());
        Assert.assertEquals("PROCeSs", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_PROCesS() {
        String toParse = "PROCesS";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.PROCESS, lexer.getTokenType());
        Assert.assertEquals("PROCesS", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_PROCess() {
        String toParse = "PROCess";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.PROCESS, lexer.getTokenType());
        Assert.assertEquals("PROCess", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_PROcESS() {
        String toParse = "PROcESS";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.PROCESS, lexer.getTokenType());
        Assert.assertEquals("PROcESS", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_PROcESs() {
        String toParse = "PROcESs";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.PROCESS, lexer.getTokenType());
        Assert.assertEquals("PROcESs", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_PROcEsS() {
        String toParse = "PROcEsS";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.PROCESS, lexer.getTokenType());
        Assert.assertEquals("PROcEsS", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_PROcEss() {
        String toParse = "PROcEss";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.PROCESS, lexer.getTokenType());
        Assert.assertEquals("PROcEss", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_PROceSS() {
        String toParse = "PROceSS";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.PROCESS, lexer.getTokenType());
        Assert.assertEquals("PROceSS", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_PROceSs() {
        String toParse = "PROceSs";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.PROCESS, lexer.getTokenType());
        Assert.assertEquals("PROceSs", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_PROcesS() {
        String toParse = "PROcesS";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.PROCESS, lexer.getTokenType());
        Assert.assertEquals("PROcesS", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_PROcess() {
        String toParse = "PROcess";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.PROCESS, lexer.getTokenType());
        Assert.assertEquals("PROcess", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_PRoCESS() {
        String toParse = "PRoCESS";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.PROCESS, lexer.getTokenType());
        Assert.assertEquals("PRoCESS", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_PRoCESs() {
        String toParse = "PRoCESs";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.PROCESS, lexer.getTokenType());
        Assert.assertEquals("PRoCESs", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_PRoCEsS() {
        String toParse = "PRoCEsS";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.PROCESS, lexer.getTokenType());
        Assert.assertEquals("PRoCEsS", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_PRoCEss() {
        String toParse = "PRoCEss";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.PROCESS, lexer.getTokenType());
        Assert.assertEquals("PRoCEss", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_PRoCeSS() {
        String toParse = "PRoCeSS";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.PROCESS, lexer.getTokenType());
        Assert.assertEquals("PRoCeSS", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_PRoCeSs() {
        String toParse = "PRoCeSs";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.PROCESS, lexer.getTokenType());
        Assert.assertEquals("PRoCeSs", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_PRoCesS() {
        String toParse = "PRoCesS";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.PROCESS, lexer.getTokenType());
        Assert.assertEquals("PRoCesS", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_PRoCess() {
        String toParse = "PRoCess";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.PROCESS, lexer.getTokenType());
        Assert.assertEquals("PRoCess", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_PRocESS() {
        String toParse = "PRocESS";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.PROCESS, lexer.getTokenType());
        Assert.assertEquals("PRocESS", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_PRocESs() {
        String toParse = "PRocESs";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.PROCESS, lexer.getTokenType());
        Assert.assertEquals("PRocESs", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_PRocEsS() {
        String toParse = "PRocEsS";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.PROCESS, lexer.getTokenType());
        Assert.assertEquals("PRocEsS", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_PRocEss() {
        String toParse = "PRocEss";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.PROCESS, lexer.getTokenType());
        Assert.assertEquals("PRocEss", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_PRoceSS() {
        String toParse = "PRoceSS";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.PROCESS, lexer.getTokenType());
        Assert.assertEquals("PRoceSS", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_PRoceSs() {
        String toParse = "PRoceSs";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.PROCESS, lexer.getTokenType());
        Assert.assertEquals("PRoceSs", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_PRocesS() {
        String toParse = "PRocesS";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.PROCESS, lexer.getTokenType());
        Assert.assertEquals("PRocesS", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_PRocess() {
        String toParse = "PRocess";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.PROCESS, lexer.getTokenType());
        Assert.assertEquals("PRocess", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_PrOCESS() {
        String toParse = "PrOCESS";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.PROCESS, lexer.getTokenType());
        Assert.assertEquals("PrOCESS", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_PrOCESs() {
        String toParse = "PrOCESs";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.PROCESS, lexer.getTokenType());
        Assert.assertEquals("PrOCESs", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_PrOCEsS() {
        String toParse = "PrOCEsS";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.PROCESS, lexer.getTokenType());
        Assert.assertEquals("PrOCEsS", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_PrOCEss() {
        String toParse = "PrOCEss";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.PROCESS, lexer.getTokenType());
        Assert.assertEquals("PrOCEss", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_PrOCeSS() {
        String toParse = "PrOCeSS";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.PROCESS, lexer.getTokenType());
        Assert.assertEquals("PrOCeSS", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_PrOCeSs() {
        String toParse = "PrOCeSs";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.PROCESS, lexer.getTokenType());
        Assert.assertEquals("PrOCeSs", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_PrOCesS() {
        String toParse = "PrOCesS";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.PROCESS, lexer.getTokenType());
        Assert.assertEquals("PrOCesS", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_PrOCess() {
        String toParse = "PrOCess";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.PROCESS, lexer.getTokenType());
        Assert.assertEquals("PrOCess", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_PrOcESS() {
        String toParse = "PrOcESS";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.PROCESS, lexer.getTokenType());
        Assert.assertEquals("PrOcESS", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_PrOcESs() {
        String toParse = "PrOcESs";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.PROCESS, lexer.getTokenType());
        Assert.assertEquals("PrOcESs", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_PrOcEsS() {
        String toParse = "PrOcEsS";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.PROCESS, lexer.getTokenType());
        Assert.assertEquals("PrOcEsS", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_PrOcEss() {
        String toParse = "PrOcEss";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.PROCESS, lexer.getTokenType());
        Assert.assertEquals("PrOcEss", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_PrOceSS() {
        String toParse = "PrOceSS";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.PROCESS, lexer.getTokenType());
        Assert.assertEquals("PrOceSS", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_PrOceSs() {
        String toParse = "PrOceSs";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.PROCESS, lexer.getTokenType());
        Assert.assertEquals("PrOceSs", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_PrOcesS() {
        String toParse = "PrOcesS";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.PROCESS, lexer.getTokenType());
        Assert.assertEquals("PrOcesS", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_PrOcess() {
        String toParse = "PrOcess";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.PROCESS, lexer.getTokenType());
        Assert.assertEquals("PrOcess", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_ProCESS() {
        String toParse = "ProCESS";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.PROCESS, lexer.getTokenType());
        Assert.assertEquals("ProCESS", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_ProCESs() {
        String toParse = "ProCESs";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.PROCESS, lexer.getTokenType());
        Assert.assertEquals("ProCESs", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_ProCEsS() {
        String toParse = "ProCEsS";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.PROCESS, lexer.getTokenType());
        Assert.assertEquals("ProCEsS", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_ProCEss() {
        String toParse = "ProCEss";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.PROCESS, lexer.getTokenType());
        Assert.assertEquals("ProCEss", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_ProCeSS() {
        String toParse = "ProCeSS";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.PROCESS, lexer.getTokenType());
        Assert.assertEquals("ProCeSS", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_ProCeSs() {
        String toParse = "ProCeSs";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.PROCESS, lexer.getTokenType());
        Assert.assertEquals("ProCeSs", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_ProCesS() {
        String toParse = "ProCesS";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.PROCESS, lexer.getTokenType());
        Assert.assertEquals("ProCesS", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_ProCess() {
        String toParse = "ProCess";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.PROCESS, lexer.getTokenType());
        Assert.assertEquals("ProCess", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_ProcESS() {
        String toParse = "ProcESS";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.PROCESS, lexer.getTokenType());
        Assert.assertEquals("ProcESS", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_ProcESs() {
        String toParse = "ProcESs";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.PROCESS, lexer.getTokenType());
        Assert.assertEquals("ProcESs", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_ProcEsS() {
        String toParse = "ProcEsS";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.PROCESS, lexer.getTokenType());
        Assert.assertEquals("ProcEsS", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_ProcEss() {
        String toParse = "ProcEss";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.PROCESS, lexer.getTokenType());
        Assert.assertEquals("ProcEss", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_ProceSS() {
        String toParse = "ProceSS";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.PROCESS, lexer.getTokenType());
        Assert.assertEquals("ProceSS", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_ProceSs() {
        String toParse = "ProceSs";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.PROCESS, lexer.getTokenType());
        Assert.assertEquals("ProceSs", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_ProcesS() {
        String toParse = "ProcesS";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.PROCESS, lexer.getTokenType());
        Assert.assertEquals("ProcesS", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_Process() {
        String toParse = "Process";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.PROCESS, lexer.getTokenType());
        Assert.assertEquals("Process", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_pROCESS() {
        String toParse = "pROCESS";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.PROCESS, lexer.getTokenType());
        Assert.assertEquals("pROCESS", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_pROCESs() {
        String toParse = "pROCESs";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.PROCESS, lexer.getTokenType());
        Assert.assertEquals("pROCESs", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_pROCEsS() {
        String toParse = "pROCEsS";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.PROCESS, lexer.getTokenType());
        Assert.assertEquals("pROCEsS", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_pROCEss() {
        String toParse = "pROCEss";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.PROCESS, lexer.getTokenType());
        Assert.assertEquals("pROCEss", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_pROCeSS() {
        String toParse = "pROCeSS";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.PROCESS, lexer.getTokenType());
        Assert.assertEquals("pROCeSS", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_pROCeSs() {
        String toParse = "pROCeSs";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.PROCESS, lexer.getTokenType());
        Assert.assertEquals("pROCeSs", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_pROCesS() {
        String toParse = "pROCesS";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.PROCESS, lexer.getTokenType());
        Assert.assertEquals("pROCesS", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_pROCess() {
        String toParse = "pROCess";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.PROCESS, lexer.getTokenType());
        Assert.assertEquals("pROCess", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_pROcESS() {
        String toParse = "pROcESS";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.PROCESS, lexer.getTokenType());
        Assert.assertEquals("pROcESS", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_pROcESs() {
        String toParse = "pROcESs";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.PROCESS, lexer.getTokenType());
        Assert.assertEquals("pROcESs", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_pROcEsS() {
        String toParse = "pROcEsS";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.PROCESS, lexer.getTokenType());
        Assert.assertEquals("pROcEsS", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_pROcEss() {
        String toParse = "pROcEss";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.PROCESS, lexer.getTokenType());
        Assert.assertEquals("pROcEss", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_pROceSS() {
        String toParse = "pROceSS";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.PROCESS, lexer.getTokenType());
        Assert.assertEquals("pROceSS", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_pROceSs() {
        String toParse = "pROceSs";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.PROCESS, lexer.getTokenType());
        Assert.assertEquals("pROceSs", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_pROcesS() {
        String toParse = "pROcesS";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.PROCESS, lexer.getTokenType());
        Assert.assertEquals("pROcesS", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_pROcess() {
        String toParse = "pROcess";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.PROCESS, lexer.getTokenType());
        Assert.assertEquals("pROcess", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_pRoCESS() {
        String toParse = "pRoCESS";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.PROCESS, lexer.getTokenType());
        Assert.assertEquals("pRoCESS", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_pRoCESs() {
        String toParse = "pRoCESs";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.PROCESS, lexer.getTokenType());
        Assert.assertEquals("pRoCESs", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_pRoCEsS() {
        String toParse = "pRoCEsS";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.PROCESS, lexer.getTokenType());
        Assert.assertEquals("pRoCEsS", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_pRoCEss() {
        String toParse = "pRoCEss";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.PROCESS, lexer.getTokenType());
        Assert.assertEquals("pRoCEss", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_pRoCeSS() {
        String toParse = "pRoCeSS";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.PROCESS, lexer.getTokenType());
        Assert.assertEquals("pRoCeSS", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_pRoCeSs() {
        String toParse = "pRoCeSs";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.PROCESS, lexer.getTokenType());
        Assert.assertEquals("pRoCeSs", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_pRoCesS() {
        String toParse = "pRoCesS";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.PROCESS, lexer.getTokenType());
        Assert.assertEquals("pRoCesS", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_pRoCess() {
        String toParse = "pRoCess";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.PROCESS, lexer.getTokenType());
        Assert.assertEquals("pRoCess", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_pRocESS() {
        String toParse = "pRocESS";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.PROCESS, lexer.getTokenType());
        Assert.assertEquals("pRocESS", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_pRocESs() {
        String toParse = "pRocESs";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.PROCESS, lexer.getTokenType());
        Assert.assertEquals("pRocESs", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_pRocEsS() {
        String toParse = "pRocEsS";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.PROCESS, lexer.getTokenType());
        Assert.assertEquals("pRocEsS", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_pRocEss() {
        String toParse = "pRocEss";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.PROCESS, lexer.getTokenType());
        Assert.assertEquals("pRocEss", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_pRoceSS() {
        String toParse = "pRoceSS";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.PROCESS, lexer.getTokenType());
        Assert.assertEquals("pRoceSS", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_pRoceSs() {
        String toParse = "pRoceSs";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.PROCESS, lexer.getTokenType());
        Assert.assertEquals("pRoceSs", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_pRocesS() {
        String toParse = "pRocesS";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.PROCESS, lexer.getTokenType());
        Assert.assertEquals("pRocesS", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_pRocess() {
        String toParse = "pRocess";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.PROCESS, lexer.getTokenType());
        Assert.assertEquals("pRocess", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_prOCESS() {
        String toParse = "prOCESS";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.PROCESS, lexer.getTokenType());
        Assert.assertEquals("prOCESS", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_prOCESs() {
        String toParse = "prOCESs";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.PROCESS, lexer.getTokenType());
        Assert.assertEquals("prOCESs", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_prOCEsS() {
        String toParse = "prOCEsS";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.PROCESS, lexer.getTokenType());
        Assert.assertEquals("prOCEsS", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_prOCEss() {
        String toParse = "prOCEss";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.PROCESS, lexer.getTokenType());
        Assert.assertEquals("prOCEss", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_prOCeSS() {
        String toParse = "prOCeSS";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.PROCESS, lexer.getTokenType());
        Assert.assertEquals("prOCeSS", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_prOCeSs() {
        String toParse = "prOCeSs";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.PROCESS, lexer.getTokenType());
        Assert.assertEquals("prOCeSs", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_prOCesS() {
        String toParse = "prOCesS";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.PROCESS, lexer.getTokenType());
        Assert.assertEquals("prOCesS", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_prOCess() {
        String toParse = "prOCess";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.PROCESS, lexer.getTokenType());
        Assert.assertEquals("prOCess", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_prOcESS() {
        String toParse = "prOcESS";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.PROCESS, lexer.getTokenType());
        Assert.assertEquals("prOcESS", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_prOcESs() {
        String toParse = "prOcESs";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.PROCESS, lexer.getTokenType());
        Assert.assertEquals("prOcESs", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_prOcEsS() {
        String toParse = "prOcEsS";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.PROCESS, lexer.getTokenType());
        Assert.assertEquals("prOcEsS", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_prOcEss() {
        String toParse = "prOcEss";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.PROCESS, lexer.getTokenType());
        Assert.assertEquals("prOcEss", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_prOceSS() {
        String toParse = "prOceSS";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.PROCESS, lexer.getTokenType());
        Assert.assertEquals("prOceSS", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_prOceSs() {
        String toParse = "prOceSs";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.PROCESS, lexer.getTokenType());
        Assert.assertEquals("prOceSs", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_prOcesS() {
        String toParse = "prOcesS";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.PROCESS, lexer.getTokenType());
        Assert.assertEquals("prOcesS", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_prOcess() {
        String toParse = "prOcess";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.PROCESS, lexer.getTokenType());
        Assert.assertEquals("prOcess", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_proCESS() {
        String toParse = "proCESS";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.PROCESS, lexer.getTokenType());
        Assert.assertEquals("proCESS", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_proCESs() {
        String toParse = "proCESs";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.PROCESS, lexer.getTokenType());
        Assert.assertEquals("proCESs", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_proCEsS() {
        String toParse = "proCEsS";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.PROCESS, lexer.getTokenType());
        Assert.assertEquals("proCEsS", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_proCEss() {
        String toParse = "proCEss";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.PROCESS, lexer.getTokenType());
        Assert.assertEquals("proCEss", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_proCeSS() {
        String toParse = "proCeSS";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.PROCESS, lexer.getTokenType());
        Assert.assertEquals("proCeSS", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_proCeSs() {
        String toParse = "proCeSs";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.PROCESS, lexer.getTokenType());
        Assert.assertEquals("proCeSs", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_proCesS() {
        String toParse = "proCesS";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.PROCESS, lexer.getTokenType());
        Assert.assertEquals("proCesS", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_proCess() {
        String toParse = "proCess";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.PROCESS, lexer.getTokenType());
        Assert.assertEquals("proCess", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_procESS() {
        String toParse = "procESS";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.PROCESS, lexer.getTokenType());
        Assert.assertEquals("procESS", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_procESs() {
        String toParse = "procESs";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.PROCESS, lexer.getTokenType());
        Assert.assertEquals("procESs", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_procEsS() {
        String toParse = "procEsS";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.PROCESS, lexer.getTokenType());
        Assert.assertEquals("procEsS", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_procEss() {
        String toParse = "procEss";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.PROCESS, lexer.getTokenType());
        Assert.assertEquals("procEss", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_proceSS() {
        String toParse = "proceSS";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.PROCESS, lexer.getTokenType());
        Assert.assertEquals("proceSS", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_proceSs() {
        String toParse = "proceSs";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.PROCESS, lexer.getTokenType());
        Assert.assertEquals("proceSs", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_procesS() {
        String toParse = "procesS";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.PROCESS, lexer.getTokenType());
        Assert.assertEquals("procesS", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_process() {
        String toParse = "process";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.PROCESS, lexer.getTokenType());
        Assert.assertEquals("process", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

}
