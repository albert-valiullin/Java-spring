package ru.kpfu.itis.spring.lec02.lab03;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * Created by Admin on 08.04.2015.
 */
@Configuration
public class AppConfig {

    @Bean
    public Robot robot() {
        return new SpeakingRobot() {
            @Override
            public RandomQuoter getQuoter() {
                return quoter();
            }
        };
    }

    @Bean
    @Scope("prototype")
    public RandomQuoter quoter() {
        System.out.println("Creating new quoter");
        return new RandomQuoter();
    }
}
