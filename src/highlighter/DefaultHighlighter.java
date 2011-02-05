package com.innovatian.idea.powershell.highlighter;

import com.intellij.codeInsight.daemon.impl.HighlightInfoType;
import com.intellij.openapi.editor.HighlighterColors;
import com.intellij.openapi.editor.SyntaxHighlighterColors;
import com.intellij.openapi.editor.colors.CodeInsightColors;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.editor.markup.EffectType;
import com.intellij.openapi.editor.markup.TextAttributes;
import org.jetbrains.annotations.NonNls;

import java.awt.*;

public class DefaultHighlighter {

  @NonNls
  static final String LINE_COMMENT_ID = "Line comment";
  @NonNls
  static final String BLOCK_COMMENT_ID = "Block comment";
  @NonNls
  static final String DOC_COMMENT_ID = "Groovydoc comment";
  @NonNls
  static final String DOC_COMMENT_TAG_ID = "Groovydoc tag";
  @NonNls
  static final String KEYWORD_ID = "Keyword";
  @NonNls
  static final String NUMBER_ID = "Number";
  @NonNls
  static final String GSTRING_ID = "GString";
  @NonNls
  static final String STRING_ID = "String";
  @NonNls
  static final String REGEXP_ID = "Regular expression";
  @NonNls
  static final String BRACES_ID = "Braces";
  @NonNls
  static final String BRACKETS_ID = "Brackets";
  @NonNls
  static final String PARENTHESES_ID = "Parentheses";

  @NonNls
  static final String OPERATION_SIGN_ID = "Operation sign";
  @NonNls
  static final String BAD_CHARACTER_ID = "Bad character";
  @NonNls
  static final String WRONG_STRING_ID = "Wrong string literal";

  @NonNls
  static final String ANNOTATION_ID = "Annotation";
  @NonNls
  static final String INSTANCE_FIELD_ID = "Instance field";
  @NonNls
  static final String STATIC_FIELD_ID = "Static field";
  @NonNls
  static final String METHOD_CALL_ID = "Method call";
  @NonNls
  static final String STATIC_METHOD_ACCESS_ID = "Static method access";
  @NonNls
  static final String CLASS_REFERENCE_ID = "Class";

  @NonNls
  static final String MAP_KEY_ID = "Map key";

  @NonNls
  static final String UNRESOLVED_ACCESS_ID = "Unresolved reference access";
  static final String LITERAL_CONVERSION_ID = "List/map to object conversion";


  public static TextAttributesKey LINE_COMMENT = TextAttributesKey.createTextAttributesKey(LINE_COMMENT_ID,
      SyntaxHighlighterColors.LINE_COMMENT.getDefaultAttributes());

  public static TextAttributesKey ANNOTATION = TextAttributesKey.createTextAttributesKey(ANNOTATION_ID,
      HighlightInfoType.ANNOTATION_NAME.getAttributesKey().getDefaultAttributes());

  public static TextAttributesKey INSTANCE_FIELD = TextAttributesKey.createTextAttributesKey(INSTANCE_FIELD_ID,
      HighlightInfoType.INSTANCE_FIELD.getAttributesKey().getDefaultAttributes());

  public static TextAttributesKey METHOD_CALL = TextAttributesKey.createTextAttributesKey(METHOD_CALL_ID,
      HighlightInfoType.METHOD_CALL.getAttributesKey().getDefaultAttributes());

  public static TextAttributesKey STATIC_FIELD = TextAttributesKey.createTextAttributesKey(STATIC_FIELD_ID,
      HighlightInfoType.STATIC_FIELD.getAttributesKey().getDefaultAttributes());

  public static TextAttributesKey STATIC_METHOD_ACCESS = TextAttributesKey.createTextAttributesKey(STATIC_METHOD_ACCESS_ID,
      HighlightInfoType.STATIC_METHOD.getAttributesKey().getDefaultAttributes());

  public static TextAttributesKey BLOCK_COMMENT = TextAttributesKey.createTextAttributesKey(BLOCK_COMMENT_ID,
      SyntaxHighlighterColors.JAVA_BLOCK_COMMENT.getDefaultAttributes());

  public static TextAttributesKey DOC_COMMENT_CONTENT = TextAttributesKey.createTextAttributesKey(DOC_COMMENT_ID,
      SyntaxHighlighterColors.DOC_COMMENT.getDefaultAttributes());

  public static TextAttributesKey DOC_COMMENT_TAG = TextAttributesKey.createTextAttributesKey(DOC_COMMENT_TAG_ID,
      SyntaxHighlighterColors.DOC_COMMENT_TAG.getDefaultAttributes());

