package ru.kpfu.itis.spring.lec02.lab04;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Admin on 07.04.2015.
 */
public class Robot {

    private Quoter quoter;

    @Autowired
    @QuoterQualifier(QuoterType.TERMINATOR)
    public void setQuoter(Quoter quoter) {
        this.quoter = quoter;
    }

    public String talk() {
        return quoter.sayQuote();
    }
}
