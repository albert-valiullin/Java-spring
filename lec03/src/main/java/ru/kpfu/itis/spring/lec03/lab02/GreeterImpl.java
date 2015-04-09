package ru.kpfu.itis.spring.lec03.lab02;

/**
 * Created by Admin on 09.04.2015.
 */
public class GreeterImpl implements Greeter {

    private Greeting greeting;

    public void setGreeting(Greeting greeting) {
        this.greeting = greeting;
    }

    public Greeting greet() {
        return greeting;
    }
}
