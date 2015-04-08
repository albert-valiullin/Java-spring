package ru.kpfu.itis.spring.lec02.lab06;

import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Admin on 08.04.2015.
 */
@Component
@Aspect
public class ExceptionHandlerAspect {

    @Resource(name="emails")
    private List<String> emails;

    private List<String> cached = new ArrayList<String>();

    @AfterThrowing(pointcut = "within(@org.springframework.stereotype.Repository *)", throwing = "ex")
    public void handleDBExceptions(DatabaseException ex) {
        cached.add(ex.getMessage());
        for (String email : emails) {
            System.out.println("sending mail to " + email + ":" + Arrays.toString(ex.getStackTrace()));
        }
    }
}
