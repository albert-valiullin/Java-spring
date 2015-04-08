package ru.kpfu.itis.spring.lec02.lab05;

import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import ru.kpfu.itis.spring.lec02.lab02.StringBuilderFactoryBean;
import ru.kpfu.itis.spring.lec02.lab04.Quoter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;

/**
 * Created by Admin on 07.04.2015.
 */
@Configuration
@PropertySource("classpath:file.properties")
public class AppConfig {

    @Value("${fileName}")
    private String fileName;
    @Autowired
    private StringBuilder stringBuilder;

    @Bean
    public static PropertySourcesPlaceholderConfigurer configurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }

    @Bean
    public FileCreator fileCreator() {
        return new FileCreator(fileName);
    }

    @Bean
    @DependsOn("fileCreator")
    public FileConsumer fileConsumer() {
        return new FileConsumer(fileName);
    }

    @Bean
    public StringBuilderFactoryBean stringBuilder() {
        StringBuilderFactoryBean stringBuilderFactoryBean = new StringBuilderFactoryBean();
        stringBuilderFactoryBean.setStart("Start");
        stringBuilderFactoryBean.setMiddle("Middle");
        stringBuilderFactoryBean.setFinish("Finish");
        return stringBuilderFactoryBean;
    }

    @Bean
    public Quoter customQuoter() {
        return new CustomQuoter(stringBuilder);
    }

    @Bean
    public Robot robot() {
        Robot robot = new Robot();
        robot.setQuoter(customQuoter());
        return robot;
    }
}
