package com.fanhl.intellij.postfix.templates.surround;

import com.intellij.codeInsight.template.postfix.templates.StringBasedPostfixTemplate;
import com.intellij.codeInsight.template.postfix.util.JavaPostfixTemplatesUtils;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiReferenceExpression;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * new postfix
 *
 * @author fanhl
 */
public class NewPostfixTemplate extends StringBasedPostfixTemplate {
    public NewPostfixTemplate() {
        super("new", "new expr()", JavaPostfixTemplatesUtils.selectorTopmost(psiElement -> {
            //检查当前元素是不是类型
            return PsiReferenceExpression.class.isInstance(psiElement);
        }));
    }

    @Nullable
    @Override
    public String getTemplateString(@NotNull PsiElement psiElement) {
        return "new $expr$()$END$";
    }

}
