package com.innovatian.idea.powershell.test.lang.lexer.keywords;

import com.innovatian.idea.powershell.lang.lexer.PsTokenTypes;
import com.innovatian.idea.powershell.test.lang.lexer.PsLexerTestContext;
import junit.framework.Assert;

public class PsLexerTestsKeywordFor extends PsLexerTestContext {
    public void testKeyword_FOR() {
        String toParse = "FOR";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FOR, lexer.getTokenType());
        Assert.assertEquals("FOR", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_FOr() {
        String toParse = "FOr";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FOR, lexer.getTokenType());
        Assert.assertEquals("FOr", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_FoR() {
        String toParse = "FoR";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FOR, lexer.getTokenType());
        Assert.assertEquals("FoR", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_For() {
        String toParse = "For";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FOR, lexer.getTokenType());
        Assert.assertEquals("For", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_fOR() {
        String toParse = "fOR";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FOR, lexer.getTokenType());
        Assert.assertEquals("fOR", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_fOr() {
        String toParse = "fOr";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FOR, lexer.getTokenType());
        Assert.assertEquals("fOr", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_foR() {
        String toParse = "foR";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FOR, lexer.getTokenType());
        Assert.assertEquals("foR", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_for() {
        String toParse = "for";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FOR, lexer.getTokenType());
        Assert.assertEquals("for", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

}
