package ru.kpfu.itis.spring.lec03.lab01.model;

/**
 * Created by Admin on 08.04.2015.
 */
public class Order {
    private int id;
    private Guest guest;
    private Event event;

    public Order(int id, Guest guest, Event event) {
        this.id = id;
        this.guest = guest;
        this.event = event;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Guest getGuest() {
        return guest;
    }

    public void setGuest(Guest guest) {
        this.guest = guest;
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", guest=" + guest +
                ", event=" + event +
                '}';
    }
}
