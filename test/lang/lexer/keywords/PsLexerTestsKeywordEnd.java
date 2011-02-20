package com.innovatian.idea.powershell.test.lang.lexer.keywords;

import com.innovatian.idea.powershell.lang.lexer.PsTokenTypes;
import com.innovatian.idea.powershell.test.lang.lexer.PsLexerTestContext;
import junit.framework.Assert;

public class PsLexerTestsKeywordEnd extends PsLexerTestContext {
    public void testKeyword_END() {
        String toParse = "END";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.END, lexer.getTokenType());
        Assert.assertEquals("END", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_ENd() {
        String toParse = "ENd";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.END, lexer.getTokenType());
        Assert.assertEquals("ENd", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_EnD() {
        String toParse = "EnD";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.END, lexer.getTokenType());
        Assert.assertEquals("EnD", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_End() {
        String toParse = "End";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.END, lexer.getTokenType());
        Assert.assertEquals("End", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_eND() {
        String toParse = "eND";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.END, lexer.getTokenType());
        Assert.assertEquals("eND", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_eNd() {
        String toParse = "eNd";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.END, lexer.getTokenType());
        Assert.assertEquals("eNd", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_enD() {
        String toParse = "enD";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.END, lexer.getTokenType());
        Assert.assertEquals("enD", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_end() {
        String toParse = "end";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.END, lexer.getTokenType());
        Assert.assertEquals("end", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

}
