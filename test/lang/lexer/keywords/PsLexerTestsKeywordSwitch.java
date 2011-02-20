package com.innovatian.idea.powershell.test.lang.lexer.keywords;

import com.innovatian.idea.powershell.lang.lexer.PsTokenTypes;
import com.innovatian.idea.powershell.test.lang.lexer.PsLexerTestContext;
import junit.framework.Assert;

public class PsLexerTestsKeywordSwitch extends PsLexerTestContext {
    public void testKeyword_SWITCH() {
        String toParse = "SWITCH";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.SWITCH, lexer.getTokenType());
        Assert.assertEquals("SWITCH", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_SWITCh() {
        String toParse = "SWITCh";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.SWITCH, lexer.getTokenType());
        Assert.assertEquals("SWITCh", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_SWITcH() {
        String toParse = "SWITcH";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.SWITCH, lexer.getTokenType());
        Assert.assertEquals("SWITcH", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_SWITch() {
        String toParse = "SWITch";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.SWITCH, lexer.getTokenType());
        Assert.assertEquals("SWITch", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_SWItCH() {
        String toParse = "SWItCH";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.SWITCH, lexer.getTokenType());
        Assert.assertEquals("SWItCH", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_SWItCh() {
        String toParse = "SWItCh";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.SWITCH, lexer.getTokenType());
        Assert.assertEquals("SWItCh", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_SWItcH() {
        String toParse = "SWItcH";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.SWITCH, lexer.getTokenType());
        Assert.assertEquals("SWItcH", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_SWItch() {
        String toParse = "SWItch";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.SWITCH, lexer.getTokenType());
        Assert.assertEquals("SWItch", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_SWiTCH() {
        String toParse = "SWiTCH";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.SWITCH, lexer.getTokenType());
        Assert.assertEquals("SWiTCH", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_SWiTCh() {
        String toParse = "SWiTCh";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.SWITCH, lexer.getTokenType());
        Assert.assertEquals("SWiTCh", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_SWiTcH() {
        String toParse = "SWiTcH";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.SWITCH, lexer.getTokenType());
        Assert.assertEquals("SWiTcH", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_SWiTch() {
        String toParse = "SWiTch";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.SWITCH, lexer.getTokenType());
        Assert.assertEquals("SWiTch", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_SWitCH() {
        String toParse = "SWitCH";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.SWITCH, lexer.getTokenType());
        Assert.assertEquals("SWitCH", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_SWitCh() {
        String toParse = "SWitCh";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.SWITCH, lexer.getTokenType());
        Assert.assertEquals("SWitCh", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_SWitcH() {
        String toParse = "SWitcH";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.SWITCH, lexer.getTokenType());
        Assert.assertEquals("SWitcH", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_SWitch() {
        String toParse = "SWitch";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.SWITCH, lexer.getTokenType());
        Assert.assertEquals("SWitch", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_SwITCH() {
        String toParse = "SwITCH";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.SWITCH, lexer.getTokenType());
        Assert.assertEquals("SwITCH", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_SwITCh() {
        String toParse = "SwITCh";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.SWITCH, lexer.getTokenType());
        Assert.assertEquals("SwITCh", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_SwITcH() {
        String toParse = "SwITcH";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.SWITCH, lexer.getTokenType());
        Assert.assertEquals("SwITcH", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_SwITch() {
        String toParse = "SwITch";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.SWITCH, lexer.getTokenType());
        Assert.assertEquals("SwITch", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_SwItCH() {
        String toParse = "SwItCH";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.SWITCH, lexer.getTokenType());
        Assert.assertEquals("SwItCH", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_SwItCh() {
        String toParse = "SwItCh";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.SWITCH, lexer.getTokenType());
        Assert.assertEquals("SwItCh", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_SwItcH() {
        String toParse = "SwItcH";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.SWITCH, lexer.getTokenType());
        Assert.assertEquals("SwItcH", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_SwItch() {
        String toParse = "SwItch";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.SWITCH, lexer.getTokenType());
        Assert.assertEquals("SwItch", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_SwiTCH() {
        String toParse = "SwiTCH";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.SWITCH, lexer.getTokenType());
        Assert.assertEquals("SwiTCH", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_SwiTCh() {
        String toParse = "SwiTCh";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.SWITCH, lexer.getTokenType());
        Assert.assertEquals("SwiTCh", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_SwiTcH() {
        String toParse = "SwiTcH";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.SWITCH, lexer.getTokenType());
        Assert.assertEquals("SwiTcH", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_SwiTch() {
        String toParse = "SwiTch";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.SWITCH, lexer.getTokenType());
        Assert.assertEquals("SwiTch", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_SwitCH() {
        String toParse = "SwitCH";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.SWITCH, lexer.getTokenType());
        Assert.assertEquals("SwitCH", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_SwitCh() {
        String toParse = "SwitCh";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.SWITCH, lexer.getTokenType());
        Assert.assertEquals("SwitCh", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_SwitcH() {
        String toParse = "SwitcH";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.SWITCH, lexer.getTokenType());
        Assert.assertEquals("SwitcH", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_Switch() {
        String toParse = "Switch";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.SWITCH, lexer.getTokenType());
        Assert.assertEquals("Switch", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_sWITCH() {
        String toParse = "sWITCH";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.SWITCH, lexer.getTokenType());
        Assert.assertEquals("sWITCH", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_sWITCh() {
        String toParse = "sWITCh";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.SWITCH, lexer.getTokenType());
        Assert.assertEquals("sWITCh", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_sWITcH() {
        String toParse = "sWITcH";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.SWITCH, lexer.getTokenType());
        Assert.assertEquals("sWITcH", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_sWITch() {
        String toParse = "sWITch";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.SWITCH, lexer.getTokenType());
        Assert.assertEquals("sWITch", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_sWItCH() {
        String toParse = "sWItCH";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.SWITCH, lexer.getTokenType());
        Assert.assertEquals("sWItCH", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_sWItCh() {
        String toParse = "sWItCh";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.SWITCH, lexer.getTokenType());
        Assert.assertEquals("sWItCh", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_sWItcH() {
        String toParse = "sWItcH";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.SWITCH, lexer.getTokenType());
        Assert.assertEquals("sWItcH", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_sWItch() {
        String toParse = "sWItch";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.SWITCH, lexer.getTokenType());
        Assert.assertEquals("sWItch", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_sWiTCH() {
        String toParse = "sWiTCH";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.SWITCH, lexer.getTokenType());
        Assert.assertEquals("sWiTCH", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_sWiTCh() {
        String toParse = "sWiTCh";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.SWITCH, lexer.getTokenType());
        Assert.assertEquals("sWiTCh", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_sWiTcH() {
        String toParse = "sWiTcH";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.SWITCH, lexer.getTokenType());
        Assert.assertEquals("sWiTcH", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_sWiTch() {
        String toParse = "sWiTch";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.SWITCH, lexer.getTokenType());
        Assert.assertEquals("sWiTch", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_sWitCH() {
        String toParse = "sWitCH";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.SWITCH, lexer.getTokenType());
        Assert.assertEquals("sWitCH", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_sWitCh() {
        String toParse = "sWitCh";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.SWITCH, lexer.getTokenType());
        Assert.assertEquals("sWitCh", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_sWitcH() {
        String toParse = "sWitcH";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.SWITCH, lexer.getTokenType());
        Assert.assertEquals("sWitcH", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_sWitch() {
        String toParse = "sWitch";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.SWITCH, lexer.getTokenType());
        Assert.assertEquals("sWitch", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_swITCH() {
        String toParse = "swITCH";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.SWITCH, lexer.getTokenType());
        Assert.assertEquals("swITCH", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_swITCh() {
        String toParse = "swITCh";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.SWITCH, lexer.getTokenType());
        Assert.assertEquals("swITCh", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_swITcH() {
        String toParse = "swITcH";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.SWITCH, lexer.getTokenType());
        Assert.assertEquals("swITcH", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_swITch() {
        String toParse = "swITch";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.SWITCH, lexer.getTokenType());
        Assert.assertEquals("swITch", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_swItCH() {
        String toParse = "swItCH";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.SWITCH, lexer.getTokenType());
        Assert.assertEquals("swItCH", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_swItCh() {
        String toParse = "swItCh";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.SWITCH, lexer.getTokenType());
        Assert.assertEquals("swItCh", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_swItcH() {
        String toParse = "swItcH";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.SWITCH, lexer.getTokenType());
        Assert.assertEquals("swItcH", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_swItch() {
        String toParse = "swItch";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.SWITCH, lexer.getTokenType());
        Assert.assertEquals("swItch", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_swiTCH() {
        String toParse = "swiTCH";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.SWITCH, lexer.getTokenType());
        Assert.assertEquals("swiTCH", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_swiTCh() {
        String toParse = "swiTCh";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.SWITCH, lexer.getTokenType());
        Assert.assertEquals("swiTCh", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_swiTcH() {
        String toParse = "swiTcH";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.SWITCH, lexer.getTokenType());
        Assert.assertEquals("swiTcH", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_swiTch() {
        String toParse = "swiTch";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.SWITCH, lexer.getTokenType());
        Assert.assertEquals("swiTch", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_switCH() {
        String toParse = "switCH";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.SWITCH, lexer.getTokenType());
        Assert.assertEquals("switCH", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_switCh() {
        String toParse = "switCh";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.SWITCH, lexer.getTokenType());
        Assert.assertEquals("switCh", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_switcH() {
        String toParse = "switcH";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.SWITCH, lexer.getTokenType());
        Assert.assertEquals("switcH", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_switch() {
        String toParse = "switch";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.SWITCH, lexer.getTokenType());
        Assert.assertEquals("switch", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

}
