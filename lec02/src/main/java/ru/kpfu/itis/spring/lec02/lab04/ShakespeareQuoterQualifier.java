package ru.kpfu.itis.spring.lec02.lab04;

import org.springframework.beans.factory.annotation.Qualifier;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created by Admin on 07.04.2015.
 */
@Retention(RetentionPolicy.RUNTIME)
@Qualifier
public @interface ShakespeareQuoterQualifier {
}
