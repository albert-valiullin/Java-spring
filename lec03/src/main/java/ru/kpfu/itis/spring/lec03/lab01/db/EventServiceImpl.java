package ru.kpfu.itis.spring.lec03.lab01.db;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.kpfu.itis.spring.lec03.lab01.model.Event;
import ru.kpfu.itis.spring.lec03.lab01.model.Guest;

import java.util.List;

/**
 * Created by Admin on 08.04.2015.
 */
@Service
public class EventServiceImpl implements EventService {

    @Autowired
    private Dao dao;

    public void register(Guest guest, Event event) {
        dao.register(guest, event);
    }

    public List<Guest> guestsForEvent(Event event) {
        return dao.guestsForEvent(event);
    }
}
