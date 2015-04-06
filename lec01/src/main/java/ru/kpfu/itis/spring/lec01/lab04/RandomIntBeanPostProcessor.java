package ru.kpfu.itis.spring.lec01.lab04;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import java.lang.reflect.Method;
import java.util.Random;

/**
 * Created by Admin on 06.04.2015.
 */
public class RandomIntBeanPostProcessor implements BeanPostProcessor{
    public Object postProcessBeforeInitialization(Object o, String s) throws BeansException {
        System.out.println("RandomIntBPP runs on "+s+"!");
        Method[] methods = o.getClass().getMethods();
        for (Method method : methods) {
            InjectRandomInt annotation = method.getAnnotation(InjectRandomInt.class);
            if (annotation != null) {
                Random dom = new Random();
                System.out.println("Random int for method "+method.getName()+": "+(dom.nextInt(annotation.max()-annotation.min())+annotation.min()));
            }
        }
        return o;
    }

    public Object postProcessAfterInitialization(Object o, String s) throws BeansException {
        return o;
    }
}
