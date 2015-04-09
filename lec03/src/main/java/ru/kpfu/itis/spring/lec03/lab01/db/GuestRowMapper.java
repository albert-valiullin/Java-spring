package ru.kpfu.itis.spring.lec03.lab01.db;

import org.springframework.jdbc.core.RowMapper;
import ru.kpfu.itis.spring.lec03.lab01.model.Guest;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by Admin on 09.04.2015.
 */
public class GuestRowMapper implements RowMapper<Guest> {
    public Guest mapRow(ResultSet resultSet, int i) throws SQLException {
        return new Guest(resultSet.getInt("id"), resultSet.getString("name"));
    }
}
