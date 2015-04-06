package ru.kpfu.itis.spring.lec01.lab08;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Admin on 06.04.2015.
 */
public class TransactionalBeanPostProcessor implements BeanPostProcessor {
    private List<String> classesToInstrument = new ArrayList<String>();

    public Object postProcessBeforeInitialization(final Object o, String s) throws BeansException {
        if (o.getClass().getAnnotation(Transactional.class) != null) {
            classesToInstrument.add(s);
        }
        return o;
    }

    public Object postProcessAfterInitialization(final Object o, String s) throws BeansException {
        if (classesToInstrument.contains(s)) {
            return Proxy.newProxyInstance(o.getClass().getClassLoader(), o.getClass().getInterfaces(), new InvocationHandler() {
                public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                    System.out.println("Transaction start");
                    Object returnValue = method.invoke(o, args);
                    System.out.println("Transaction commit");
                    return returnValue;
                }
            });
        } else {
            return o;
        }
    }
}
