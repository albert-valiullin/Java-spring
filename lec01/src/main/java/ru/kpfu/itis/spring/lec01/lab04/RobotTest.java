package ru.kpfu.itis.spring.lec01.lab04;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Admin on 06.04.2015.
 */
public class RobotTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context04.xml");
//        System.out.println(context.getBean(Robot.class));
    }
}
