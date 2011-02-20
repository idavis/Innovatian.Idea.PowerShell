package com.innovatian.idea.powershell.test.lang.lexer.keywords;

import com.innovatian.idea.powershell.lang.lexer.PsTokenTypes;
import com.innovatian.idea.powershell.test.lang.lexer.PsLexerTestContext;
import junit.framework.Assert;

public class PsLexerTestsKeywordFinally extends PsLexerTestContext {
    public void testKeyword_FINALLY() {
        String toParse = "FINALLY";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FINALLY, lexer.getTokenType());
        Assert.assertEquals("FINALLY", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_FINALLy() {
        String toParse = "FINALLy";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FINALLY, lexer.getTokenType());
        Assert.assertEquals("FINALLy", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_FINALlY() {
        String toParse = "FINALlY";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FINALLY, lexer.getTokenType());
        Assert.assertEquals("FINALlY", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_FINALly() {
        String toParse = "FINALly";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FINALLY, lexer.getTokenType());
        Assert.assertEquals("FINALly", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_FINAlLY() {
        String toParse = "FINAlLY";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FINALLY, lexer.getTokenType());
        Assert.assertEquals("FINAlLY", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_FINAlLy() {
        String toParse = "FINAlLy";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FINALLY, lexer.getTokenType());
        Assert.assertEquals("FINAlLy", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_FINAllY() {
        String toParse = "FINAllY";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FINALLY, lexer.getTokenType());
        Assert.assertEquals("FINAllY", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_FINAlly() {
        String toParse = "FINAlly";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FINALLY, lexer.getTokenType());
        Assert.assertEquals("FINAlly", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_FINaLLY() {
        String toParse = "FINaLLY";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FINALLY, lexer.getTokenType());
        Assert.assertEquals("FINaLLY", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_FINaLLy() {
        String toParse = "FINaLLy";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FINALLY, lexer.getTokenType());
        Assert.assertEquals("FINaLLy", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_FINaLlY() {
        String toParse = "FINaLlY";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FINALLY, lexer.getTokenType());
        Assert.assertEquals("FINaLlY", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_FINaLly() {
        String toParse = "FINaLly";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FINALLY, lexer.getTokenType());
        Assert.assertEquals("FINaLly", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_FINalLY() {
        String toParse = "FINalLY";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FINALLY, lexer.getTokenType());
        Assert.assertEquals("FINalLY", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_FINalLy() {
        String toParse = "FINalLy";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FINALLY, lexer.getTokenType());
        Assert.assertEquals("FINalLy", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_FINallY() {
        String toParse = "FINallY";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FINALLY, lexer.getTokenType());
        Assert.assertEquals("FINallY", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_FINally() {
        String toParse = "FINally";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FINALLY, lexer.getTokenType());
        Assert.assertEquals("FINally", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_FInALLY() {
        String toParse = "FInALLY";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FINALLY, lexer.getTokenType());
        Assert.assertEquals("FInALLY", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_FInALLy() {
        String toParse = "FInALLy";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FINALLY, lexer.getTokenType());
        Assert.assertEquals("FInALLy", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_FInALlY() {
        String toParse = "FInALlY";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FINALLY, lexer.getTokenType());
        Assert.assertEquals("FInALlY", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_FInALly() {
        String toParse = "FInALly";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FINALLY, lexer.getTokenType());
        Assert.assertEquals("FInALly", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_FInAlLY() {
        String toParse = "FInAlLY";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FINALLY, lexer.getTokenType());
        Assert.assertEquals("FInAlLY", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_FInAlLy() {
        String toParse = "FInAlLy";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FINALLY, lexer.getTokenType());
        Assert.assertEquals("FInAlLy", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_FInAllY() {
        String toParse = "FInAllY";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FINALLY, lexer.getTokenType());
        Assert.assertEquals("FInAllY", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_FInAlly() {
        String toParse = "FInAlly";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FINALLY, lexer.getTokenType());
        Assert.assertEquals("FInAlly", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_FInaLLY() {
        String toParse = "FInaLLY";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FINALLY, lexer.getTokenType());
        Assert.assertEquals("FInaLLY", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_FInaLLy() {
        String toParse = "FInaLLy";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FINALLY, lexer.getTokenType());
        Assert.assertEquals("FInaLLy", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_FInaLlY() {
        String toParse = "FInaLlY";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FINALLY, lexer.getTokenType());
        Assert.assertEquals("FInaLlY", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_FInaLly() {
        String toParse = "FInaLly";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FINALLY, lexer.getTokenType());
        Assert.assertEquals("FInaLly", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_FInalLY() {
        String toParse = "FInalLY";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FINALLY, lexer.getTokenType());
        Assert.assertEquals("FInalLY", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_FInalLy() {
        String toParse = "FInalLy";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FINALLY, lexer.getTokenType());
        Assert.assertEquals("FInalLy", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_FInallY() {
        String toParse = "FInallY";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FINALLY, lexer.getTokenType());
        Assert.assertEquals("FInallY", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_FInally() {
        String toParse = "FInally";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FINALLY, lexer.getTokenType());
        Assert.assertEquals("FInally", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_FiNALLY() {
        String toParse = "FiNALLY";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FINALLY, lexer.getTokenType());
        Assert.assertEquals("FiNALLY", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_FiNALLy() {
        String toParse = "FiNALLy";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FINALLY, lexer.getTokenType());
        Assert.assertEquals("FiNALLy", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_FiNALlY() {
        String toParse = "FiNALlY";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FINALLY, lexer.getTokenType());
        Assert.assertEquals("FiNALlY", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_FiNALly() {
        String toParse = "FiNALly";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FINALLY, lexer.getTokenType());
        Assert.assertEquals("FiNALly", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_FiNAlLY() {
        String toParse = "FiNAlLY";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FINALLY, lexer.getTokenType());
        Assert.assertEquals("FiNAlLY", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_FiNAlLy() {
        String toParse = "FiNAlLy";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FINALLY, lexer.getTokenType());
        Assert.assertEquals("FiNAlLy", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_FiNAllY() {
        String toParse = "FiNAllY";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FINALLY, lexer.getTokenType());
        Assert.assertEquals("FiNAllY", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_FiNAlly() {
        String toParse = "FiNAlly";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FINALLY, lexer.getTokenType());
        Assert.assertEquals("FiNAlly", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_FiNaLLY() {
        String toParse = "FiNaLLY";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FINALLY, lexer.getTokenType());
        Assert.assertEquals("FiNaLLY", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_FiNaLLy() {
        String toParse = "FiNaLLy";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FINALLY, lexer.getTokenType());
        Assert.assertEquals("FiNaLLy", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_FiNaLlY() {
        String toParse = "FiNaLlY";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FINALLY, lexer.getTokenType());
        Assert.assertEquals("FiNaLlY", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_FiNaLly() {
        String toParse = "FiNaLly";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FINALLY, lexer.getTokenType());
        Assert.assertEquals("FiNaLly", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_FiNalLY() {
        String toParse = "FiNalLY";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FINALLY, lexer.getTokenType());
        Assert.assertEquals("FiNalLY", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_FiNalLy() {
        String toParse = "FiNalLy";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FINALLY, lexer.getTokenType());
        Assert.assertEquals("FiNalLy", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_FiNallY() {
        String toParse = "FiNallY";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FINALLY, lexer.getTokenType());
        Assert.assertEquals("FiNallY", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_FiNally() {
        String toParse = "FiNally";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FINALLY, lexer.getTokenType());
        Assert.assertEquals("FiNally", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_FinALLY() {
        String toParse = "FinALLY";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FINALLY, lexer.getTokenType());
        Assert.assertEquals("FinALLY", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_FinALLy() {
        String toParse = "FinALLy";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FINALLY, lexer.getTokenType());
        Assert.assertEquals("FinALLy", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_FinALlY() {
        String toParse = "FinALlY";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FINALLY, lexer.getTokenType());
        Assert.assertEquals("FinALlY", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_FinALly() {
        String toParse = "FinALly";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FINALLY, lexer.getTokenType());
        Assert.assertEquals("FinALly", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_FinAlLY() {
        String toParse = "FinAlLY";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FINALLY, lexer.getTokenType());
        Assert.assertEquals("FinAlLY", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_FinAlLy() {
        String toParse = "FinAlLy";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FINALLY, lexer.getTokenType());
        Assert.assertEquals("FinAlLy", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_FinAllY() {
        String toParse = "FinAllY";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FINALLY, lexer.getTokenType());
        Assert.assertEquals("FinAllY", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_FinAlly() {
        String toParse = "FinAlly";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FINALLY, lexer.getTokenType());
        Assert.assertEquals("FinAlly", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_FinaLLY() {
        String toParse = "FinaLLY";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FINALLY, lexer.getTokenType());
        Assert.assertEquals("FinaLLY", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_FinaLLy() {
        String toParse = "FinaLLy";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FINALLY, lexer.getTokenType());
        Assert.assertEquals("FinaLLy", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_FinaLlY() {
        String toParse = "FinaLlY";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FINALLY, lexer.getTokenType());
        Assert.assertEquals("FinaLlY", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_FinaLly() {
        String toParse = "FinaLly";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FINALLY, lexer.getTokenType());
        Assert.assertEquals("FinaLly", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_FinalLY() {
        String toParse = "FinalLY";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FINALLY, lexer.getTokenType());
        Assert.assertEquals("FinalLY", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_FinalLy() {
        String toParse = "FinalLy";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FINALLY, lexer.getTokenType());
        Assert.assertEquals("FinalLy", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_FinallY() {
        String toParse = "FinallY";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FINALLY, lexer.getTokenType());
        Assert.assertEquals("FinallY", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_Finally() {
        String toParse = "Finally";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FINALLY, lexer.getTokenType());
        Assert.assertEquals("Finally", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_fINALLY() {
        String toParse = "fINALLY";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FINALLY, lexer.getTokenType());
        Assert.assertEquals("fINALLY", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_fINALLy() {
        String toParse = "fINALLy";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FINALLY, lexer.getTokenType());
        Assert.assertEquals("fINALLy", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_fINALlY() {
        String toParse = "fINALlY";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FINALLY, lexer.getTokenType());
        Assert.assertEquals("fINALlY", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_fINALly() {
        String toParse = "fINALly";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FINALLY, lexer.getTokenType());
        Assert.assertEquals("fINALly", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_fINAlLY() {
        String toParse = "fINAlLY";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FINALLY, lexer.getTokenType());
        Assert.assertEquals("fINAlLY", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_fINAlLy() {
        String toParse = "fINAlLy";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FINALLY, lexer.getTokenType());
        Assert.assertEquals("fINAlLy", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_fINAllY() {
        String toParse = "fINAllY";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FINALLY, lexer.getTokenType());
        Assert.assertEquals("fINAllY", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_fINAlly() {
        String toParse = "fINAlly";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FINALLY, lexer.getTokenType());
        Assert.assertEquals("fINAlly", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_fINaLLY() {
        String toParse = "fINaLLY";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FINALLY, lexer.getTokenType());
        Assert.assertEquals("fINaLLY", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_fINaLLy() {
        String toParse = "fINaLLy";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FINALLY, lexer.getTokenType());
        Assert.assertEquals("fINaLLy", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_fINaLlY() {
        String toParse = "fINaLlY";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FINALLY, lexer.getTokenType());
        Assert.assertEquals("fINaLlY", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_fINaLly() {
        String toParse = "fINaLly";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FINALLY, lexer.getTokenType());
        Assert.assertEquals("fINaLly", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_fINalLY() {
        String toParse = "fINalLY";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FINALLY, lexer.getTokenType());
        Assert.assertEquals("fINalLY", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_fINalLy() {
        String toParse = "fINalLy";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FINALLY, lexer.getTokenType());
        Assert.assertEquals("fINalLy", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_fINallY() {
        String toParse = "fINallY";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FINALLY, lexer.getTokenType());
        Assert.assertEquals("fINallY", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_fINally() {
        String toParse = "fINally";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FINALLY, lexer.getTokenType());
        Assert.assertEquals("fINally", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_fInALLY() {
        String toParse = "fInALLY";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FINALLY, lexer.getTokenType());
        Assert.assertEquals("fInALLY", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_fInALLy() {
        String toParse = "fInALLy";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FINALLY, lexer.getTokenType());
        Assert.assertEquals("fInALLy", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_fInALlY() {
        String toParse = "fInALlY";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FINALLY, lexer.getTokenType());
        Assert.assertEquals("fInALlY", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_fInALly() {
        String toParse = "fInALly";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FINALLY, lexer.getTokenType());
        Assert.assertEquals("fInALly", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_fInAlLY() {
        String toParse = "fInAlLY";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FINALLY, lexer.getTokenType());
        Assert.assertEquals("fInAlLY", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_fInAlLy() {
        String toParse = "fInAlLy";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FINALLY, lexer.getTokenType());
        Assert.assertEquals("fInAlLy", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_fInAllY() {
        String toParse = "fInAllY";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FINALLY, lexer.getTokenType());
        Assert.assertEquals("fInAllY", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_fInAlly() {
        String toParse = "fInAlly";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FINALLY, lexer.getTokenType());
        Assert.assertEquals("fInAlly", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_fInaLLY() {
        String toParse = "fInaLLY";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FINALLY, lexer.getTokenType());
        Assert.assertEquals("fInaLLY", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_fInaLLy() {
        String toParse = "fInaLLy";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FINALLY, lexer.getTokenType());
        Assert.assertEquals("fInaLLy", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_fInaLlY() {
        String toParse = "fInaLlY";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FINALLY, lexer.getTokenType());
        Assert.assertEquals("fInaLlY", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_fInaLly() {
        String toParse = "fInaLly";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FINALLY, lexer.getTokenType());
        Assert.assertEquals("fInaLly", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_fInalLY() {
        String toParse = "fInalLY";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FINALLY, lexer.getTokenType());
        Assert.assertEquals("fInalLY", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_fInalLy() {
        String toParse = "fInalLy";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FINALLY, lexer.getTokenType());
        Assert.assertEquals("fInalLy", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_fInallY() {
        String toParse = "fInallY";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FINALLY, lexer.getTokenType());
        Assert.assertEquals("fInallY", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_fInally() {
        String toParse = "fInally";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FINALLY, lexer.getTokenType());
        Assert.assertEquals("fInally", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_fiNALLY() {
        String toParse = "fiNALLY";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FINALLY, lexer.getTokenType());
        Assert.assertEquals("fiNALLY", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_fiNALLy() {
        String toParse = "fiNALLy";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FINALLY, lexer.getTokenType());
        Assert.assertEquals("fiNALLy", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_fiNALlY() {
        String toParse = "fiNALlY";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FINALLY, lexer.getTokenType());
        Assert.assertEquals("fiNALlY", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_fiNALly() {
        String toParse = "fiNALly";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FINALLY, lexer.getTokenType());
        Assert.assertEquals("fiNALly", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_fiNAlLY() {
        String toParse = "fiNAlLY";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FINALLY, lexer.getTokenType());
        Assert.assertEquals("fiNAlLY", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_fiNAlLy() {
        String toParse = "fiNAlLy";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FINALLY, lexer.getTokenType());
        Assert.assertEquals("fiNAlLy", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_fiNAllY() {
        String toParse = "fiNAllY";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FINALLY, lexer.getTokenType());
        Assert.assertEquals("fiNAllY", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_fiNAlly() {
        String toParse = "fiNAlly";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FINALLY, lexer.getTokenType());
        Assert.assertEquals("fiNAlly", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_fiNaLLY() {
        String toParse = "fiNaLLY";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FINALLY, lexer.getTokenType());
        Assert.assertEquals("fiNaLLY", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_fiNaLLy() {
        String toParse = "fiNaLLy";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FINALLY, lexer.getTokenType());
        Assert.assertEquals("fiNaLLy", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_fiNaLlY() {
        String toParse = "fiNaLlY";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FINALLY, lexer.getTokenType());
        Assert.assertEquals("fiNaLlY", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_fiNaLly() {
        String toParse = "fiNaLly";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FINALLY, lexer.getTokenType());
        Assert.assertEquals("fiNaLly", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_fiNalLY() {
        String toParse = "fiNalLY";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FINALLY, lexer.getTokenType());
        Assert.assertEquals("fiNalLY", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_fiNalLy() {
        String toParse = "fiNalLy";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FINALLY, lexer.getTokenType());
        Assert.assertEquals("fiNalLy", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_fiNallY() {
        String toParse = "fiNallY";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FINALLY, lexer.getTokenType());
        Assert.assertEquals("fiNallY", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_fiNally() {
        String toParse = "fiNally";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FINALLY, lexer.getTokenType());
        Assert.assertEquals("fiNally", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_finALLY() {
        String toParse = "finALLY";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FINALLY, lexer.getTokenType());
        Assert.assertEquals("finALLY", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_finALLy() {
        String toParse = "finALLy";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FINALLY, lexer.getTokenType());
        Assert.assertEquals("finALLy", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_finALlY() {
        String toParse = "finALlY";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FINALLY, lexer.getTokenType());
        Assert.assertEquals("finALlY", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_finALly() {
        String toParse = "finALly";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FINALLY, lexer.getTokenType());
        Assert.assertEquals("finALly", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_finAlLY() {
        String toParse = "finAlLY";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FINALLY, lexer.getTokenType());
        Assert.assertEquals("finAlLY", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_finAlLy() {
        String toParse = "finAlLy";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FINALLY, lexer.getTokenType());
        Assert.assertEquals("finAlLy", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_finAllY() {
        String toParse = "finAllY";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FINALLY, lexer.getTokenType());
        Assert.assertEquals("finAllY", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_finAlly() {
        String toParse = "finAlly";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FINALLY, lexer.getTokenType());
        Assert.assertEquals("finAlly", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_finaLLY() {
        String toParse = "finaLLY";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FINALLY, lexer.getTokenType());
        Assert.assertEquals("finaLLY", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_finaLLy() {
        String toParse = "finaLLy";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FINALLY, lexer.getTokenType());
        Assert.assertEquals("finaLLy", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_finaLlY() {
        String toParse = "finaLlY";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FINALLY, lexer.getTokenType());
        Assert.assertEquals("finaLlY", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_finaLly() {
        String toParse = "finaLly";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FINALLY, lexer.getTokenType());
        Assert.assertEquals("finaLly", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_finalLY() {
        String toParse = "finalLY";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FINALLY, lexer.getTokenType());
        Assert.assertEquals("finalLY", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_finalLy() {
        String toParse = "finalLy";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FINALLY, lexer.getTokenType());
        Assert.assertEquals("finalLy", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_finallY() {
        String toParse = "finallY";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FINALLY, lexer.getTokenType());
        Assert.assertEquals("finallY", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_finally() {
        String toParse = "finally";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FINALLY, lexer.getTokenType());
        Assert.assertEquals("finally", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

}
