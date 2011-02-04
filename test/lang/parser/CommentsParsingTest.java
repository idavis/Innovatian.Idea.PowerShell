package com.innovatian.idea.powershell.test.lang.parser;

public class CommentsParsingTest extends PsParsingTestContext {
    @Override
    public String getTestDataPath() {
        return super.getTestDataPath() + "comments";
    }

    public void testSingleLineComment() throws Throwable {
        doTest();
    }

    public void testCommentAtEndOfLine() throws Throwable {
        doTest();
    }
}
