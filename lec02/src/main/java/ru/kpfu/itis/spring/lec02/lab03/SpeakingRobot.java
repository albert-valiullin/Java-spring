package ru.kpfu.itis.spring.lec02.lab03;

/**
 * Created by Admin on 07.04.2015.
 */
public class SpeakingRobot implements Robot {

    public String speak() {
        return getQuoter().getRandomQuote();
    }

    public RandomQuoter getQuoter() {
        return null;
    }

}
