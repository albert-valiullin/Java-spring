package ru.kpfu.itis.spring.lec01.lab01;

/**
 * Created by Admin on 06.04.2015.
 */
public class Robot {
    @Override
    public String toString() {
        return "I am Robot!";
    }

    @RunThisMethod(repeat = 3)
    public void clean() {
        System.out.println("Cleaning!");
    }
}
