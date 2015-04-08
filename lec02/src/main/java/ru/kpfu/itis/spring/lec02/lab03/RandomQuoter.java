package ru.kpfu.itis.spring.lec02.lab03;

import java.util.Random;

/**
 * Created by Admin on 07.04.2015.
 */
public class RandomQuoter {
    private String randomQuote;

    public RandomQuoter() {
        randomQuote = Integer.toHexString(new Random().nextInt());
    }

    public String getRandomQuote() {
        return randomQuote;
    }
}
