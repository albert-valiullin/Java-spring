package ru.kpfu.itis.spring.lec02.lab08;

import org.springframework.stereotype.Component;

/**
 * Created by Admin on 08.04.2015.
 */
@Component
@Derby
public class DerbyDao implements Dao {
    public void crud() {
        System.out.println("Derby crud");
    }
}
