package ru.kpfu.itis.spring.lec02.lab06;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.ContextConfiguration;

/**
 * Created by Admin on 07.04.2015.
 */
@ContextConfiguration(classes = AppConfig.class)
public class RepositoryTest {

    @Autowired
    private Repository repository;

    @Test(expected = DatabaseException.class)
    public void testPersistMessage() throws Exception {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("ru.kpfu.itis.spring.lec02.lab06");
        Repository repository = context.getBean(Repository.class);
        repository.persistMessage("Hello");
    }
}
