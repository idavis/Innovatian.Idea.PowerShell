package com.innovatian.idea.powershell.test.lang.parser;

import com.intellij.openapi.fileTypes.FileTypeManager;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.util.io.FileUtil;
import com.intellij.openapi.util.text.StringUtil;
import com.intellij.psi.PsiFile;
import com.intellij.psi.PsiFileFactory;
import com.intellij.psi.impl.DebugUtil;
import com.intellij.util.IncorrectOperationException;
import com.intellij.util.LocalTimeCounter;
import junit.framework.Assert;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public abstract class PsParsingTestContext extends CodeInsightFixtureTestCase {
    public static final String TEMP_FILE = "temp.ps1";

    public void doTest() {
        doTest(getTestName(true).replace('$', '/') + ".test");
    }

    protected void doTest(String fileName) {
        final List<String> list = readInput(getTestDataPath() + "/" + fileName);

        final String input = list.get(0);
        final String output = list.get(1);
        checkParsing(input, output);
    }

    protected void checkParsing(String input, String output) {
        final PsiFile psiFile = createPseudoPhysicalPsFile(getProject(), input);
        String psiTree = DebugUtil.psiToString(psiFile, false);
        assertEquals(output.trim(), psiTree.trim());
    }

    public static PsiFile createPseudoPhysicalPsFile(final Project project, final String text) throws IncorrectOperationException {
        return createPseudoPhysicalFile(project, TEMP_FILE, text);
    }


    public static PsiFile createPseudoPhysicalFile(final Project project, final String fileName, final String text) throws IncorrectOperationException {
        return PsiFileFactory.getInstance(project).createFileFromText(
                fileName,
                FileTypeManager.getInstance().getFileTypeByFileName(fileName),
                text,
                LocalTimeCounter.currentTime(),
                true);
    }


    @Override
    public String getTestDataPath() {
        return PsParsingTestContext.class.getProtectionDomain().getCodeSource().getLocation().getPath() + "../../../testdata/parsing/powershell/";
    }

    public static List<String> readInput(String filePath) {
        String content;
        try {
            content = new String(FileUtil.loadFileText(new File(filePath)));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Assert.assertNotNull(content);

        List<String> input = new ArrayList<String>();

        int separatorIndex;
        content = StringUtil.replace(content, "\r", ""); // for MACs

        // Adding input  before -----
        while ((separatorIndex = content.indexOf("-----")) >= 0) {
            input.add(content.substring(0, separatorIndex - 1));
            content = content.substring(separatorIndex);
            while (StringUtil.startsWithChar(content, '-')) {
                content = content.substring(1);
            }
            if (StringUtil.startsWithChar(content, '\n')) {
                content = content.substring(1);
            }
        }
        // Result - after -----
        if (content.endsWith("\n")) {
            content = content.substring(0, content.length() - 1);
        }
        input.add(content);

        Assert.assertTrue("No data found in source file", input.size() > 0);
        Assert.assertNotNull("Test output points to null", input.size() > 1);

        return input;
    }
}
