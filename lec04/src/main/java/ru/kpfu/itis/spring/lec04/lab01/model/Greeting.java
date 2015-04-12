package ru.kpfu.itis.spring.lec04.lab01.model;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by Admin on 10.04.2015.
 */
@XmlRootElement
public class Greeting {
    private String greetMessage;

    public Greeting(String greetMessage) {
        this.greetMessage = greetMessage;
    }

    public Greeting() {
    }

    public String getGreetMessage() {
        return greetMessage;
    }

    public void setGreetMessage(String greetMessage) {
        this.greetMessage = greetMessage;
    }
}
