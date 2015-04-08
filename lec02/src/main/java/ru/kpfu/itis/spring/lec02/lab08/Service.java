package ru.kpfu.itis.spring.lec02.lab08;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Admin on 08.04.2015.
 */
@Component
public class Service {
    @Autowired
    @Derby
//    @Oracle
    private Dao dao;

    public Dao getDao() {
        return dao;
    }

//    @Autowired
//    @Oracle
    public void setDao(Dao dao) {
        this.dao = dao;
    }
}
