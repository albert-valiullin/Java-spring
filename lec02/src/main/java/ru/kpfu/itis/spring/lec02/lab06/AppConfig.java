package ru.kpfu.itis.spring.lec02.lab06;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Admin on 07.04.2015.
 */
@Configuration
@EnableAspectJAutoProxy
@ComponentScan()
public class AppConfig {
    @Bean
    public List<String> emails() {
        ArrayList<String> emails = new ArrayList<String>();
        emails.add("emil1@example.com");
        emails.add("capitan@example.com");
        emails.add("angry@example.com");
        return emails;
    }
}
