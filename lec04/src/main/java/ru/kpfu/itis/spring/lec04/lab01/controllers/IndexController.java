package ru.kpfu.itis.spring.lec04.lab01.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Admin on 12.04.2015.
 */
@Controller
public class IndexController {
    @RequestMapping(value = "/")
    public String indexGet() {
        return "index";
    }
}
