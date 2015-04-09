package ru.kpfu.itis.spring.lec03.lab02;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Admin on 09.04.2015.
 */
public class GreeterTest {

    @Test
    public void testGreet() throws Exception{
        AnnotationConfigApplicationContext serverContext = new AnnotationConfigApplicationContext(ServerAppConfig.class);
        AnnotationConfigApplicationContext clientContext = new AnnotationConfigApplicationContext(ClientAppConfig.class);
        Greeting serverGreeting = new Greeting("Greet");
        serverContext.getBean(Greeter.class).setGreeting(serverGreeting);
        Greeting clientGreeting = clientContext.getBean(Greeter.class).greet();
        Assert.assertEquals(serverGreeting.getMessage(), clientGreeting.getMessage());
        Assert.assertNotEquals(serverGreeting, clientGreeting);
    }
}
