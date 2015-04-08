package ru.kpfu.itis.spring.lec02.lab05;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Admin on 07.04.2015.
 */
public class AppConfigDependencyTest {

    @Test
    public void testFileDependency() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("ru.kpfu.itis.spring.lec02.lab05");
    }
}
