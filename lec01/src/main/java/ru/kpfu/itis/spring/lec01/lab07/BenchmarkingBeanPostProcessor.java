package ru.kpfu.itis.spring.lec01.lab07;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by Admin on 06.04.2015.
 */
public class BenchmarkingBeanPostProcessor implements BeanPostProcessor{
    public Object postProcessBeforeInitialization(Object o, String s) throws BeansException {
        return o;
    }

    public Object postProcessAfterInitialization(final Object o, String s) throws BeansException {
        return Proxy.newProxyInstance(o.getClass().getClassLoader(), o.getClass().getInterfaces(), new InvocationHandler() {
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                if (o.getClass().getMethod(method.getName(), method.getParameterTypes()).getAnnotation(Benchmark.class) != null) {
                    long start = System.currentTimeMillis();
                    Object returnValue = method.invoke(o, args);
                    System.out.println("Invocation time: " + (System.currentTimeMillis() - start));
                    return returnValue;
                } else {
                    return method.invoke(o, args);
                }

            }
        });
    }
}
