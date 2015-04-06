package ru.kpfu.itis.spring.lec01.lab01;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by Admin on 06.04.2015.
 */
public class ObjectFactory {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, InvocationTargetException {
        Class clazzToTranslate = Class.forName(args[0]);
        Object newInstance = createObject(clazzToTranslate);
        System.out.println(newInstance);

    }
    public static Object createObject(Class clazz) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        Object newInstance = clazz.newInstance();
//        System.out.println(newInstance);
        Method[] methods = clazz.getMethods();
        for (Method method : methods) {
            RunThisMethod annotation = method.getAnnotation(RunThisMethod.class);
            if (annotation != null) {
                int repeat = annotation.repeat();
                for (int i = 0; i < repeat; i++) {
                    method.invoke(newInstance);
                }
            }
        }
        return newInstance;
    }
}
