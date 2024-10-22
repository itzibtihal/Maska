package org.youcode.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.youcode.domain.Membre;
import org.youcode.services.MembreService;
import org.youcode.services.MembreServiceImp;


@Controller
public class MembreController {

    @Autowired
    private MembreService membreService;

    @GetMapping("/")
    public ModelAndView index() {
        return new ModelAndView("index", "message", "Hello, Spring MVC!");
    }


    @GetMapping("/index")
    public String index(Model model) {
        model.addAttribute("membre", new Membre());
        return "add";
    }

//
//    @PostMapping("/save")
//    public String save(@ModelAttribute("membre") Membre membre) {
//        membreService.save(membre);
//        return "redirect:/index";
//    }
}
