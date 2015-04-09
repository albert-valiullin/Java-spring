package ru.kpfu.itis.spring.lec03.lab01.model;

import java.sql.Date;

/**
 * Created by Admin on 08.04.2015.
 */
public class Event {
    private int id;
    private String title;
    private String place;
    private Date date;

    public Event(int id, String title, String place, Date date) {
        this.id = id;
        this.title = title;
        this.place = place;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Event{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", place='" + place + '\'' +
                ", date=" + date +
                '}';
    }
}
