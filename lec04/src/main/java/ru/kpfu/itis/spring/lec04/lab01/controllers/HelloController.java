package ru.kpfu.itis.spring.lec04.lab01.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Admin on 10.04.2015.
 */
@Controller
public class HelloController {
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String getHello() {
        return "hello";
    }

    @RequestMapping(value = "/hello/{sayHello}",method = RequestMethod.POST)
    public ModelAndView postHello(@PathVariable String sayHello, @RequestParam String inp) {
        ModelAndView modelAndView = new ModelAndView("hello");
        modelAndView.addObject("message", sayHello);
        modelAndView.addObject("inp", inp);
        System.out.println(sayHello);
        return modelAndView;
    }
}
