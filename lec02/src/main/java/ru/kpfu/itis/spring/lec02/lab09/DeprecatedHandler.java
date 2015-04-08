package ru.kpfu.itis.spring.lec02.lab09;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Admin on 08.04.2015.
 */
@Component
public class DeprecatedHandler {

    @Autowired
    private OldShit old;

    public OldShit returnOld() {
        return old;
    }

    public OldShit getOld() {
        return old;
    }

    public void setOld(OldShit old) {
        this.old = old;
    }
}
