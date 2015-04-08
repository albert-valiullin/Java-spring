package ru.kpfu.itis.spring.lec02.lab03;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * Created by Admin on 07.04.2015.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:context03.xml")
public class SpeakingRobotXmlConfigTest {

    @Autowired
    private Robot robot;
    @Test
    public void testRandomQuotes() {
        assertNotEquals(robot.speak(), robot.speak());
    }
}