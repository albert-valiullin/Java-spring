package ru.kpfu.itis.spring.lec01.lab04;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import ru.kpfu.itis.spring.lec01.lab01.RunThisMethod;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by Admin on 06.04.2015.
 */
public class RunThisMethodBeanPostProcessor implements BeanPostProcessor{
    public Object postProcessBeforeInitialization(Object o, String s) throws BeansException {
        try{
            System.out.println("RunThisMethodBPP runs on "+s+"!");
            Method[] methods = o.getClass().getMethods();
            for (Method method : methods) {
                RunThisMethod annotation = method.getAnnotation(RunThisMethod.class);
                if (annotation != null) {
                    int repeat = annotation.repeat();
                    for (int i = 0; i < repeat; i++) {
                        method.invoke(o);
                    }
                }
            }
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return o;
    }

    public Object postProcessAfterInitialization(Object o, String s) throws BeansException {
        return o;
    }
}
