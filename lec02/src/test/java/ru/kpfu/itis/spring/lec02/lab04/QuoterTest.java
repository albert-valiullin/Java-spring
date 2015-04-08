package ru.kpfu.itis.spring.lec02.lab04;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Map;

/**
 * Created by Admin on 07.04.2015.
 */
public class QuoterTest {

    @Test
    public void testSayQuote() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("ru.kpfu.itis.spring.lec02.lab04");
        Map<String, Quoter> beans = context.getBeansOfType(Quoter.class);
        Assert.assertEquals(2, beans.size());
        Assert.assertEquals("I'll be back!", beans.get("terminatorQuoter").sayQuote());
    }
}
