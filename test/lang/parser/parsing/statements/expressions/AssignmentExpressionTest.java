package com.innovatian.idea.powershell.test.lang.parser.parsing.statements.expressions;

import com.innovatian.idea.powershell.test.lang.parser.PsParsingTestContext;


public class AssignmentExpressionTest extends PsParsingTestContext {
    @Override
    public String getTestDataPath() {
        return super.getTestDataPath() + "statements/assgnstmt";
    }

    public void testassgn1() throws Throwable {
        doTest();
    }

    public void testassgn2() throws Throwable {
        doTest();
    }
}
