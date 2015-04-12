package ru.kpfu.itis.spring.lec04.lab01.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import ru.kpfu.itis.spring.lec04.lab01.model.Greeting;

/**
 * Created by Admin on 10.04.2015.
 */
@Controller
public class GreetController {

    @RequestMapping(value = "/greet", method = RequestMethod.GET)
    public String getGreet() {
        return "greet";
    }

    @RequestMapping(value = "/greet", method = RequestMethod.POST)
    public @ResponseBody String greet(@RequestBody String body) {
        return body;
    }

    @RequestMapping(value = "/json_greet", method = RequestMethod.POST)
    public @ResponseBody Greeting simpleJsonGreet(@RequestBody Greeting greet) {
        greet.setGreetMessage(greet.getGreetMessage().toUpperCase());
        return greet;
    }
}
