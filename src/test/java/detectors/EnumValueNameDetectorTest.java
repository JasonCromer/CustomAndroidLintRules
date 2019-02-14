package detectors;


import com.android.tools.lint.checks.infrastructure.LintDetectorTest;
import com.android.tools.lint.detector.api.Detector;
import com.android.tools.lint.detector.api.Issue;
import com.takescoop.customlintrules.detectors.NewEnumValueNameDetector;
import com.takescoop.customlintrules.issues.EnumValueNameIssue;

import java.util.Collections;
import java.util.List;

import testdata.enumtestdata.TestData;

public class EnumValueNameDetectorTest extends LintDetectorTest {

    @Override
    protected Detector getDetector() {
        return new NewEnumValueNameDetector();
    }

    @Override
    protected List<Issue> getIssues() {
        return Collections.singletonList(EnumValueNameIssue.ISSUE);
    }

    public void testEmptyCase() {
        lint().files(java(TestData.ENUM_TEST_CASE_EMPTY)).issues(EnumValueNameIssue.ISSUE).run().expectClean();
    }

    public void testEnumCamelCase() {
        lint().files(java(TestData.ENUM_TEST_CASE_CAMEL_CASE)).issues(EnumValueNameIssue.ISSUE).run().expect(TestData.ENUM_TEST_CAMEL_CASE_WARNING);
    }

    public void testEnumClass() {
        lint().files(java(TestData.ENUM_TEST_CASE_NESTED_CLASS)).issues(EnumValueNameIssue.ISSUE).run().expect(TestData.ENUM_TEST_CLASS_WARNING);
    }
}
