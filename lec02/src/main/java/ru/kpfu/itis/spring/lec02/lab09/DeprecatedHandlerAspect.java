package ru.kpfu.itis.spring.lec02.lab09;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.util.Objects;

/**
 * Created by Admin on 08.04.2015.
 */
@Component
@Aspect
public class DeprecatedHandlerAspect {
    @Around("execution((@MyDeprecated *) *(..))")
    public Object handleDeprecated(ProceedingJoinPoint pjp) {
        Object value = null;
        try {
            value = pjp.proceed();
            MyDeprecated myDeprecated = value.getClass().getAnnotation(MyDeprecated.class);
            if (myDeprecated != null) {
                return myDeprecated.replacedWith().newInstance();
            }
        } catch (Throwable e) {
            e.printStackTrace();
        }
        return value != null ? value : null;
    }
}
