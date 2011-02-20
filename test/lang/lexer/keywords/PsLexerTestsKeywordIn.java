package com.innovatian.idea.powershell.test.lang.lexer.keywords;

import com.innovatian.idea.powershell.lang.lexer.PsTokenTypes;
import com.innovatian.idea.powershell.test.lang.lexer.PsLexerTestContext;
import junit.framework.Assert;

public class PsLexerTestsKeywordIn extends PsLexerTestContext {
    public void testKeyword_IN() {
        String toParse = "IN";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.IN, lexer.getTokenType());
        Assert.assertEquals("IN", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_In() {
        String toParse = "In";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.IN, lexer.getTokenType());
        Assert.assertEquals("In", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_iN() {
        String toParse = "iN";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.IN, lexer.getTokenType());
        Assert.assertEquals("iN", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_in() {
        String toParse = "in";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.IN, lexer.getTokenType());
        Assert.assertEquals("in", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

}
