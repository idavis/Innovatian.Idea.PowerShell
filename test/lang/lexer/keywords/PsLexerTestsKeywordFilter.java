package com.innovatian.idea.powershell.test.lang.lexer.keywords;

import com.innovatian.idea.powershell.lang.lexer.PsTokenTypes;
import com.innovatian.idea.powershell.test.lang.lexer.PsLexerTestContext;
import junit.framework.Assert;

public class PsLexerTestsKeywordFilter extends PsLexerTestContext {
    public void testKeyword_FILTER() {
        String toParse = "FILTER";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FILTER, lexer.getTokenType());
        Assert.assertEquals("FILTER", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_FILTEr() {
        String toParse = "FILTEr";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FILTER, lexer.getTokenType());
        Assert.assertEquals("FILTEr", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_FILTeR() {
        String toParse = "FILTeR";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FILTER, lexer.getTokenType());
        Assert.assertEquals("FILTeR", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_FILTer() {
        String toParse = "FILTer";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FILTER, lexer.getTokenType());
        Assert.assertEquals("FILTer", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_FILtER() {
        String toParse = "FILtER";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FILTER, lexer.getTokenType());
        Assert.assertEquals("FILtER", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_FILtEr() {
        String toParse = "FILtEr";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FILTER, lexer.getTokenType());
        Assert.assertEquals("FILtEr", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_FILteR() {
        String toParse = "FILteR";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FILTER, lexer.getTokenType());
        Assert.assertEquals("FILteR", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_FILter() {
        String toParse = "FILter";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FILTER, lexer.getTokenType());
        Assert.assertEquals("FILter", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_FIlTER() {
        String toParse = "FIlTER";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FILTER, lexer.getTokenType());
        Assert.assertEquals("FIlTER", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_FIlTEr() {
        String toParse = "FIlTEr";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FILTER, lexer.getTokenType());
        Assert.assertEquals("FIlTEr", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_FIlTeR() {
        String toParse = "FIlTeR";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FILTER, lexer.getTokenType());
        Assert.assertEquals("FIlTeR", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_FIlTer() {
        String toParse = "FIlTer";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FILTER, lexer.getTokenType());
        Assert.assertEquals("FIlTer", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_FIltER() {
        String toParse = "FIltER";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FILTER, lexer.getTokenType());
        Assert.assertEquals("FIltER", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_FIltEr() {
        String toParse = "FIltEr";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FILTER, lexer.getTokenType());
        Assert.assertEquals("FIltEr", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_FIlteR() {
        String toParse = "FIlteR";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FILTER, lexer.getTokenType());
        Assert.assertEquals("FIlteR", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_FIlter() {
        String toParse = "FIlter";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FILTER, lexer.getTokenType());
        Assert.assertEquals("FIlter", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_FiLTER() {
        String toParse = "FiLTER";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FILTER, lexer.getTokenType());
        Assert.assertEquals("FiLTER", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_FiLTEr() {
        String toParse = "FiLTEr";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FILTER, lexer.getTokenType());
        Assert.assertEquals("FiLTEr", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_FiLTeR() {
        String toParse = "FiLTeR";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FILTER, lexer.getTokenType());
        Assert.assertEquals("FiLTeR", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_FiLTer() {
        String toParse = "FiLTer";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FILTER, lexer.getTokenType());
        Assert.assertEquals("FiLTer", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_FiLtER() {
        String toParse = "FiLtER";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FILTER, lexer.getTokenType());
        Assert.assertEquals("FiLtER", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_FiLtEr() {
        String toParse = "FiLtEr";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FILTER, lexer.getTokenType());
        Assert.assertEquals("FiLtEr", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_FiLteR() {
        String toParse = "FiLteR";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FILTER, lexer.getTokenType());
        Assert.assertEquals("FiLteR", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_FiLter() {
        String toParse = "FiLter";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FILTER, lexer.getTokenType());
        Assert.assertEquals("FiLter", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_FilTER() {
        String toParse = "FilTER";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FILTER, lexer.getTokenType());
        Assert.assertEquals("FilTER", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_FilTEr() {
        String toParse = "FilTEr";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FILTER, lexer.getTokenType());
        Assert.assertEquals("FilTEr", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_FilTeR() {
        String toParse = "FilTeR";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FILTER, lexer.getTokenType());
        Assert.assertEquals("FilTeR", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_FilTer() {
        String toParse = "FilTer";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FILTER, lexer.getTokenType());
        Assert.assertEquals("FilTer", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_FiltER() {
        String toParse = "FiltER";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FILTER, lexer.getTokenType());
        Assert.assertEquals("FiltER", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_FiltEr() {
        String toParse = "FiltEr";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FILTER, lexer.getTokenType());
        Assert.assertEquals("FiltEr", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_FilteR() {
        String toParse = "FilteR";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FILTER, lexer.getTokenType());
        Assert.assertEquals("FilteR", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_Filter() {
        String toParse = "Filter";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FILTER, lexer.getTokenType());
        Assert.assertEquals("Filter", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_fILTER() {
        String toParse = "fILTER";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FILTER, lexer.getTokenType());
        Assert.assertEquals("fILTER", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_fILTEr() {
        String toParse = "fILTEr";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FILTER, lexer.getTokenType());
        Assert.assertEquals("fILTEr", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_fILTeR() {
        String toParse = "fILTeR";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FILTER, lexer.getTokenType());
        Assert.assertEquals("fILTeR", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_fILTer() {
        String toParse = "fILTer";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FILTER, lexer.getTokenType());
        Assert.assertEquals("fILTer", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_fILtER() {
        String toParse = "fILtER";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FILTER, lexer.getTokenType());
        Assert.assertEquals("fILtER", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_fILtEr() {
        String toParse = "fILtEr";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FILTER, lexer.getTokenType());
        Assert.assertEquals("fILtEr", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_fILteR() {
        String toParse = "fILteR";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FILTER, lexer.getTokenType());
        Assert.assertEquals("fILteR", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_fILter() {
        String toParse = "fILter";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FILTER, lexer.getTokenType());
        Assert.assertEquals("fILter", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_fIlTER() {
        String toParse = "fIlTER";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FILTER, lexer.getTokenType());
        Assert.assertEquals("fIlTER", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_fIlTEr() {
        String toParse = "fIlTEr";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FILTER, lexer.getTokenType());
        Assert.assertEquals("fIlTEr", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_fIlTeR() {
        String toParse = "fIlTeR";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FILTER, lexer.getTokenType());
        Assert.assertEquals("fIlTeR", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_fIlTer() {
        String toParse = "fIlTer";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FILTER, lexer.getTokenType());
        Assert.assertEquals("fIlTer", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_fIltER() {
        String toParse = "fIltER";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FILTER, lexer.getTokenType());
        Assert.assertEquals("fIltER", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_fIltEr() {
        String toParse = "fIltEr";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FILTER, lexer.getTokenType());
        Assert.assertEquals("fIltEr", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_fIlteR() {
        String toParse = "fIlteR";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FILTER, lexer.getTokenType());
        Assert.assertEquals("fIlteR", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_fIlter() {
        String toParse = "fIlter";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FILTER, lexer.getTokenType());
        Assert.assertEquals("fIlter", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_fiLTER() {
        String toParse = "fiLTER";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FILTER, lexer.getTokenType());
        Assert.assertEquals("fiLTER", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_fiLTEr() {
        String toParse = "fiLTEr";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FILTER, lexer.getTokenType());
        Assert.assertEquals("fiLTEr", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_fiLTeR() {
        String toParse = "fiLTeR";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FILTER, lexer.getTokenType());
        Assert.assertEquals("fiLTeR", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_fiLTer() {
        String toParse = "fiLTer";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FILTER, lexer.getTokenType());
        Assert.assertEquals("fiLTer", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_fiLtER() {
        String toParse = "fiLtER";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FILTER, lexer.getTokenType());
        Assert.assertEquals("fiLtER", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_fiLtEr() {
        String toParse = "fiLtEr";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FILTER, lexer.getTokenType());
        Assert.assertEquals("fiLtEr", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_fiLteR() {
        String toParse = "fiLteR";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FILTER, lexer.getTokenType());
        Assert.assertEquals("fiLteR", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_fiLter() {
        String toParse = "fiLter";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FILTER, lexer.getTokenType());
        Assert.assertEquals("fiLter", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_filTER() {
        String toParse = "filTER";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FILTER, lexer.getTokenType());
        Assert.assertEquals("filTER", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_filTEr() {
        String toParse = "filTEr";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FILTER, lexer.getTokenType());
        Assert.assertEquals("filTEr", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_filTeR() {
        String toParse = "filTeR";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FILTER, lexer.getTokenType());
        Assert.assertEquals("filTeR", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_filTer() {
        String toParse = "filTer";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FILTER, lexer.getTokenType());
        Assert.assertEquals("filTer", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_filtER() {
        String toParse = "filtER";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FILTER, lexer.getTokenType());
        Assert.assertEquals("filtER", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_filtEr() {
        String toParse = "filtEr";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FILTER, lexer.getTokenType());
        Assert.assertEquals("filtEr", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_filteR() {
        String toParse = "filteR";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FILTER, lexer.getTokenType());
        Assert.assertEquals("filteR", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

    public void testKeyword_filter() {
        String toParse = "filter";
        lexer.start(toParse);
        Assert.assertEquals(PsTokenTypes.FILTER, lexer.getTokenType());
        Assert.assertEquals("filter", lexer.getTokenText());
        lexer.advance();
        Assert.assertNull(lexer.getTokenType());
    }

}
