package com.fanhl.intellij.postfix;

import com.fanhl.intellij.postfix.templates.surround.NewPostfixTemplate;
import com.intellij.codeInsight.template.postfix.templates.JavaPostfixTemplateProvider;
import com.intellij.codeInsight.template.postfix.templates.PostfixTemplate;
import com.intellij.util.containers.ContainerUtil;
import org.jetbrains.annotations.NotNull;

import java.util.Set;

/**
 * Postfix template provider for extension point.
 *
 * @author fanhl
 */
public class LinPostfixTemplateProvider extends JavaPostfixTemplateProvider {
    private final Set<PostfixTemplate> templates;

    public LinPostfixTemplateProvider() {
        templates = ContainerUtil.newHashSet(
                new NewPostfixTemplate()
        );
    }

    @NotNull
    @Override
    public Set<PostfixTemplate> getTemplates() {
        return templates;
    }
}
