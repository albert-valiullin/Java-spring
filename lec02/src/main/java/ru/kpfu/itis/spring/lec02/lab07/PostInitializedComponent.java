package ru.kpfu.itis.spring.lec02.lab07;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * Created by Admin on 07.04.2015.
 */
@Component
public class PostInitializedComponent {

    @PostConstruct
    public void postConstruct() {
        System.out.println("I am post construct");
    }

    @PostInitialized
    public void postInitialize() {
        System.out.println("I am post initialize");
    }
}
