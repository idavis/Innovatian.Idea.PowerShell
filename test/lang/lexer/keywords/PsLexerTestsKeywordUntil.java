package com.innovatian.idea.powershell.test.lang.lexer.keywords;

import com.innovatian.idea.powershell.lang.lexer.PsTokenTypes;
import com.innovatian.idea.powershell.test.lang.lexer.PsLexerTestContext;
import junit.framework.Assert;

public class PsLexerTestsKeywordUntil extends PsLexerTestContext {
    public void testKeyword_UNTIL() {
        String toParse = "UNTIL";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.UNTIL, lexer.getTokenType());
        Assert.assertEquals("UNTIL", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_UNTIl() {
        String toParse = "UNTIl";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.UNTIL, lexer.getTokenType());
        Assert.assertEquals("UNTIl", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_UNTiL() {
        String toParse = "UNTiL";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.UNTIL, lexer.getTokenType());
        Assert.assertEquals("UNTiL", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_UNTil() {
        String toParse = "UNTil";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.UNTIL, lexer.getTokenType());
        Assert.assertEquals("UNTil", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_UNtIL() {
        String toParse = "UNtIL";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.UNTIL, lexer.getTokenType());
        Assert.assertEquals("UNtIL", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_UNtIl() {
        String toParse = "UNtIl";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.UNTIL, lexer.getTokenType());
        Assert.assertEquals("UNtIl", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_UNtiL() {
        String toParse = "UNtiL";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.UNTIL, lexer.getTokenType());
        Assert.assertEquals("UNtiL", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_UNtil() {
        String toParse = "UNtil";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.UNTIL, lexer.getTokenType());
        Assert.assertEquals("UNtil", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_UnTIL() {
        String toParse = "UnTIL";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.UNTIL, lexer.getTokenType());
        Assert.assertEquals("UnTIL", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_UnTIl() {
        String toParse = "UnTIl";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.UNTIL, lexer.getTokenType());
        Assert.assertEquals("UnTIl", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_UnTiL() {
        String toParse = "UnTiL";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.UNTIL, lexer.getTokenType());
        Assert.assertEquals("UnTiL", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_UnTil() {
        String toParse = "UnTil";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.UNTIL, lexer.getTokenType());
        Assert.assertEquals("UnTil", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_UntIL() {
        String toParse = "UntIL";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.UNTIL, lexer.getTokenType());
        Assert.assertEquals("UntIL", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_UntIl() {
        String toParse = "UntIl";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.UNTIL, lexer.getTokenType());
        Assert.assertEquals("UntIl", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_UntiL() {
        String toParse = "UntiL";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.UNTIL, lexer.getTokenType());
        Assert.assertEquals("UntiL", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_Until() {
        String toParse = "Until";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.UNTIL, lexer.getTokenType());
        Assert.assertEquals("Until", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_uNTIL() {
        String toParse = "uNTIL";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.UNTIL, lexer.getTokenType());
        Assert.assertEquals("uNTIL", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_uNTIl() {
        String toParse = "uNTIl";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.UNTIL, lexer.getTokenType());
        Assert.assertEquals("uNTIl", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_uNTiL() {
        String toParse = "uNTiL";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.UNTIL, lexer.getTokenType());
        Assert.assertEquals("uNTiL", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_uNTil() {
        String toParse = "uNTil";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.UNTIL, lexer.getTokenType());
        Assert.assertEquals("uNTil", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_uNtIL() {
        String toParse = "uNtIL";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.UNTIL, lexer.getTokenType());
        Assert.assertEquals("uNtIL", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_uNtIl() {
        String toParse = "uNtIl";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.UNTIL, lexer.getTokenType());
        Assert.assertEquals("uNtIl", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_uNtiL() {
        String toParse = "uNtiL";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.UNTIL, lexer.getTokenType());
        Assert.assertEquals("uNtiL", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_uNtil() {
        String toParse = "uNtil";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.UNTIL, lexer.getTokenType());
        Assert.assertEquals("uNtil", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_unTIL() {
        String toParse = "unTIL";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.UNTIL, lexer.getTokenType());
        Assert.assertEquals("unTIL", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_unTIl() {
        String toParse = "unTIl";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.UNTIL, lexer.getTokenType());
        Assert.assertEquals("unTIl", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_unTiL() {
        String toParse = "unTiL";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.UNTIL, lexer.getTokenType());
        Assert.assertEquals("unTiL", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_unTil() {
        String toParse = "unTil";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.UNTIL, lexer.getTokenType());
        Assert.assertEquals("unTil", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_untIL() {
        String toParse = "untIL";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.UNTIL, lexer.getTokenType());
        Assert.assertEquals("untIL", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_untIl() {
        String toParse = "untIl";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.UNTIL, lexer.getTokenType());
        Assert.assertEquals("untIl", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_untiL() {
        String toParse = "untiL";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.UNTIL, lexer.getTokenType());
        Assert.assertEquals("untiL", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_until() {
        String toParse = "until";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.UNTIL, lexer.getTokenType());
        Assert.assertEquals("until", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

}
