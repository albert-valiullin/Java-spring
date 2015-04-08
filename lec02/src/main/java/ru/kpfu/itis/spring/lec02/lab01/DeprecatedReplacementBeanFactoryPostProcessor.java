package ru.kpfu.itis.spring.lec02.lab01;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanInitializationException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.GenericBeanDefinition;

/**
 * Created by Admin on 07.04.2015.
 */
public class DeprecatedReplacementBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        try {

            String[] beanDefinitionNames = beanFactory.getBeanDefinitionNames();
            for (String name : beanDefinitionNames) {
                GenericBeanDefinition beanDefinition = (GenericBeanDefinition) beanFactory.getBeanDefinition(name);
                DeprecatedOnSteroids deprecatedOnSteroids = Class.forName(beanDefinition.getBeanClassName()).getAnnotation(DeprecatedOnSteroids.class);
                if (deprecatedOnSteroids != null) {
                    beanDefinition.setBeanClass(deprecatedOnSteroids.replacedWith());
                }
            }
        } catch (ClassNotFoundException e) {
            throw new BeanInitializationException("Failed to load class",e);
        }
    }
}
