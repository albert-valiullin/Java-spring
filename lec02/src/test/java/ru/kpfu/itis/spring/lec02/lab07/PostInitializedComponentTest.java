package ru.kpfu.itis.spring.lec02.lab07;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by Admin on 07.04.2015.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AppConfig.class)
public class PostInitializedComponentTest {

    @Test
    public void testPostInitialized() throws Exception{

    }
}
