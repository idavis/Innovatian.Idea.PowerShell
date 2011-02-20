package com.innovatian.idea.powershell.test.lang.lexer.keywords;

import com.innovatian.idea.powershell.lang.lexer.PsTokenTypes;
import com.innovatian.idea.powershell.test.lang.lexer.PsLexerTestContext;
import junit.framework.Assert;

public class PsLexerTestsKeywordIf extends PsLexerTestContext {
    public void testKeyword_IF() {
        String toParse = "IF";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.IF, lexer.getTokenType());
        Assert.assertEquals("IF", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_If() {
        String toParse = "If";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.IF, lexer.getTokenType());
        Assert.assertEquals("If", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_iF() {
        String toParse = "iF";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.IF, lexer.getTokenType());
        Assert.assertEquals("iF", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_if() {
        String toParse = "if";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.IF, lexer.getTokenType());
        Assert.assertEquals("if", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

}
