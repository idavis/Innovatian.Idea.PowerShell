package com.innovatian.idea.powershell.test.lang.lexer;

import com.innovatian.idea.powershell.lang.lexer.PsTokenTypes;
import junit.framework.Assert;

public class PsLexerTestsString extends PsLexerTestContext {
    public void testDoubleQuotedStringWithIdenifier() {
        final String toParse = "\"$a\"";
        lexer.start(toParse);

        Assert.assertEquals(PsTokenTypes.EXPSTRING_BEGIN, lexer.getTokenType());
        Assert.assertEquals("\"", lexer.getTokenText());

        lexer.advance();

        Assert.assertEquals(PsTokenTypes.DOLLAR, lexer.getTokenType());
        Assert.assertEquals("$", lexer.getTokenText());

        lexer.advance();

        Assert.assertEquals(PsTokenTypes.IDENT, lexer.getTokenType());
        Assert.assertEquals("a", lexer.getTokenText());

        lexer.advance();

        Assert.assertEquals(PsTokenTypes.EXPSTRING_END, lexer.getTokenType());
        Assert.assertEquals("\"", lexer.getTokenText());

        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testDoubleQuotedStringWithIdenifierInCurlyBraces() {
        final String toParse = "\"${a}\"";
        lexer.start(toParse);

        Assert.assertEquals(PsTokenTypes.EXPSTRING_BEGIN, lexer.getTokenType());
        Assert.assertEquals("\"", lexer.getTokenText());

        lexer.advance();

        Assert.assertEquals(PsTokenTypes.DOLLAR, lexer.getTokenType());
        Assert.assertEquals("$", lexer.getTokenText());

        lexer.advance();

        Assert.assertEquals(PsTokenTypes.LCURLY, lexer.getTokenType());
        Assert.assertEquals("{", lexer.getTokenText());

        lexer.advance();

        Assert.assertEquals(PsTokenTypes.IDENT, lexer.getTokenType());
        Assert.assertEquals(lexer.getTokenText(), "a");

        lexer.advance();

        Assert.assertEquals(PsTokenTypes.RCURLY, lexer.getTokenType());
        Assert.assertEquals("}", lexer.getTokenText());

        lexer.advance();

        Assert.assertEquals(PsTokenTypes.EXPSTRING_END, lexer.getTokenType());
        Assert.assertEquals("\"", lexer.getTokenText());

        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testEmptyDoubleQuotedString() {
        final String toParse = "\"\"";
        lexer.start(toParse);

        Assert.assertEquals(PsTokenTypes.EXPSTRING_LITERAL, lexer.getTokenType());
        Assert.assertEquals("\"\"", lexer.getTokenText());

        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testEmptySingleQuotedString() {
        final String toParse = "\'\'";
        lexer.start(toParse);

        Assert.assertEquals(PsTokenTypes.STRING_LITERAL, lexer.getTokenType());
        Assert.assertEquals("\'\'", lexer.getTokenText());

        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testSingleQuotedStringWithWithIdentifier() {
        final String toParse = "\'$value\'";
        lexer.start(toParse);

        Assert.assertEquals(PsTokenTypes.STRING_LITERAL, lexer.getTokenType());
        Assert.assertEquals("\'$value\'", lexer.getTokenText());

        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testSingleQuotedStringWithWithIdentifierInCurlyBraces() {
        final String toParse = "\'${value}\'";
        lexer.start(toParse);

        Assert.assertEquals(PsTokenTypes.STRING_LITERAL, lexer.getTokenType());
        Assert.assertEquals("\'${value}\'", lexer.getTokenText());

        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }
}

