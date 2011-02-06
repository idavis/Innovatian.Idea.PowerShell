package com.innovatian.idea.powershell.lang.parser.parsing;

import com.intellij.lang.PsiBuilder;
import com.intellij.psi.tree.IElementType;
import com.intellij.psi.tree.TokenSet;

public abstract class ParserUtils {

    public static boolean getToken(PsiBuilder builder, IElementType elem, String errorMsg) {
        if (elem.equals(builder.getTokenType())) {
            builder.advanceLexer();
            return true;
        } else {
            if (errorMsg != null)
                builder.error(errorMsg);
            return false;
        }
    }

    public static boolean getToken(PsiBuilder builder, IElementType elem) {
        final IElementType tokenType = builder.getTokenType();
        if (elem.equals(tokenType)) {
            builder.advanceLexer();
            return true;
        }
        return false;
    }

    public static boolean getToken(PsiBuilder builder, TokenSet tokenSet) {
        if (tokenSet.contains(builder.getTokenType())) {
            return getToken(builder, builder.getTokenType(), null);
        }
        return false;
    }

    public static boolean getToken(PsiBuilder builder, TokenSet tokenSet, String msg) {
        if (tokenSet.contains(builder.getTokenType())) {
            return getToken(builder, builder.getTokenType(), msg);
        }
        return false;
    }

    public static boolean lookAhead(PsiBuilder builder, IElementType... elems) {
        if (!elems[0].equals(builder.getTokenType())) return false;

        if (elems.length == 1) return true;

        PsiBuilder.Marker rb = builder.mark();
        builder.advanceLexer();
        int i = 1;
        while (!builder.eof() && i < elems.length && elems[i].equals(builder.getTokenType())) {
            builder.advanceLexer();
            i++;
        }
        rb.rollbackTo();
        return i == elems.length;
    }

    public static boolean lookAhead(PsiBuilder builder, boolean dropMarker, IElementType... elems) {

        if (elems.length == 0) {
            return false;
        }

        if (elems.length == 1) {
            return elems[0].equals(builder.getTokenType());
        }

        PsiBuilder.Marker rb = builder.mark();
        int i = 0;
        while (!builder.eof() && i < elems.length && elems[i].equals(builder.getTokenType())) {
            builder.advanceLexer();
            i++;
        }
        if (dropMarker && i == elems.length) {
            rb.drop();
        } else {
            rb.rollbackTo();
        }
        return i == elems.length;
    }

    public static IElementType eatElement(PsiBuilder builder, IElementType elem) {
        PsiBuilder.Marker marker = builder.mark();
        builder.advanceLexer();
        marker.done(elem);
        return elem;
    }

    public static void wrapError(PsiBuilder builder, String msg) {
        PsiBuilder.Marker marker = builder.mark();
        builder.advanceLexer();
        marker.error(msg);
    }

    public static void advance(PsiBuilder builder, int count) {
        for (int i = 0; i < count; i++) {
            builder.getTokenText();
            builder.advanceLexer();
        }
    }

    public static void advance(PsiBuilder builder) {
        advance(builder, 1);
    }

}
