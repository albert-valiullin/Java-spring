package ru.kpfu.itis.spring.lec02.lab05;

import ru.kpfu.itis.spring.lec02.lab04.Quoter;

/**
 * Created by Admin on 07.04.2015.
 */
public class Robot {

    private Quoter quoter;

    public void setQuoter(Quoter quoter) {
        this.quoter = quoter;
    }

    public String talk() {
        return quoter.sayQuote();
    }
}
