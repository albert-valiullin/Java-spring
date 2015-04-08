package ru.kpfu.itis.spring.lec02.lab05;

import ru.kpfu.itis.spring.lec02.lab04.Quoter;

/**
 * Created by Admin on 07.04.2015.
 */
public class CustomQuoter implements Quoter {

    private StringBuilder stringBuilder;

    public CustomQuoter(StringBuilder stringBuilder) {
        this.stringBuilder = stringBuilder;
    }

    public String sayQuote() {
        return stringBuilder.toString();
    }
}
