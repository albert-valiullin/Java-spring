package ru.kpfu.itis.spring.lec04.lab01.controllers;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import ru.kpfu.itis.spring.lec04.lab01.model.Greeting;

/**
 * Created by Admin on 10.04.2015.
 */
@Controller
@RequestMapping("/entity")
public class GreetEntityController {

    @RequestMapping(value = "/greet", method = RequestMethod.GET)
    public String getGreet() {
        return "greet";
    }

    @RequestMapping(value = "/greet", method = RequestMethod.POST)
    public ResponseEntity<String> greet(HttpEntity<String> body) {
        return new ResponseEntity<String>(body.getBody(), HttpStatus.CREATED);
    }

    @RequestMapping(value = "/json_greet", method = RequestMethod.POST)
    public ResponseEntity<Greeting> simpleJsonGreet(HttpEntity<Greeting> entity) {
        Greeting greet = new Greeting(entity.getBody().getGreetMessage().toUpperCase());
        HttpHeaders headers = new HttpHeaders();
        headers.set("Location", "/entity/json_greet/new/1");
        return new ResponseEntity<Greeting>(greet, headers, HttpStatus.CREATED);
    }
}