  public static TextAttributesKey CLASS_REFERENCE =
    TextAttributesKey.createTextAttributesKey(CLASS_REFERENCE_ID, HighlighterColors.TEXT.getDefaultAttributes().clone());

  public static final TextAttributes KEYWORD_ATTRIBUTES = SyntaxHighlighterColors.KEYWORD.getDefaultAttributes().clone();
  static{

    KEYWORD_ATTRIBUTES.setForegroundColor(new Color(0, 0, 67));
    KEYWORD_ATTRIBUTES.setFontType(Font.BOLD);
  }

  public static TextAttributesKey KEYWORD = TextAttributesKey.createTextAttributesKey(KEYWORD_ID, KEYWORD_ATTRIBUTES);

  public static TextAttributesKey NUMBER = TextAttributesKey.createTextAttributesKey(NUMBER_ID,
      SyntaxHighlighterColors.NUMBER.getDefaultAttributes());

  public static TextAttributesKey GSTRING = TextAttributesKey.createTextAttributesKey(GSTRING_ID,
      SyntaxHighlighterColors.STRING.getDefaultAttributes());

  public static TextAttributesKey STRING = TextAttributesKey.createTextAttributesKey(STRING_ID,
      SyntaxHighlighterColors.STRING.getDefaultAttributes());

  public static TextAttributesKey REGEXP = TextAttributesKey.createTextAttributesKey(REGEXP_ID,
      SyntaxHighlighterColors.VALID_STRING_ESCAPE.getDefaultAttributes());

  public static TextAttributesKey BRACES = TextAttributesKey.createTextAttributesKey(BRACES_ID,
      SyntaxHighlighterColors.BRACES.getDefaultAttributes());

  public static TextAttributesKey BRACKETS = TextAttributesKey.createTextAttributesKey(BRACKETS_ID,
      SyntaxHighlighterColors.BRACKETS.getDefaultAttributes());

  public static TextAttributesKey PARENTHESES = TextAttributesKey.createTextAttributesKey(PARENTHESES_ID,
       SyntaxHighlighterColors.PARENTHS.getDefaultAttributes());

  public static TextAttributesKey OPERATION_SIGN = TextAttributesKey.createTextAttributesKey(OPERATION_SIGN_ID,
      SyntaxHighlighterColors.OPERATION_SIGN.getDefaultAttributes());

  public static TextAttributesKey BAD_CHARACTER = TextAttributesKey.createTextAttributesKey(BAD_CHARACTER_ID,
      CodeInsightColors.UNMATCHED_BRACE_ATTRIBUTES.getDefaultAttributes());

  public static TextAttributesKey WRONG_STRING = TextAttributesKey.createTextAttributesKey(WRONG_STRING_ID,
      SyntaxHighlighterColors.STRING.getDefaultAttributes());


  public static final TextAttributes UNRESOLVED_ACCESS_ATTRIBUTES = HighlighterColors.TEXT.getDefaultAttributes().clone();
  static{
    UNRESOLVED_ACCESS_ATTRIBUTES.setForegroundColor(Color.BLACK);
    UNRESOLVED_ACCESS_ATTRIBUTES.setEffectColor(Color.GRAY);
    UNRESOLVED_ACCESS_ATTRIBUTES.setEffectType(EffectType.LINE_UNDERSCORE);
  }
  public static final TextAttributes LITERAL_CONVERSION_ATTRIBUTES = HighlighterColors.TEXT.getDefaultAttributes().clone();
  static{
    LITERAL_CONVERSION_ATTRIBUTES.setForegroundColor(Color.BLUE);
    LITERAL_CONVERSION_ATTRIBUTES.setFontType(Font.BOLD);
  }

  public static final TextAttributes MAP_KEY_ATTRIBUTES = HighlighterColors.TEXT.getDefaultAttributes().clone();
  static {
    MAP_KEY_ATTRIBUTES.setForegroundColor(new Color(0, 128, 0));
  }
  public static TextAttributesKey UNRESOLVED_ACCESS = TextAttributesKey.createTextAttributesKey(UNRESOLVED_ACCESS_ID, UNRESOLVED_ACCESS_ATTRIBUTES);
  public static TextAttributesKey LITERAL_CONVERSION = TextAttributesKey.createTextAttributesKey(LITERAL_CONVERSION_ID, LITERAL_CONVERSION_ATTRIBUTES);

  public static TextAttributesKey MAP_KEY = TextAttributesKey.createTextAttributesKey(MAP_KEY_ID, MAP_KEY_ATTRIBUTES);

  private DefaultHighlighter() {
  }
}
