package ru.kpfu.itis.spring.lec02.lab05;

import javax.annotation.PostConstruct;
import java.io.File;

/**
 * Created by Admin on 07.04.2015.
 */
public class FileConsumer {

    private String fileName;

    public FileConsumer(String fileName) {
        this.fileName = fileName;
    }

    @PostConstruct
    public void consumeFile() {
        System.out.println(new File(fileName).length());
    }
}
