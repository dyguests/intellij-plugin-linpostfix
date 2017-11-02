package com.fanhl.intellij.postfix.templates.surround;

import com.intellij.codeInsight.template.postfix.templates.StringBasedPostfixTemplate;
import com.intellij.codeInsight.template.postfix.util.JavaPostfixTemplatesUtils;
import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * new postfix
 *
 * @author fanhl
 */
public class NewPostfixTemplate extends StringBasedPostfixTemplate {
    public NewPostfixTemplate() {
        super("new", "new expr()", JavaPostfixTemplatesUtils.selectorTopmost());
    }

    @Nullable
    @Override
    public String getTemplateString(@NotNull PsiElement psiElement) {
        return "new $expr$()$END$";
    }
}
