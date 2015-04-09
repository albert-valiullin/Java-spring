package ru.kpfu.itis.spring.lec03.lab01;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;
import ru.kpfu.itis.spring.lec03.lab01.db.EventService;
import ru.kpfu.itis.spring.lec03.lab01.model.Event;
import ru.kpfu.itis.spring.lec03.lab01.model.Guest;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by Admin on 08.04.2015.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:context.xml")
@Transactional
public class EventServiceImplTest {

    @Autowired
    private EventService eventService;

    @Test
    public void testRegister() throws Exception {
        Guest gena = new Guest(2, "Gena");
        Event event = new Event(1, null, null, null);

        List<Guest> guests = eventService.guestsForEvent(event);
        assertFalse(guests.contains(gena));
        eventService.register(gena, event);
        guests = eventService.guestsForEvent(event);
        assertTrue(guests.contains(gena));
    }

    @Test
    public void testGuestsForEvent() throws Exception {
        List<Guest> guests = eventService.guestsForEvent(new Event(1, null, null, null));
        for (Guest guest : guests) {
            System.out.println(guest);
        }
        Guest vasya = new Guest(0, "Vasya");
        Guest steve = new Guest(0, "Steve");
        assertTrue(guests.contains(vasya));
        assertTrue(guests.contains(steve));
    }
}