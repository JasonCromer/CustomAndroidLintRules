package com.takescoop.customlintrules.detectors;

import com.android.tools.lint.client.api.UElementHandler;
import com.android.tools.lint.detector.api.Detector;
import com.android.tools.lint.detector.api.JavaContext;
import com.android.tools.lint.detector.api.TextFormat;
import com.takescoop.customlintrules.issues.EnumValueNameIssue;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.uast.UElement;
import org.jetbrains.uast.UEnumConstant;

import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;

public class NewEnumValueNameDetector extends Detector implements Detector.UastScanner {

    public NewEnumValueNameDetector() {
    }

    @Nullable
    @Override
    public UElementHandler createUastHandler(@NotNull JavaContext context) {
        return new EnumConstantVisitor(context);
    }

    @Nullable
    @Override
    public List<Class<? extends UElement>> getApplicableUastTypes() {
        return Collections.singletonList(UEnumConstant.class);
    }

    private static class EnumConstantVisitor extends UElementHandler {

        private static final Pattern ALL_CAPS_PATTERN = Pattern.compile("^[A-Z][A-Z0-9]*(_[A-Z0-9]+)*$");

        private JavaContext javaContext;

        EnumConstantVisitor(JavaContext javaContext) {
            this.javaContext = javaContext;
        }

        @Override
        public void visitEnumConstant(@NotNull UEnumConstant node) {
            if (node.getName() == null || !ALL_CAPS_PATTERN.matcher(node.getName()).matches()) {
                javaContext.report(EnumValueNameIssue.ISSUE, node, javaContext.getLocation(node), EnumValueNameIssue.ISSUE.getBriefDescription(TextFormat.TEXT));
            }
        }
    }
}
