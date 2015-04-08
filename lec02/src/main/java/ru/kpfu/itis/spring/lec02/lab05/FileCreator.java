package ru.kpfu.itis.spring.lec02.lab05;

import javax.annotation.PostConstruct;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by Admin on 07.04.2015.
 */
public class FileCreator {

    private String fileName;

    public FileCreator(String fileName) {
        this.fileName = fileName;
    }

    @PostConstruct
    public void writeFile() {
        try {
            FileWriter fileWriter = new FileWriter(fileName);
            fileWriter.write("Bla-bla-bla");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
