package ru.kpfu.itis.spring.lec03.lab01.db;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import ru.kpfu.itis.spring.lec03.lab01.model.Event;
import ru.kpfu.itis.spring.lec03.lab01.model.Guest;

import javax.sql.DataSource;
import java.util.List;

/**
 * Created by Admin on 08.04.2015.
 */
@Repository
public class DaoImpl implements Dao {
    private DataSource dataSource;

    private JdbcTemplate jdbcTemplate;

    @Autowired
    public void setJdbcTemplate(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public void register(Guest guest, Event event) {
        jdbcTemplate.update("INSERT INTO \"Order\"(eventID, guestId) VALUES (?, ?)", event.getId(), guest.getId());
    }

    public List<Guest> guestsForEvent(Event event) {
        return jdbcTemplate.query("SELECT * FROM Guest WHERE EXISTS( SELECT * FROM \"Order\" WHERE Guest.id = guestId AND ? = eventId)",
                new GuestRowMapper(), new Object[] {event.getId()});
    }

    public DataSource getDataSource() {
        return dataSource;
    }

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }
}
