package ru.kpfu.itis.spring.lec01.lab02;

import java.util.List;

/**
 * Created by Admin on 06.04.2015.
 */
public class TerminatorQuoter implements Quoter{

    private List<String> quotes;

    public void sayQuote() {
        System.out.println(quotes);
    }

    public List<String> getQuotes() {
        return quotes;
    }

    public void setQuotes(List<String> quotes) {
        this.quotes = quotes;
    }
}
