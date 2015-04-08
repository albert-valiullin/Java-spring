package ru.kpfu.itis.spring.lec02.lab01;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import static org.junit.Assert.*;

/**
 * Created by Admin on 07.04.2015.
 */
public class DeprecatedOnSteroidsTest {
    @Test
    public void testReplaced() {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        Object obj = context.getBean("replaced");

        assertEquals(AwesomeNewStuff.class, obj.getClass());
    }

}