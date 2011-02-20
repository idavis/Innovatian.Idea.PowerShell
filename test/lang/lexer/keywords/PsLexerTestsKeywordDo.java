package com.innovatian.idea.powershell.test.lang.lexer.keywords;

import com.innovatian.idea.powershell.lang.lexer.PsTokenTypes;
import com.innovatian.idea.powershell.test.lang.lexer.PsLexerTestContext;
import junit.framework.Assert;

public class PsLexerTestsKeywordDo extends PsLexerTestContext {
    public void testKeyword_DO() {
        String toParse = "DO";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.DO, lexer.getTokenType());
        Assert.assertEquals("DO", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_Do() {
        String toParse = "Do";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.DO, lexer.getTokenType());
        Assert.assertEquals("Do", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_dO() {
        String toParse = "dO";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.DO, lexer.getTokenType());
        Assert.assertEquals("dO", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_do() {
        String toParse = "do";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.DO, lexer.getTokenType());
        Assert.assertEquals("do", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

}
