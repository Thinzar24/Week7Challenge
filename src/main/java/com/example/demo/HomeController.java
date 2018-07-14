package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @Autowired
    FruitRepository fruitRepository;


    @RequestMapping("/")
    public String fruitsDetails(Model model) {
        model.addAttribute("fruits", fruitRepository.findAll());
        model.addAttribute("weekdays", fruitRepository.findAll());
        return "home";
    }


}

