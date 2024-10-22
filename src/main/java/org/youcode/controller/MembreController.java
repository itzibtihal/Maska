package org.youcode.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class MembreController {

    @GetMapping("/")
    public ModelAndView index() {
        return new ModelAndView("index", "message", "Hello, Spring MVC!");
    }

}
