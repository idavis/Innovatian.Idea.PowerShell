package com.innovatian.idea.powershell.highlighter;

import com.innovatian.idea.powershell.lang.lexer.PsLexer;
import com.innovatian.idea.powershell.lang.lexer.PsTokenSets;
import com.innovatian.idea.powershell.lang.lexer.PsTokenTypes;
import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase;
import com.intellij.psi.tree.IElementType;
import com.intellij.psi.tree.TokenSet;
import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Map;

public class PsSyntaxHighlighter extends SyntaxHighlighterBase implements PsTokenTypes {

    private static final Map<IElementType, TextAttributesKey> ATTRIBUTES = new HashMap<IElementType, TextAttributesKey>();


    static final TokenSet tBLOCK_COMMENTS = TokenSet.create(
            ML_COMMENT
    );

    static final TokenSet tNUMBERS = TokenSet.create(
            NUMBER
    );

    static final TokenSet tLINE_COMMENTS = TokenSet.create(
            SL_COMMENT
    );

    static final TokenSet tBAD_CHARACTERS = TokenSet.create(
            WRONG
    );


    static final TokenSet tEXPSTRINGS = TokenSet.create(
            EXPSTRING_BEGIN,
            EXPSTRING_CONTENT,
            EXPSTRING_END,
            EXPSTRING_LITERAL
    );

    static final TokenSet tSTRINGS = TokenSet.create(
            STRING_LITERAL
    );


    static final TokenSet tBRACES = TokenSet.create(
            LCURLY,
            RCURLY
    );
    static final TokenSet tPARENTHESES = TokenSet.create(
            LPAREN,
            RPAREN
    );
    static final TokenSet tBRACKETS = TokenSet.create(
            LBRACK,
            RBRACK
    );

    static {
        fillMap(ATTRIBUTES, tLINE_COMMENTS, DefaultHighlighter.LINE_COMMENT);
        fillMap(ATTRIBUTES, tBLOCK_COMMENTS, DefaultHighlighter.BLOCK_COMMENT);
        fillMap(ATTRIBUTES, tBAD_CHARACTERS, DefaultHighlighter.BAD_CHARACTER);
        fillMap(ATTRIBUTES, PsTokenSets.KEYWORDS, DefaultHighlighter.KEYWORD);
        fillMap(ATTRIBUTES, PsTokenSets.COMPARISONOPS, DefaultHighlighter.KEYWORD);
        fillMap(ATTRIBUTES, tNUMBERS, DefaultHighlighter.NUMBER);
        fillMap(ATTRIBUTES, tEXPSTRINGS, DefaultHighlighter.GSTRING);
        fillMap(ATTRIBUTES, tSTRINGS, DefaultHighlighter.STRING);
        fillMap(ATTRIBUTES, tBRACES, DefaultHighlighter.BRACES);
        fillMap(ATTRIBUTES, tBRACKETS, DefaultHighlighter.BRACKETS);
        fillMap(ATTRIBUTES, tPARENTHESES, DefaultHighlighter.PARENTHESES);
    }

    @NotNull
    public Lexer getHighlightingLexer() {
        return new PsLexer();
    }

    @NotNull
    public TextAttributesKey[] getTokenHighlights(IElementType tokenType) {
        return pack(ATTRIBUTES.get(tokenType));
    }
}
