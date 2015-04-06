package ru.kpfu.itis.spring.lec01.lab07;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.kpfu.itis.spring.lec01.lab05.Subject;

/**
 * Created by Admin on 06.04.2015.
 */
public class BbppTest {
    public static void main(String[] args) throws InterruptedException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context07.xml");
        context.getBean(Subject.class).longMethod();
    }
}
