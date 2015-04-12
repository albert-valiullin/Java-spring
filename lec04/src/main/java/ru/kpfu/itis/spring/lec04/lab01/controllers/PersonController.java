package ru.kpfu.itis.spring.lec04.lab01.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.AbstractBindingResult;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import ru.kpfu.itis.spring.lec04.lab01.model.Person;

/**
 * Created by Admin on 12.04.2015.
 */
@Controller
public class PersonController {

    @RequestMapping(value = "/person", method = RequestMethod.GET)
    public String person(Model model) {
        Person person = new Person();
        model.addAttribute(person);
        return "person";
    }
    @RequestMapping(value = "/person", method = RequestMethod.POST)
    public @ResponseBody Person createPerson(Person person) {
        person.setName(person.getName().toUpperCase());
        person.setAge(person.getAge() + 5);
        return person;
    }
    @RequestMapping(value = "/personCr", method = RequestMethod.GET)
    public @ResponseBody Person createPersonGet(Person person) {
        person.setName(person.getName().toUpperCase());
        person.setAge(person.getAge() + 5);
        return person;
    }
    @RequestMapping(value = "/personForm", method = RequestMethod.POST)
    public String createPersonForm( Person person, BindingResult bindingResult, ModelAndView modelAndView) {
        if(bindingResult.hasErrors()) {
            bindingResult.getFieldError("age");
            return "person";
        }
        person.setName(person.getName().toUpperCase());
        person.setAge(person.getAge() + 5);
        modelAndView.addObject(person);
        return "person";
    }
}
