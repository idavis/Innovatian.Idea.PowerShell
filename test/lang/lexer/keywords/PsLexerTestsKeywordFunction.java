package com.innovatian.idea.powershell.test.lang.lexer.keywords;

import com.innovatian.idea.powershell.lang.lexer.PsTokenTypes;
import com.innovatian.idea.powershell.test.lang.lexer.PsLexerTestContext;
import junit.framework.Assert;

public class PsLexerTestsKeywordFunction extends PsLexerTestContext {
    public void testKeyword_FUNCTION() {
        String toParse = "FUNCTION";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("FUNCTION", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_FUNCTIOn() {
        String toParse = "FUNCTIOn";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("FUNCTIOn", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_FUNCTIoN() {
        String toParse = "FUNCTIoN";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("FUNCTIoN", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_FUNCTIon() {
        String toParse = "FUNCTIon";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("FUNCTIon", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_FUNCTiON() {
        String toParse = "FUNCTiON";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("FUNCTiON", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_FUNCTiOn() {
        String toParse = "FUNCTiOn";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("FUNCTiOn", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_FUNCTioN() {
        String toParse = "FUNCTioN";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("FUNCTioN", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_FUNCTion() {
        String toParse = "FUNCTion";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("FUNCTion", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_FUNCtION() {
        String toParse = "FUNCtION";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("FUNCtION", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_FUNCtIOn() {
        String toParse = "FUNCtIOn";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("FUNCtIOn", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_FUNCtIoN() {
        String toParse = "FUNCtIoN";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("FUNCtIoN", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_FUNCtIon() {
        String toParse = "FUNCtIon";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("FUNCtIon", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_FUNCtiON() {
        String toParse = "FUNCtiON";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("FUNCtiON", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_FUNCtiOn() {
        String toParse = "FUNCtiOn";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("FUNCtiOn", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_FUNCtioN() {
        String toParse = "FUNCtioN";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("FUNCtioN", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_FUNCtion() {
        String toParse = "FUNCtion";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("FUNCtion", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_FUNcTION() {
        String toParse = "FUNcTION";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("FUNcTION", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_FUNcTIOn() {
        String toParse = "FUNcTIOn";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("FUNcTIOn", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_FUNcTIoN() {
        String toParse = "FUNcTIoN";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("FUNcTIoN", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_FUNcTIon() {
        String toParse = "FUNcTIon";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("FUNcTIon", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_FUNcTiON() {
        String toParse = "FUNcTiON";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("FUNcTiON", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_FUNcTiOn() {
        String toParse = "FUNcTiOn";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("FUNcTiOn", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_FUNcTioN() {
        String toParse = "FUNcTioN";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("FUNcTioN", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_FUNcTion() {
        String toParse = "FUNcTion";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("FUNcTion", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_FUNctION() {
        String toParse = "FUNctION";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("FUNctION", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_FUNctIOn() {
        String toParse = "FUNctIOn";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("FUNctIOn", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_FUNctIoN() {
        String toParse = "FUNctIoN";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("FUNctIoN", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_FUNctIon() {
        String toParse = "FUNctIon";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("FUNctIon", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_FUNctiON() {
        String toParse = "FUNctiON";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("FUNctiON", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_FUNctiOn() {
        String toParse = "FUNctiOn";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("FUNctiOn", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_FUNctioN() {
        String toParse = "FUNctioN";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("FUNctioN", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_FUNction() {
        String toParse = "FUNction";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("FUNction", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_FUnCTION() {
        String toParse = "FUnCTION";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("FUnCTION", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_FUnCTIOn() {
        String toParse = "FUnCTIOn";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("FUnCTIOn", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_FUnCTIoN() {
        String toParse = "FUnCTIoN";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("FUnCTIoN", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_FUnCTIon() {
        String toParse = "FUnCTIon";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("FUnCTIon", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_FUnCTiON() {
        String toParse = "FUnCTiON";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("FUnCTiON", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_FUnCTiOn() {
        String toParse = "FUnCTiOn";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("FUnCTiOn", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_FUnCTioN() {
        String toParse = "FUnCTioN";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("FUnCTioN", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_FUnCTion() {
        String toParse = "FUnCTion";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("FUnCTion", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_FUnCtION() {
        String toParse = "FUnCtION";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("FUnCtION", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_FUnCtIOn() {
        String toParse = "FUnCtIOn";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("FUnCtIOn", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_FUnCtIoN() {
        String toParse = "FUnCtIoN";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("FUnCtIoN", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_FUnCtIon() {
        String toParse = "FUnCtIon";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("FUnCtIon", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_FUnCtiON() {
        String toParse = "FUnCtiON";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("FUnCtiON", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_FUnCtiOn() {
        String toParse = "FUnCtiOn";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("FUnCtiOn", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_FUnCtioN() {
        String toParse = "FUnCtioN";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("FUnCtioN", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_FUnCtion() {
        String toParse = "FUnCtion";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("FUnCtion", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_FUncTION() {
        String toParse = "FUncTION";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("FUncTION", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_FUncTIOn() {
        String toParse = "FUncTIOn";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("FUncTIOn", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_FUncTIoN() {
        String toParse = "FUncTIoN";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("FUncTIoN", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_FUncTIon() {
        String toParse = "FUncTIon";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("FUncTIon", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_FUncTiON() {
        String toParse = "FUncTiON";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("FUncTiON", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_FUncTiOn() {
        String toParse = "FUncTiOn";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("FUncTiOn", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_FUncTioN() {
        String toParse = "FUncTioN";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("FUncTioN", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_FUncTion() {
        String toParse = "FUncTion";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("FUncTion", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_FUnctION() {
        String toParse = "FUnctION";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("FUnctION", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_FUnctIOn() {
        String toParse = "FUnctIOn";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("FUnctIOn", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_FUnctIoN() {
        String toParse = "FUnctIoN";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("FUnctIoN", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_FUnctIon() {
        String toParse = "FUnctIon";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("FUnctIon", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_FUnctiON() {
        String toParse = "FUnctiON";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("FUnctiON", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_FUnctiOn() {
        String toParse = "FUnctiOn";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("FUnctiOn", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_FUnctioN() {
        String toParse = "FUnctioN";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("FUnctioN", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_FUnction() {
        String toParse = "FUnction";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("FUnction", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_FuNCTION() {
        String toParse = "FuNCTION";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("FuNCTION", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_FuNCTIOn() {
        String toParse = "FuNCTIOn";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("FuNCTIOn", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_FuNCTIoN() {
        String toParse = "FuNCTIoN";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("FuNCTIoN", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_FuNCTIon() {
        String toParse = "FuNCTIon";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("FuNCTIon", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_FuNCTiON() {
        String toParse = "FuNCTiON";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("FuNCTiON", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_FuNCTiOn() {
        String toParse = "FuNCTiOn";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("FuNCTiOn", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_FuNCTioN() {
        String toParse = "FuNCTioN";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("FuNCTioN", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_FuNCTion() {
        String toParse = "FuNCTion";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("FuNCTion", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_FuNCtION() {
        String toParse = "FuNCtION";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("FuNCtION", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_FuNCtIOn() {
        String toParse = "FuNCtIOn";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("FuNCtIOn", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_FuNCtIoN() {
        String toParse = "FuNCtIoN";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("FuNCtIoN", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_FuNCtIon() {
        String toParse = "FuNCtIon";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("FuNCtIon", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_FuNCtiON() {
        String toParse = "FuNCtiON";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("FuNCtiON", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_FuNCtiOn() {
        String toParse = "FuNCtiOn";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("FuNCtiOn", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_FuNCtioN() {
        String toParse = "FuNCtioN";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("FuNCtioN", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_FuNCtion() {
        String toParse = "FuNCtion";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("FuNCtion", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_FuNcTION() {
        String toParse = "FuNcTION";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("FuNcTION", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_FuNcTIOn() {
        String toParse = "FuNcTIOn";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("FuNcTIOn", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_FuNcTIoN() {
        String toParse = "FuNcTIoN";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("FuNcTIoN", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_FuNcTIon() {
        String toParse = "FuNcTIon";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("FuNcTIon", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_FuNcTiON() {
        String toParse = "FuNcTiON";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("FuNcTiON", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_FuNcTiOn() {
        String toParse = "FuNcTiOn";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("FuNcTiOn", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_FuNcTioN() {
        String toParse = "FuNcTioN";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("FuNcTioN", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_FuNcTion() {
        String toParse = "FuNcTion";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("FuNcTion", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_FuNctION() {
        String toParse = "FuNctION";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("FuNctION", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_FuNctIOn() {
        String toParse = "FuNctIOn";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("FuNctIOn", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_FuNctIoN() {
        String toParse = "FuNctIoN";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("FuNctIoN", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_FuNctIon() {
        String toParse = "FuNctIon";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("FuNctIon", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_FuNctiON() {
        String toParse = "FuNctiON";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("FuNctiON", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_FuNctiOn() {
        String toParse = "FuNctiOn";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("FuNctiOn", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_FuNctioN() {
        String toParse = "FuNctioN";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("FuNctioN", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_FuNction() {
        String toParse = "FuNction";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("FuNction", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_FunCTION() {
        String toParse = "FunCTION";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("FunCTION", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_FunCTIOn() {
        String toParse = "FunCTIOn";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("FunCTIOn", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_FunCTIoN() {
        String toParse = "FunCTIoN";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("FunCTIoN", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_FunCTIon() {
        String toParse = "FunCTIon";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("FunCTIon", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_FunCTiON() {
        String toParse = "FunCTiON";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("FunCTiON", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_FunCTiOn() {
        String toParse = "FunCTiOn";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("FunCTiOn", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_FunCTioN() {
        String toParse = "FunCTioN";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("FunCTioN", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_FunCTion() {
        String toParse = "FunCTion";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("FunCTion", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_FunCtION() {
        String toParse = "FunCtION";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("FunCtION", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_FunCtIOn() {
        String toParse = "FunCtIOn";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("FunCtIOn", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_FunCtIoN() {
        String toParse = "FunCtIoN";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("FunCtIoN", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_FunCtIon() {
        String toParse = "FunCtIon";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("FunCtIon", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_FunCtiON() {
        String toParse = "FunCtiON";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("FunCtiON", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_FunCtiOn() {
        String toParse = "FunCtiOn";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("FunCtiOn", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_FunCtioN() {
        String toParse = "FunCtioN";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("FunCtioN", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_FunCtion() {
        String toParse = "FunCtion";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("FunCtion", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_FuncTION() {
        String toParse = "FuncTION";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("FuncTION", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_FuncTIOn() {
        String toParse = "FuncTIOn";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("FuncTIOn", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_FuncTIoN() {
        String toParse = "FuncTIoN";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("FuncTIoN", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_FuncTIon() {
        String toParse = "FuncTIon";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("FuncTIon", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_FuncTiON() {
        String toParse = "FuncTiON";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("FuncTiON", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_FuncTiOn() {
        String toParse = "FuncTiOn";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("FuncTiOn", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_FuncTioN() {
        String toParse = "FuncTioN";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("FuncTioN", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_FuncTion() {
        String toParse = "FuncTion";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("FuncTion", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_FunctION() {
        String toParse = "FunctION";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("FunctION", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_FunctIOn() {
        String toParse = "FunctIOn";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("FunctIOn", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_FunctIoN() {
        String toParse = "FunctIoN";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("FunctIoN", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_FunctIon() {
        String toParse = "FunctIon";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("FunctIon", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_FunctiON() {
        String toParse = "FunctiON";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("FunctiON", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_FunctiOn() {
        String toParse = "FunctiOn";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("FunctiOn", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_FunctioN() {
        String toParse = "FunctioN";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("FunctioN", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_Function() {
        String toParse = "Function";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("Function", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_fUNCTION() {
        String toParse = "fUNCTION";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("fUNCTION", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_fUNCTIOn() {
        String toParse = "fUNCTIOn";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("fUNCTIOn", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_fUNCTIoN() {
        String toParse = "fUNCTIoN";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("fUNCTIoN", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_fUNCTIon() {
        String toParse = "fUNCTIon";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("fUNCTIon", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_fUNCTiON() {
        String toParse = "fUNCTiON";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("fUNCTiON", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_fUNCTiOn() {
        String toParse = "fUNCTiOn";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("fUNCTiOn", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_fUNCTioN() {
        String toParse = "fUNCTioN";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("fUNCTioN", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_fUNCTion() {
        String toParse = "fUNCTion";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("fUNCTion", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_fUNCtION() {
        String toParse = "fUNCtION";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("fUNCtION", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_fUNCtIOn() {
        String toParse = "fUNCtIOn";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("fUNCtIOn", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_fUNCtIoN() {
        String toParse = "fUNCtIoN";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("fUNCtIoN", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_fUNCtIon() {
        String toParse = "fUNCtIon";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("fUNCtIon", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_fUNCtiON() {
        String toParse = "fUNCtiON";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("fUNCtiON", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_fUNCtiOn() {
        String toParse = "fUNCtiOn";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("fUNCtiOn", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_fUNCtioN() {
        String toParse = "fUNCtioN";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("fUNCtioN", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_fUNCtion() {
        String toParse = "fUNCtion";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("fUNCtion", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_fUNcTION() {
        String toParse = "fUNcTION";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("fUNcTION", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_fUNcTIOn() {
        String toParse = "fUNcTIOn";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("fUNcTIOn", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_fUNcTIoN() {
        String toParse = "fUNcTIoN";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("fUNcTIoN", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_fUNcTIon() {
        String toParse = "fUNcTIon";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("fUNcTIon", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_fUNcTiON() {
        String toParse = "fUNcTiON";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("fUNcTiON", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_fUNcTiOn() {
        String toParse = "fUNcTiOn";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("fUNcTiOn", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_fUNcTioN() {
        String toParse = "fUNcTioN";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("fUNcTioN", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_fUNcTion() {
        String toParse = "fUNcTion";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("fUNcTion", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_fUNctION() {
        String toParse = "fUNctION";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("fUNctION", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_fUNctIOn() {
        String toParse = "fUNctIOn";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("fUNctIOn", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_fUNctIoN() {
        String toParse = "fUNctIoN";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("fUNctIoN", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_fUNctIon() {
        String toParse = "fUNctIon";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("fUNctIon", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_fUNctiON() {
        String toParse = "fUNctiON";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("fUNctiON", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_fUNctiOn() {
        String toParse = "fUNctiOn";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("fUNctiOn", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_fUNctioN() {
        String toParse = "fUNctioN";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("fUNctioN", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_fUNction() {
        String toParse = "fUNction";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("fUNction", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_fUnCTION() {
        String toParse = "fUnCTION";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("fUnCTION", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_fUnCTIOn() {
        String toParse = "fUnCTIOn";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("fUnCTIOn", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_fUnCTIoN() {
        String toParse = "fUnCTIoN";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("fUnCTIoN", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_fUnCTIon() {
        String toParse = "fUnCTIon";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("fUnCTIon", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_fUnCTiON() {
        String toParse = "fUnCTiON";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("fUnCTiON", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_fUnCTiOn() {
        String toParse = "fUnCTiOn";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("fUnCTiOn", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_fUnCTioN() {
        String toParse = "fUnCTioN";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("fUnCTioN", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_fUnCTion() {
        String toParse = "fUnCTion";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("fUnCTion", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_fUnCtION() {
        String toParse = "fUnCtION";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("fUnCtION", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_fUnCtIOn() {
        String toParse = "fUnCtIOn";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("fUnCtIOn", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_fUnCtIoN() {
        String toParse = "fUnCtIoN";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("fUnCtIoN", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_fUnCtIon() {
        String toParse = "fUnCtIon";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("fUnCtIon", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_fUnCtiON() {
        String toParse = "fUnCtiON";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("fUnCtiON", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_fUnCtiOn() {
        String toParse = "fUnCtiOn";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("fUnCtiOn", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_fUnCtioN() {
        String toParse = "fUnCtioN";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("fUnCtioN", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_fUnCtion() {
        String toParse = "fUnCtion";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("fUnCtion", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_fUncTION() {
        String toParse = "fUncTION";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("fUncTION", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_fUncTIOn() {
        String toParse = "fUncTIOn";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("fUncTIOn", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_fUncTIoN() {
        String toParse = "fUncTIoN";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("fUncTIoN", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_fUncTIon() {
        String toParse = "fUncTIon";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("fUncTIon", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_fUncTiON() {
        String toParse = "fUncTiON";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("fUncTiON", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_fUncTiOn() {
        String toParse = "fUncTiOn";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("fUncTiOn", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_fUncTioN() {
        String toParse = "fUncTioN";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("fUncTioN", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_fUncTion() {
        String toParse = "fUncTion";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("fUncTion", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_fUnctION() {
        String toParse = "fUnctION";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("fUnctION", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_fUnctIOn() {
        String toParse = "fUnctIOn";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("fUnctIOn", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_fUnctIoN() {
        String toParse = "fUnctIoN";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("fUnctIoN", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_fUnctIon() {
        String toParse = "fUnctIon";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("fUnctIon", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_fUnctiON() {
        String toParse = "fUnctiON";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("fUnctiON", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_fUnctiOn() {
        String toParse = "fUnctiOn";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("fUnctiOn", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_fUnctioN() {
        String toParse = "fUnctioN";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("fUnctioN", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_fUnction() {
        String toParse = "fUnction";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("fUnction", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_fuNCTION() {
        String toParse = "fuNCTION";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("fuNCTION", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_fuNCTIOn() {
        String toParse = "fuNCTIOn";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("fuNCTIOn", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_fuNCTIoN() {
        String toParse = "fuNCTIoN";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("fuNCTIoN", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_fuNCTIon() {
        String toParse = "fuNCTIon";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("fuNCTIon", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_fuNCTiON() {
        String toParse = "fuNCTiON";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("fuNCTiON", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_fuNCTiOn() {
        String toParse = "fuNCTiOn";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("fuNCTiOn", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_fuNCTioN() {
        String toParse = "fuNCTioN";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("fuNCTioN", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_fuNCTion() {
        String toParse = "fuNCTion";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("fuNCTion", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_fuNCtION() {
        String toParse = "fuNCtION";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("fuNCtION", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_fuNCtIOn() {
        String toParse = "fuNCtIOn";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("fuNCtIOn", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_fuNCtIoN() {
        String toParse = "fuNCtIoN";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("fuNCtIoN", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_fuNCtIon() {
        String toParse = "fuNCtIon";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("fuNCtIon", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_fuNCtiON() {
        String toParse = "fuNCtiON";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("fuNCtiON", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_fuNCtiOn() {
        String toParse = "fuNCtiOn";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("fuNCtiOn", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_fuNCtioN() {
        String toParse = "fuNCtioN";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("fuNCtioN", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_fuNCtion() {
        String toParse = "fuNCtion";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("fuNCtion", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_fuNcTION() {
        String toParse = "fuNcTION";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("fuNcTION", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_fuNcTIOn() {
        String toParse = "fuNcTIOn";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("fuNcTIOn", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_fuNcTIoN() {
        String toParse = "fuNcTIoN";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("fuNcTIoN", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_fuNcTIon() {
        String toParse = "fuNcTIon";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("fuNcTIon", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_fuNcTiON() {
        String toParse = "fuNcTiON";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("fuNcTiON", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_fuNcTiOn() {
        String toParse = "fuNcTiOn";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("fuNcTiOn", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_fuNcTioN() {
        String toParse = "fuNcTioN";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("fuNcTioN", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_fuNcTion() {
        String toParse = "fuNcTion";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("fuNcTion", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_fuNctION() {
        String toParse = "fuNctION";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("fuNctION", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_fuNctIOn() {
        String toParse = "fuNctIOn";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("fuNctIOn", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_fuNctIoN() {
        String toParse = "fuNctIoN";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("fuNctIoN", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_fuNctIon() {
        String toParse = "fuNctIon";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("fuNctIon", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_fuNctiON() {
        String toParse = "fuNctiON";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("fuNctiON", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_fuNctiOn() {
        String toParse = "fuNctiOn";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("fuNctiOn", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_fuNctioN() {
        String toParse = "fuNctioN";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("fuNctioN", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_fuNction() {
        String toParse = "fuNction";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("fuNction", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_funCTION() {
        String toParse = "funCTION";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("funCTION", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_funCTIOn() {
        String toParse = "funCTIOn";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("funCTIOn", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_funCTIoN() {
        String toParse = "funCTIoN";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("funCTIoN", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_funCTIon() {
        String toParse = "funCTIon";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("funCTIon", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_funCTiON() {
        String toParse = "funCTiON";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("funCTiON", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_funCTiOn() {
        String toParse = "funCTiOn";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("funCTiOn", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_funCTioN() {
        String toParse = "funCTioN";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("funCTioN", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_funCTion() {
        String toParse = "funCTion";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("funCTion", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_funCtION() {
        String toParse = "funCtION";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("funCtION", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_funCtIOn() {
        String toParse = "funCtIOn";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("funCtIOn", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_funCtIoN() {
        String toParse = "funCtIoN";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("funCtIoN", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_funCtIon() {
        String toParse = "funCtIon";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("funCtIon", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_funCtiON() {
        String toParse = "funCtiON";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("funCtiON", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_funCtiOn() {
        String toParse = "funCtiOn";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("funCtiOn", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_funCtioN() {
        String toParse = "funCtioN";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("funCtioN", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_funCtion() {
        String toParse = "funCtion";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("funCtion", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_funcTION() {
        String toParse = "funcTION";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("funcTION", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_funcTIOn() {
        String toParse = "funcTIOn";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("funcTIOn", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_funcTIoN() {
        String toParse = "funcTIoN";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("funcTIoN", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_funcTIon() {
        String toParse = "funcTIon";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("funcTIon", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_funcTiON() {
        String toParse = "funcTiON";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("funcTiON", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_funcTiOn() {
        String toParse = "funcTiOn";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("funcTiOn", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_funcTioN() {
        String toParse = "funcTioN";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("funcTioN", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_funcTion() {
        String toParse = "funcTion";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("funcTion", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_functION() {
        String toParse = "functION";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("functION", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_functIOn() {
        String toParse = "functIOn";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("functIOn", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_functIoN() {
        String toParse = "functIoN";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("functIoN", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_functIon() {
        String toParse = "functIon";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("functIon", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_functiON() {
        String toParse = "functiON";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("functiON", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_functiOn() {
        String toParse = "functiOn";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("functiOn", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_functioN() {
        String toParse = "functioN";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("functioN", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_function() {
        String toParse = "function";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FUNCTION, lexer.getTokenType());
        Assert.assertEquals("function", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

}
