package com.innovatian.idea.powershell.test.lang.lexer.keywords;

import com.innovatian.idea.powershell.lang.lexer.PsTokenTypes;
import com.innovatian.idea.powershell.test.lang.lexer.PsLexerTestContext;
import junit.framework.Assert;

public class PsLexerTestsKeywordElseif extends PsLexerTestContext {
    public void testKeyword_ELSEIF() {
        String toParse = "ELSEIF";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.ELSEIF, lexer.getTokenType());
        Assert.assertEquals("ELSEIF", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_ELSEIf() {
        String toParse = "ELSEIf";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.ELSEIF, lexer.getTokenType());
        Assert.assertEquals("ELSEIf", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_ELSEiF() {
        String toParse = "ELSEiF";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.ELSEIF, lexer.getTokenType());
        Assert.assertEquals("ELSEiF", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_ELSEif() {
        String toParse = "ELSEif";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.ELSEIF, lexer.getTokenType());
        Assert.assertEquals("ELSEif", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_ELSeIF() {
        String toParse = "ELSeIF";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.ELSEIF, lexer.getTokenType());
        Assert.assertEquals("ELSeIF", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_ELSeIf() {
        String toParse = "ELSeIf";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.ELSEIF, lexer.getTokenType());
        Assert.assertEquals("ELSeIf", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_ELSeiF() {
        String toParse = "ELSeiF";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.ELSEIF, lexer.getTokenType());
        Assert.assertEquals("ELSeiF", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_ELSeif() {
        String toParse = "ELSeif";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.ELSEIF, lexer.getTokenType());
        Assert.assertEquals("ELSeif", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_ELsEIF() {
        String toParse = "ELsEIF";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.ELSEIF, lexer.getTokenType());
        Assert.assertEquals("ELsEIF", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_ELsEIf() {
        String toParse = "ELsEIf";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.ELSEIF, lexer.getTokenType());
        Assert.assertEquals("ELsEIf", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_ELsEiF() {
        String toParse = "ELsEiF";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.ELSEIF, lexer.getTokenType());
        Assert.assertEquals("ELsEiF", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_ELsEif() {
        String toParse = "ELsEif";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.ELSEIF, lexer.getTokenType());
        Assert.assertEquals("ELsEif", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_ELseIF() {
        String toParse = "ELseIF";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.ELSEIF, lexer.getTokenType());
        Assert.assertEquals("ELseIF", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_ELseIf() {
        String toParse = "ELseIf";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.ELSEIF, lexer.getTokenType());
        Assert.assertEquals("ELseIf", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_ELseiF() {
        String toParse = "ELseiF";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.ELSEIF, lexer.getTokenType());
        Assert.assertEquals("ELseiF", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_ELseif() {
        String toParse = "ELseif";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.ELSEIF, lexer.getTokenType());
        Assert.assertEquals("ELseif", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_ElSEIF() {
        String toParse = "ElSEIF";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.ELSEIF, lexer.getTokenType());
        Assert.assertEquals("ElSEIF", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_ElSEIf() {
        String toParse = "ElSEIf";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.ELSEIF, lexer.getTokenType());
        Assert.assertEquals("ElSEIf", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_ElSEiF() {
        String toParse = "ElSEiF";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.ELSEIF, lexer.getTokenType());
        Assert.assertEquals("ElSEiF", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_ElSEif() {
        String toParse = "ElSEif";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.ELSEIF, lexer.getTokenType());
        Assert.assertEquals("ElSEif", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_ElSeIF() {
        String toParse = "ElSeIF";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.ELSEIF, lexer.getTokenType());
        Assert.assertEquals("ElSeIF", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_ElSeIf() {
        String toParse = "ElSeIf";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.ELSEIF, lexer.getTokenType());
        Assert.assertEquals("ElSeIf", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_ElSeiF() {
        String toParse = "ElSeiF";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.ELSEIF, lexer.getTokenType());
        Assert.assertEquals("ElSeiF", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_ElSeif() {
        String toParse = "ElSeif";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.ELSEIF, lexer.getTokenType());
        Assert.assertEquals("ElSeif", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_ElsEIF() {
        String toParse = "ElsEIF";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.ELSEIF, lexer.getTokenType());
        Assert.assertEquals("ElsEIF", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_ElsEIf() {
        String toParse = "ElsEIf";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.ELSEIF, lexer.getTokenType());
        Assert.assertEquals("ElsEIf", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_ElsEiF() {
        String toParse = "ElsEiF";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.ELSEIF, lexer.getTokenType());
        Assert.assertEquals("ElsEiF", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_ElsEif() {
        String toParse = "ElsEif";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.ELSEIF, lexer.getTokenType());
        Assert.assertEquals("ElsEif", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_ElseIF() {
        String toParse = "ElseIF";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.ELSEIF, lexer.getTokenType());
        Assert.assertEquals("ElseIF", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_ElseIf() {
        String toParse = "ElseIf";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.ELSEIF, lexer.getTokenType());
        Assert.assertEquals("ElseIf", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_ElseiF() {
        String toParse = "ElseiF";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.ELSEIF, lexer.getTokenType());
        Assert.assertEquals("ElseiF", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_Elseif() {
        String toParse = "Elseif";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.ELSEIF, lexer.getTokenType());
        Assert.assertEquals("Elseif", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_eLSEIF() {
        String toParse = "eLSEIF";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.ELSEIF, lexer.getTokenType());
        Assert.assertEquals("eLSEIF", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_eLSEIf() {
        String toParse = "eLSEIf";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.ELSEIF, lexer.getTokenType());
        Assert.assertEquals("eLSEIf", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_eLSEiF() {
        String toParse = "eLSEiF";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.ELSEIF, lexer.getTokenType());
        Assert.assertEquals("eLSEiF", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_eLSEif() {
        String toParse = "eLSEif";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.ELSEIF, lexer.getTokenType());
        Assert.assertEquals("eLSEif", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_eLSeIF() {
        String toParse = "eLSeIF";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.ELSEIF, lexer.getTokenType());
        Assert.assertEquals("eLSeIF", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_eLSeIf() {
        String toParse = "eLSeIf";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.ELSEIF, lexer.getTokenType());
        Assert.assertEquals("eLSeIf", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_eLSeiF() {
        String toParse = "eLSeiF";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.ELSEIF, lexer.getTokenType());
        Assert.assertEquals("eLSeiF", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_eLSeif() {
        String toParse = "eLSeif";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.ELSEIF, lexer.getTokenType());
        Assert.assertEquals("eLSeif", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_eLsEIF() {
        String toParse = "eLsEIF";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.ELSEIF, lexer.getTokenType());
        Assert.assertEquals("eLsEIF", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_eLsEIf() {
        String toParse = "eLsEIf";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.ELSEIF, lexer.getTokenType());
        Assert.assertEquals("eLsEIf", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_eLsEiF() {
        String toParse = "eLsEiF";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.ELSEIF, lexer.getTokenType());
        Assert.assertEquals("eLsEiF", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_eLsEif() {
        String toParse = "eLsEif";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.ELSEIF, lexer.getTokenType());
        Assert.assertEquals("eLsEif", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_eLseIF() {
        String toParse = "eLseIF";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.ELSEIF, lexer.getTokenType());
        Assert.assertEquals("eLseIF", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_eLseIf() {
        String toParse = "eLseIf";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.ELSEIF, lexer.getTokenType());
        Assert.assertEquals("eLseIf", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_eLseiF() {
        String toParse = "eLseiF";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.ELSEIF, lexer.getTokenType());
        Assert.assertEquals("eLseiF", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_eLseif() {
        String toParse = "eLseif";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.ELSEIF, lexer.getTokenType());
        Assert.assertEquals("eLseif", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_elSEIF() {
        String toParse = "elSEIF";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.ELSEIF, lexer.getTokenType());
        Assert.assertEquals("elSEIF", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_elSEIf() {
        String toParse = "elSEIf";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.ELSEIF, lexer.getTokenType());
        Assert.assertEquals("elSEIf", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_elSEiF() {
        String toParse = "elSEiF";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.ELSEIF, lexer.getTokenType());
        Assert.assertEquals("elSEiF", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_elSEif() {
        String toParse = "elSEif";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.ELSEIF, lexer.getTokenType());
        Assert.assertEquals("elSEif", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_elSeIF() {
        String toParse = "elSeIF";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.ELSEIF, lexer.getTokenType());
        Assert.assertEquals("elSeIF", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_elSeIf() {
        String toParse = "elSeIf";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.ELSEIF, lexer.getTokenType());
        Assert.assertEquals("elSeIf", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_elSeiF() {
        String toParse = "elSeiF";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.ELSEIF, lexer.getTokenType());
        Assert.assertEquals("elSeiF", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_elSeif() {
        String toParse = "elSeif";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.ELSEIF, lexer.getTokenType());
        Assert.assertEquals("elSeif", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_elsEIF() {
        String toParse = "elsEIF";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.ELSEIF, lexer.getTokenType());
        Assert.assertEquals("elsEIF", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_elsEIf() {
        String toParse = "elsEIf";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.ELSEIF, lexer.getTokenType());
        Assert.assertEquals("elsEIf", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_elsEiF() {
        String toParse = "elsEiF";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.ELSEIF, lexer.getTokenType());
        Assert.assertEquals("elsEiF", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_elsEif() {
        String toParse = "elsEif";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.ELSEIF, lexer.getTokenType());
        Assert.assertEquals("elsEif", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_elseIF() {
        String toParse = "elseIF";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.ELSEIF, lexer.getTokenType());
        Assert.assertEquals("elseIF", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_elseIf() {
        String toParse = "elseIf";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.ELSEIF, lexer.getTokenType());
        Assert.assertEquals("elseIf", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_elseiF() {
        String toParse = "elseiF";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.ELSEIF, lexer.getTokenType());
        Assert.assertEquals("elseiF", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_elseif() {
        String toParse = "elseif";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.ELSEIF, lexer.getTokenType());
        Assert.assertEquals("elseif", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

}
