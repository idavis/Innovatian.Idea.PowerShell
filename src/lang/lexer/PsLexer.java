package com.innovatian.idea.powershell.lang.lexer;

import com.intellij.lexer.LookAheadLexer;
import com.intellij.lexer.MergingLexerAdapter;

public class PsLexer extends LookAheadLexer {
    public PsLexer() {
        super(new MergingLexerAdapter(new PsFlexLexer(), PsTokenSets.COMMENT_SET));
    }

/*  @Override
  protected void lookAhead(Lexer baseLexer) {
      super.lookAhead(baseLexer);
  }
*/
}
