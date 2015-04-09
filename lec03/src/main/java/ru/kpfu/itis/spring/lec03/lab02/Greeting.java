package ru.kpfu.itis.spring.lec03.lab02;

import java.io.Serializable;

/**
 * Created by Admin on 09.04.2015.
 */
public class Greeting implements Serializable {
    private String message;

    public Greeting(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
