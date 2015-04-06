package ru.kpfu.itis.spring.lec01.lab03;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Admin on 06.04.2015.
 */
public class RobotTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context03.xml");
//        System.out.println(context.getBean(Robot.class));
    }
}
