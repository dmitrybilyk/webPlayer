package com.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.JstlView;

import java.sql.SQLException;

/**
 * Created by dmitry on 12.03.18.
 */
@Controller
//@RequestMapping(value = "/mvc")
public class PlayerController {

//    @Autowired
//    private DepartmentService departmentService;
//    DepartmentService departmentService = new DepartmentServiceImpl(new DepartmentsDaoOracleImpl());

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index() throws SQLException, ClassNotFoundException {
        return "index";
    }

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public ModelAndView playing() throws SQLException, ClassNotFoundException {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index");
        modelAndView.addObject("testValue", "playing");
        return modelAndView;
    }

    @RequestMapping(value = "/pause", method = RequestMethod.GET)
    public ModelAndView pause() throws SQLException, ClassNotFoundException {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index");
        modelAndView.addObject("testValue", "paused");
        return modelAndView;
    }

}
