package ru.kpfu.itis.spring.lec01.lab03;

import ru.kpfu.itis.spring.lec01.lab01.RunThisMethod;
import ru.kpfu.itis.spring.lec01.lab02.Quoter;
import ru.kpfu.itis.spring.lec01.lab04.InjectRandomInt;

import javax.annotation.PostConstruct;
import java.util.List;

/**
 * Created by Admin on 06.04.2015.
 */
public class TalkingRobot implements Robot {

    private List<Quoter> quoters;

    public TalkingRobot() {
//        init();
    }

    @InjectRandomInt(min = 0, max = 5)
    @RunThisMethod(repeat = 10)
    public void talk() {
        System.out.println("I am robot "+toString());
        for (Quoter q : quoters) {
            q.sayQuote();
        }
    }

    @PostConstruct
    public void init() {
        talk();
    }

    public List<Quoter> getQuoters() {
        return quoters;
    }

    public void setQuoters(List<Quoter> quoters) {
        this.quoters = quoters;
    }
}
