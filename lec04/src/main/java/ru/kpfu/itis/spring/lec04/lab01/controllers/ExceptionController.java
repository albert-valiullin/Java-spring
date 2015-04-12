package ru.kpfu.itis.spring.lec04.lab01.controllers;

import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.nio.file.AccessDeniedException;

/**
 * Created by Admin on 12.04.2015.
 */
@Controller
public class ExceptionController {
    @RequestMapping("/data_access")
    public @ResponseBody String except() throws DataAccessException {
        throw new DataAccessException("data access exception") {
        };
    }
    @RequestMapping("/access_denied")
    public @ResponseBody String accDen() throws AccessDeniedException {
        throw new AccessDeniedException("access denied exception");
    }

    @RequestMapping("/errors/dataAccessFailure")
    public String dataAccFail(ModelAndView modelAndView){
        modelAndView.addObject("msg_title", "dataAccessFailure");
        modelAndView.addObject("msg", "data access exception");
        return "error";
    }

    @ExceptionHandler(AccessDeniedException.class)
    public ModelAndView accDenExc(AccessDeniedException ex) {
        ModelAndView modelAndView = new ModelAndView("error");
        modelAndView.addObject("msg_title", "AccessDeniedException");
        modelAndView.addObject("msg", ex.getMessage());
        return modelAndView;
    }
}
