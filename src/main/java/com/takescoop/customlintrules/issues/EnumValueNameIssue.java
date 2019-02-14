package com.takescoop.customlintrules.issues;

import com.android.annotations.NonNull;
import com.android.tools.lint.detector.api.Category;
import com.android.tools.lint.detector.api.Implementation;
import com.android.tools.lint.detector.api.Issue;
import com.android.tools.lint.detector.api.Scope;
import com.android.tools.lint.detector.api.Severity;
import com.takescoop.customlintrules.detectors.NewEnumValueNameDetector;

public class EnumValueNameIssue {

    private static final String ISSUE_ID = "enum_value_name";
    private static final String ISSUE_DESCRIPTION = "Enum values should be all-capitalized";
    private static final String ISSUE_EXPLANATION = "Enum Values should follow the standard Java Constant naming convention. For example: MY_ENUM_VALUE";
    private static final Category ISSUE_CATEGORY = Category.TYPOGRAPHY;
    private static final Severity ISSUE_SEVERITY = Severity.WARNING;
    private static final int ISSUE_PRIORITY = 4;

    @NonNull
    private static final Implementation IMPLEMENTATION = new Implementation(
            NewEnumValueNameDetector.class,
            Scope.JAVA_FILE_SCOPE
    );

    public static final Issue ISSUE = Issue.create(
            ISSUE_ID,
            ISSUE_DESCRIPTION,
            ISSUE_EXPLANATION,
            ISSUE_CATEGORY,
            ISSUE_PRIORITY,
            ISSUE_SEVERITY,
            IMPLEMENTATION
    );

}
