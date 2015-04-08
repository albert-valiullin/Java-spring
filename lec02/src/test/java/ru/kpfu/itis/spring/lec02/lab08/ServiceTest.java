package ru.kpfu.itis.spring.lec02.lab08;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.Assert.*;

/**
 * Created by Admin on 08.04.2015.
 */
public class ServiceTest {

    @Test
    public void testService() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("ru.kpfu.itis.spring.lec02.lab08");
        Service service = context.getBean(Service.class);
        service.getDao().crud();
        assertEquals(DerbyDao.class, service.getDao().getClass());
    }

}