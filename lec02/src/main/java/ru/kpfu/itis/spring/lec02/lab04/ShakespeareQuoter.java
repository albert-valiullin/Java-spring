package ru.kpfu.itis.spring.lec02.lab04;

import org.springframework.stereotype.Component;

/**
 * Created by Admin on 07.04.2015.
 */
@Component
@QuoterQualifier(QuoterType.SHAKESPEARE)
public class ShakespeareQuoter implements Quoter {

    public String sayQuote() {
        return "2b | ~2b";
    }

}
