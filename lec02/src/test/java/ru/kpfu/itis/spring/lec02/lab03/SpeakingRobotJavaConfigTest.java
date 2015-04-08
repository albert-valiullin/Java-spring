package ru.kpfu.itis.spring.lec02.lab03;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertNotEquals;

/**
 * Created by Admin on 07.04.2015.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AppConfig.class)
public class SpeakingRobotJavaConfigTest {

    @Autowired
    private Robot robot;
    @Test
    public void testRandomQuotes() {
        assertNotEquals(robot.speak(), robot.speak());
    }
}