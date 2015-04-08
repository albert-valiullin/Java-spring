package ru.kpfu.itis.spring.lec02.lab09;

import org.springframework.stereotype.Component;

/**
 * Created by Admin on 08.04.2015.
 */
//@Component
public class NewStuff extends OldShit{
    public String returnValue() {
        return "new value";
    }
}
