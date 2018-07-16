package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.util.List;

@Controller
public class HomeController {

    @Autowired
    FruitRepository fruitRepository;


    @RequestMapping("/")
    public String fruits(Model model) {
        return "home";
    }

@GetMapping("/showDay")
    public String showDay (@Param("day") String day,Model model){
        System.out.println("Day "+day);
    List<Fruit> fruits = fruitRepository.findByAvailableDay(day);
    System.out.println("fruits :"+fruits);
    model.addAttribute("listResult",fruits);
    return  "detail";
}


    @GetMapping("/add")
    public String addfruit(Model model){

        model.addAttribute("fruit", new Fruit());
        model.addAttribute("fruits",fruitRepository.findAll());
        return "datail";
    }

    @PostMapping("/processFruit")
    public String processCourse(@ModelAttribute("fruit") Fruit fruit) {
        fruitRepository.save(fruit);
        return "detail";
    }

    @RequestMapping("/update/{id}")
    public String fruitUpdate(@PathVariable("id") long id, Model model){
        model.addAttribute("fruit", fruitRepository.findById(id));
        return "admin";
    }

    @RequestMapping("/delete/{id}")
    public String fruitDelete(@PathVariable("id") long id){
        fruitRepository.deleteById(id);
        return "admin:/";
    }

}

