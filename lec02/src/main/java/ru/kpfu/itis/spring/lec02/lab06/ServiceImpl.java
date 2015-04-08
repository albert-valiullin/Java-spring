package ru.kpfu.itis.spring.lec02.lab06;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Admin on 08.04.2015.
 */
@org.springframework.stereotype.Service
public class ServiceImpl implements Service {
    private Repository repository;

    public Repository getRepository() {
        return repository;
    }

    @Autowired
    public void setRepository(Repository repository) {
        this.repository = repository;
    }

    public void saveData(String data) throws Exception {
        try {
            repository.persistMessage(data);
        } catch (Exception ex) {
            throw ex;
        }

    }
}
