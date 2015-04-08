package ru.kpfu.itis.spring.lec02.lab02;

import org.springframework.beans.factory.FactoryBean;

/**
 * Created by Admin on 07.04.2015.
 */
public class StringBuilderFactoryBean implements FactoryBean<StringBuilder>{
    private String start;
    private String middle;
    private String finish;

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getMiddle() {
        return middle;
    }

    public void setMiddle(String middle) {
        this.middle = middle;
    }

    public String getFinish() {
        return finish;
    }

    public void setFinish(String finish) {
        this.finish = finish;
    }

    public StringBuilder getObject() throws Exception {
        return new StringBuilder().append(start).append(middle).append(finish);
    }

    public Class<?> getObjectType() {
        return StringBuilder.class;
    }

    public boolean isSingleton() {
        return true;
    }
}
