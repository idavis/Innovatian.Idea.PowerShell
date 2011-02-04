package com.innovatian.idea.powershell.lang.parser;

import com.innovatian.idea.powershell.lang.parser.parsing.ParserUtils;
import com.intellij.lang.PsiBuilder;
import com.intellij.psi.tree.IElementType;

public class StringConstructorExpression implements PsElementTypes {

    public static IElementType parse(PsiBuilder builder, PsParser parser) {
        PsiBuilder.Marker sMarker = builder.mark();

        if (ParserUtils.getToken(builder, EXPSTRING_BEGIN)) {
            ParserUtils.getToken(builder, EXPSTRING_CONTENT);
            if (EXPSTRING_END.equals(builder.getTokenType())) {
                sMarker.rollbackTo();
                sMarker = builder.mark();
                ParserUtils.advance(builder);
                ParserUtils.advance(builder);
                ParserUtils.advance(builder);
                sMarker.done(LITERAL);
                return LITERAL;
            }

            while (ParserUtils.getToken(builder, EXPSTRING_CONTENT) || DOLLAR.equals(builder.getTokenType())) {
                if (DOLLAR.equals(builder.getTokenType())) {
                    stringConstructorValuePart(builder, parser);
                }
            }
            ParserUtils.getToken(builder, EXPSTRING_END, "string.end.expected");
            sMarker.done(EXPSTRING);
            return EXPSTRING;
        } else {
            sMarker.drop();
            return WRONGWAY;
        }
    }

    private static void stringConstructorValuePart(PsiBuilder builder, PsParser parser) {
        final PsiBuilder.Marker injection = builder.mark();
        ParserUtils.getToken(builder, DOLLAR);
        if (LCURLY.equals(builder.getTokenType())) {
            parser.parseClosableBlock(builder);
        } else if (ParserUtils.getToken(builder, IDENT)) {
            builder.advanceLexer();
        } else {
            ParserUtils.wrapError(builder, "identifier.or.block.expected");
        }
        injection.done(PSSTRING_INJECTION);
    }
}
