package com.innovatian.idea.powershell.lang.parser;

import com.innovatian.idea.powershell.PsFileType;
import com.innovatian.idea.powershell.lang.lexer.PsLexer;
import com.innovatian.idea.powershell.lang.lexer.PsTokenSets;
import com.innovatian.idea.powershell.lang.psi.PsFile;
import com.intellij.lang.ASTNode;
import com.intellij.lang.ParserDefinition;
import com.intellij.lang.PsiParser;
import com.intellij.lexer.Lexer;
import com.intellij.openapi.project.Project;
import com.intellij.psi.FileViewProvider;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.tree.IFileElementType;
import com.intellij.psi.tree.IStubFileElementType;
import com.intellij.psi.tree.TokenSet;
import org.jetbrains.annotations.NotNull;


public class PsParserDefinition implements ParserDefinition {
    public static final IStubFileElementType PS_FILE = new PsStubFileElementType(PsFileType.PS_FILE_TYPE.getLanguage());

    @NotNull
    public Lexer createLexer(Project project) {
        return new PsLexer();
    }

    public PsiParser createParser(Project project) {
        return new PsParser();
    }

    public IFileElementType getFileNodeType() {
        return PS_FILE;
    }

    @NotNull
    public TokenSet getWhitespaceTokens() {
        return PsTokenSets.WHITE_SPACES_SET;
    }

    @NotNull
    public TokenSet getCommentTokens() {
        return PsTokenSets.COMMENT_SET;
    }

    @NotNull
    public TokenSet getStringLiteralElements() {
        return PsTokenSets.LITERALS_SET;
    }

    @NotNull
    public PsiElement createElement(ASTNode node) {
        return PsPsiCreator.createElement(node);
    }

    public PsiFile createFile(FileViewProvider viewProvider) {
        return new PsFile(viewProvider);
    }

    public SpaceRequirements spaceExistanceTypeBetweenTokens(ASTNode left, ASTNode right) {
        return SpaceRequirements.MAY;
    }
}
