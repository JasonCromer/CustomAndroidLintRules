package registry;

import com.android.tools.lint.detector.api.Issue;
import com.takescoop.customlintrules.CustomIssueRegistry;
import com.takescoop.customlintrules.issues.EnumValueNameIssue;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import testdata.enumtestdata.TestData;

import static org.hamcrest.CoreMatchers.hasItem;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class CustomIssueRegistryTest {

    private CustomIssueRegistry customIssueRegistry;

    @Before
    public void setUp() {
        customIssueRegistry = new CustomIssueRegistry();
    }

    @Test
    public void testNumberOfIssues() {
        int size = customIssueRegistry.getIssues().size();
        assertThat(size, is(TestData.ISSUE_REGISTRY_NUM_ISSUES));
    }

    @Test
    public void testGetIssues() {
        List<Issue> actual = customIssueRegistry.getIssues();
        assertThat(actual, hasItem(EnumValueNameIssue.ISSUE));
    }
}
