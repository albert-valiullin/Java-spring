package ru.kpfu.itis.spring.lec02.lab02;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

/**
 * Created by Admin on 07.04.2015.
 */
public class StringBuilderFactoryBeanTest {

    @Test
    public void testFactoryBean() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context02.xml");
        StringBuilder stringBuilder = context.getBean(StringBuilder.class);
        assertEquals("Start Middle Finish.", stringBuilder.toString());
    }

}