package testdata.enumtestdata;

import org.intellij.lang.annotations.Language;

public class TestData {

    public static final int ISSUE_REGISTRY_NUM_ISSUES = 1;

    public static final String ENUM_TEST_CAMEL_CASE_WARNING = "src/EnumCamelCaseTestCase.java:4: Warning: Enum values should be all-capitalized [enum_value_name]\n"
            + "        cat,\n        ~~~\n"
            + "src/EnumCamelCaseTestCase.java:5: Warning: Enum values should be all-capitalized [enum_value_name]\n"
            + "        dog,\n        ~~~\n"
            + "src/EnumCamelCaseTestCase.java:6: Warning: Enum values should be all-capitalized [enum_value_name]\n"
            + "        Turtle\n        ~~~~~~\n0 errors, 3 warnings\n";

    public static final String ENUM_TEST_CLASS_WARNING = "src/EnumClassTestCase.java:2: Warning: Enum values should be all-capitalized [enum_value_name]\n"
            + "    Instance;\n    ~~~~~~~~\n"
            + "src/EnumClassTestCase.java:5: Warning: Enum values should be all-capitalized [enum_value_name]\n"
            + "        positive,\n        ~~~~~~~~\n"
            + "src/EnumClassTestCase.java:6: Warning: Enum values should be all-capitalized [enum_value_name]\n"
            + "        negative,\n        ~~~~~~~~\n0 errors, 3 warnings\n";


    @Language("JAVA")
    public static final String ENUM_TEST_CASE_EMPTY = "    public enum FeedbackTest {\n"
            + "        \n"
            + "    }";

    @Language("JAVA")
    public static final String ENUM_TEST_CASE_CAMEL_CASE = "class EnumCamelCaseTestCase {\n\n"
            + "    public enum Pet {\n"
            + "        cat,\n"
            + "        dog,\n"
            + "        Turtle\n"
            + "    }\n}";

    @Language("JAVA")
    public static final String ENUM_TEST_CASE_NESTED_CLASS = "public enum EnumClassTestCase {\n"
            + "    Instance;\n"
            + "\n"
            + "    public enum FeedbackTest {\n"
            + "        positive,\n"
            + "        negative,\n"
            + "    }\n}";
}
