package com.innovatian.idea.powershell.lang.parser;

import com.innovatian.idea.powershell.lang.lexer.PsElementType;
import com.innovatian.idea.powershell.lang.lexer.PsTokenSets;


public interface PsElementTypes extends PsTokenSets {
    PsElementType WRONGWAY = new PsElementType("Wrong way!");
    //Branch statements
    PsElementType BREAK_STATEMENT = new PsElementType("Break statement");
    PsElementType CONTINUE_STATEMENT = new PsElementType("Continue statement");
    PsElementType RETURN_STATEMENT = new PsElementType("Return statement");
    PsElementType THROW_STATEMENT = new PsElementType("Throw statement");

    // Expression statements
    PsElementType LABELED_STATEMENT = new PsElementType("Labeled statement");
    PsElementType CALL_EXPRESSION = new PsElementType("Expression statement");
    PsElementType COMMAND_ARGUMENTS = new PsElementType("Command argument");
    PsElementType CONDITIONAL_EXPRESSION = new PsElementType("Conditional expression");
    PsElementType ELVIS_EXPRESSION = new PsElementType("Elvis expression");
    PsElementType ASSIGNMENT_EXPRESSION = new PsElementType("Assignment expression");
    PsElementType LOGICAL_OR_EXPRESSION = new PsElementType("Logical OR expression");
    PsElementType LOGICAL_AND_EXPRESSION = new PsElementType("Logical AND expression");
    PsElementType LOGICAL_OP_EXPRESSION = new PsElementType("Logical AND expression");
    PsElementType INCLUSIVE_OR_EXPRESSION = new PsElementType("Inclusive OR expression");
    PsElementType EXCLUSIVE_OR_EXPRESSION = new PsElementType("Exclusive OR expression");
    PsElementType AND_EXPRESSION = new PsElementType("AND expression");
    PsElementType REFERENCE_EXPRESSION = new PsElementType("Reference expression");

    PsElementType IF_STATEMENT = new PsElementType("if statement");
    PsElementType FOR_STATEMENT = new PsElementType("for statement");

    PsElementType WHILE_STATEMENT = new PsElementType("while statement");

    PsElementType SWITCH_STATEMENT = new PsElementType("switch statement");


    PsElementType CLOSABLE_BLOCK = new PsElementType("Closable block");
    PsElementType OPEN_BLOCK = new PsElementType("Open block");
    PsElementType PARENTHESIZED_EXPRESSION = new PsElementType("Parenthesized expression");
    PsElementType BLOCK_STATEMENT = new PsElementType("Block statement");
    PsElementType EXPSTRING = new PsElementType("PsString");
}
