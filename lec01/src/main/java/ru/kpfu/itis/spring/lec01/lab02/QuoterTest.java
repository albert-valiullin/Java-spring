package ru.kpfu.itis.spring.lec01.lab02;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Admin on 06.04.2015.
 */
public class QuoterTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context02.xml");
        Quoter shakespeareQuoter = context.getBean("terminatorQuoter", Quoter.class);
        shakespeareQuoter.sayQuote();
    }
}
