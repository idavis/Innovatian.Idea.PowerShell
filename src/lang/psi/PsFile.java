package com.innovatian.idea.powershell.lang.psi;

import com.innovatian.idea.powershell.PsFileType;
import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.lang.ASTNode;
import com.intellij.lang.Language;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.tree.IElementType;
import com.intellij.psi.tree.IFileElementType;
import com.intellij.util.IncorrectOperationException;
import org.jetbrains.annotations.NotNull;

public class PsFile extends PsiFileBase implements PsiFile, IPsPsiElement {

    public PsFile(FileViewProvider fileViewProvider) {
        this(fileViewProvider, PsFileType.PS_LANGUAGE);
    }

    public PsFile(FileViewProvider fileViewProvider, @org.jetbrains.annotations.NotNull Language language) {
        super(fileViewProvider, language);
    }

    public PsFile(IFileElementType root, IFileElementType root1, FileViewProvider provider) {
        this(provider, root.getLanguage());
        init(root, root1);
    }

    @NotNull
    public FileType getFileType() {
        return PsFileType.PS_FILE_TYPE;
    }

    public String toString() {
        return "PowerShell script";
    }

    private static boolean hasElementType(PsiElement next, final IElementType type) {
        if (next == null) {
            return false;
        }
        final ASTNode astNode = next.getNode();
        if (astNode != null && astNode.getElementType() == type) {
            return true;
        }
        return false;
    }

    public void removeElements(PsiElement[] elements) throws IncorrectOperationException {
        for (PsiElement element : elements) {
            if (element.isValid()) {
                if (element.getParent() != this) throw new IncorrectOperationException();
                deleteChildRange(element, element);
            }
        }
    }

    public void accept(PsElementVisitor visitor) {
        visitor.visitFile(this);
    }

    public void acceptChildren(PsElementVisitor visitor) {
        PsiElement child = getFirstChild();
        while (child != null) {
            if (child instanceof PsPsiElement) {
                ((PsPsiElement) child).accept(visitor);
            }
            child = child.getNextSibling();
        }
    }
}

