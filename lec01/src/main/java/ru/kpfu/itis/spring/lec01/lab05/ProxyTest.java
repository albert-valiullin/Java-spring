package ru.kpfu.itis.spring.lec01.lab05;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Admin on 06.04.2015.
 */
public class ProxyTest {
    public static void main(String[] args) throws InterruptedException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context05.xml");
        Subject subject = context.getBean("subject", Subject.class);
        subject.longMethod();
    }
}
