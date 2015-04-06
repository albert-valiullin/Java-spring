package ru.kpfu.itis.spring.lec01.lab02;

import java.util.List;

/**
 * Created by Admin on 06.04.2015.
 */
public class ShakespeareQuoter implements Quoter{

    private String quote;

    public void sayQuote() {
        System.out.println(quote);
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }

    public String getQuote() {
        return quote;
    }
}
