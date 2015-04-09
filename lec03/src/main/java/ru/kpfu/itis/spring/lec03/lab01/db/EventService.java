package ru.kpfu.itis.spring.lec03.lab01.db;

import ru.kpfu.itis.spring.lec03.lab01.model.Event;
import ru.kpfu.itis.spring.lec03.lab01.model.Guest;

import java.util.List;

/**
 * Created by Admin on 08.04.2015.
 */
public interface EventService {
    void register(Guest guest, Event event);
    List<Guest> guestsForEvent(Event event);
}
