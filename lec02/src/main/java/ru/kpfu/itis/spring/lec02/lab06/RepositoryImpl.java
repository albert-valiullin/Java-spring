package ru.kpfu.itis.spring.lec02.lab06;

/**
 * Created by Admin on 07.04.2015.
 */
@org.springframework.stereotype.Repository
public class RepositoryImpl implements Repository {

    public void persistMessage(String message) {
        throw new DatabaseException("Failed to save");
    }
}
