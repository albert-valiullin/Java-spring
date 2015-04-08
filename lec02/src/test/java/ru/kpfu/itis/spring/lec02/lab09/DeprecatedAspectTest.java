package ru.kpfu.itis.spring.lec02.lab09;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * Created by Admin on 08.04.2015.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AppConfig.class)
public class DeprecatedAspectTest {

    @Autowired
    private DeprecatedHandler handler;

    @Test
    public void deprecatedTest() {
        System.out.println(handler.returnOld().returnValue());
        assertEquals(NewStuff.class, handler.returnOld().getClass());
    }

}