package com.takescoop.customlintrules;

import com.android.tools.lint.client.api.IssueRegistry;
import com.android.tools.lint.detector.api.Issue;
import com.takescoop.customlintrules.issues.EnumValueNameIssue;

import org.jetbrains.annotations.NotNull;

import java.util.Collections;
import java.util.List;

public class CustomIssueRegistry extends IssueRegistry {

    public CustomIssueRegistry() {
    }

    @NotNull
    @Override
    public List<Issue> getIssues() {
        return Collections.singletonList(EnumValueNameIssue.ISSUE);
    }
}
