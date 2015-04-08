package ru.kpfu.itis.spring.lec02.lab04;


import org.springframework.stereotype.Component;

/**
 * Created by Admin on 07.04.2015.
 */
@Component
@QuoterQualifier(QuoterType.TERMINATOR)
public class TerminatorQuoter implements Quoter {

    public String sayQuote() {
        return "I'll be back!";
    }

}
