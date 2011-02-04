package com.innovatian.idea.powershell.test.lang.parser;

public class ExpressionParsingTest extends PsParsingTestContext {
    @Override
    public String getTestDataPath() {
        return super.getTestDataPath() + "expressions";
    }

    public void testNumberEqualsNumber() throws Throwable {
        doTest();
    }

    public void testStringEqualsString() throws Throwable {
        doTest();
    }
}
