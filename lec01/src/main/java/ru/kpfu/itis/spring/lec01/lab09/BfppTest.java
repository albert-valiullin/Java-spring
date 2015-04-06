package ru.kpfu.itis.spring.lec01.lab09;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Admin on 06.04.2015.
 */
public class BfppTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context09.xml");
        context.getBean(DestroyablePrototype.class);
        context.close();
    }
}
