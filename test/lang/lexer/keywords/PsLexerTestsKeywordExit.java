package com.innovatian.idea.powershell.test.lang.lexer.keywords;

import com.innovatian.idea.powershell.lang.lexer.PsTokenTypes;
import com.innovatian.idea.powershell.test.lang.lexer.PsLexerTestContext;
import junit.framework.Assert;

public class PsLexerTestsKeywordExit extends PsLexerTestContext {
    public void testKeyword_EXIT() {
        String toParse = "EXIT";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.EXIT, lexer.getTokenType());
        Assert.assertEquals("EXIT", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_EXIt() {
        String toParse = "EXIt";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.EXIT, lexer.getTokenType());
        Assert.assertEquals("EXIt", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_EXiT() {
        String toParse = "EXiT";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.EXIT, lexer.getTokenType());
        Assert.assertEquals("EXiT", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_EXit() {
        String toParse = "EXit";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.EXIT, lexer.getTokenType());
        Assert.assertEquals("EXit", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_ExIT() {
        String toParse = "ExIT";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.EXIT, lexer.getTokenType());
        Assert.assertEquals("ExIT", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_ExIt() {
        String toParse = "ExIt";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.EXIT, lexer.getTokenType());
        Assert.assertEquals("ExIt", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_ExiT() {
        String toParse = "ExiT";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.EXIT, lexer.getTokenType());
        Assert.assertEquals("ExiT", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_Exit() {
        String toParse = "Exit";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.EXIT, lexer.getTokenType());
        Assert.assertEquals("Exit", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_eXIT() {
        String toParse = "eXIT";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.EXIT, lexer.getTokenType());
        Assert.assertEquals("eXIT", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_eXIt() {
        String toParse = "eXIt";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.EXIT, lexer.getTokenType());
        Assert.assertEquals("eXIt", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_eXiT() {
        String toParse = "eXiT";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.EXIT, lexer.getTokenType());
        Assert.assertEquals("eXiT", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_eXit() {
        String toParse = "eXit";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.EXIT, lexer.getTokenType());
        Assert.assertEquals("eXit", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_exIT() {
        String toParse = "exIT";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.EXIT, lexer.getTokenType());
        Assert.assertEquals("exIT", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_exIt() {
        String toParse = "exIt";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.EXIT, lexer.getTokenType());
        Assert.assertEquals("exIt", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_exiT() {
        String toParse = "exiT";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.EXIT, lexer.getTokenType());
        Assert.assertEquals("exiT", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_exit() {
        String toParse = "exit";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.EXIT, lexer.getTokenType());
        Assert.assertEquals("exit", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

}
