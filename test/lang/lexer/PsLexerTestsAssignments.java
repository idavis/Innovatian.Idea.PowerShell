package com.innovatian.idea.powershell.test.lang.lexer;

import com.innovatian.idea.powershell.lang.lexer.PsTokenTypes;
import junit.framework.Assert;

public class PsLexerTestsAssignments extends PsLexerTestContext {
    public void testSimpleAssignmentToNumber() {
        final String toParse = "$a=5";
        lexer.start(toParse);

        Assert.assertEquals(PsTokenTypes.DOLLAR, lexer.getTokenType());
        Assert.assertEquals("$", lexer.getTokenText());

        lexer.advance();

        Assert.assertEquals(PsTokenTypes.IDENT, lexer.getTokenType());
        Assert.assertEquals(lexer.getTokenText(), "a");

        lexer.advance();

        Assert.assertEquals(PsTokenTypes.ASSIGN, lexer.getTokenType());
        Assert.assertEquals("=", lexer.getTokenText());

        lexer.advance();

        Assert.assertEquals(PsTokenTypes.NUMBER, lexer.getTokenType());
        Assert.assertEquals("5", lexer.getTokenText());

        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testSimpleAssignmentToSimpleVariable() {
        final String toParse = "$a=$true";
        lexer.start(toParse);

        Assert.assertEquals(PsTokenTypes.DOLLAR, lexer.getTokenType());
        Assert.assertEquals("$", lexer.getTokenText());

        lexer.advance();

        Assert.assertEquals(PsTokenTypes.IDENT, lexer.getTokenType());
        Assert.assertEquals(lexer.getTokenText(), "a");

        lexer.advance();

        Assert.assertEquals(PsTokenTypes.ASSIGN, lexer.getTokenType());
        Assert.assertEquals("=", lexer.getTokenText());

        lexer.advance();

        Assert.assertEquals(PsTokenTypes.IDENT, lexer.getTokenType());
        Assert.assertEquals("$true", lexer.getTokenText());

        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testSimpleAssignmentToSimpleExpression() {
        final String toParse = "$a=7-eq7";
        lexer.start(toParse);

        Assert.assertEquals(PsTokenTypes.DOLLAR, lexer.getTokenType());
        Assert.assertEquals("$", lexer.getTokenText());

        lexer.advance();

        Assert.assertEquals(PsTokenTypes.IDENT, lexer.getTokenType());
        Assert.assertEquals(lexer.getTokenText(), "a");

        lexer.advance();

        Assert.assertEquals(PsTokenTypes.ASSIGN, lexer.getTokenType());
        Assert.assertEquals("=", lexer.getTokenText());

        lexer.advance();

        Assert.assertEquals(PsTokenTypes.NUMBER, lexer.getTokenType());
        Assert.assertEquals("7", lexer.getTokenText());

        lexer.advance();

        Assert.assertEquals(PsTokenTypes.COEQ, lexer.getTokenType());
        Assert.assertEquals("-eq", lexer.getTokenText());

        lexer.advance();

        Assert.assertEquals(PsTokenTypes.NUMBER, lexer.getTokenType());
        Assert.assertEquals("7", lexer.getTokenText());

        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testSimpleAssignmentToMisMatchedCaseSimpleExpression() {
        final String toParse = "$a=7-eQ7";
        lexer.start(toParse);

        Assert.assertEquals(PsTokenTypes.DOLLAR, lexer.getTokenType());
        Assert.assertEquals("$", lexer.getTokenText());

        lexer.advance();

        Assert.assertEquals(PsTokenTypes.IDENT, lexer.getTokenType());
        Assert.assertEquals(lexer.getTokenText(), "a");

        lexer.advance();

        Assert.assertEquals(PsTokenTypes.ASSIGN, lexer.getTokenType());
        Assert.assertEquals("=", lexer.getTokenText());

        lexer.advance();

        Assert.assertEquals(PsTokenTypes.NUMBER, lexer.getTokenType());
        Assert.assertEquals("7", lexer.getTokenText());

        lexer.advance();

        Assert.assertEquals(PsTokenTypes.COEQ, lexer.getTokenType());
        Assert.assertEquals("-eQ", lexer.getTokenText());

        lexer.advance();

        Assert.assertEquals(PsTokenTypes.NUMBER, lexer.getTokenType());
        Assert.assertEquals("7", lexer.getTokenText());

        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }
}
