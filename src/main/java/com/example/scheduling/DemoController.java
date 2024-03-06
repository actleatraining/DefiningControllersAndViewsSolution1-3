package com.example.scheduling;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class DemoController {

    @GetMapping("/ex1")
    String demo1ex1() {
        return "view1.html";
    }

    @GetMapping("/ex2")
    String demo1ex2(Model model) {
        model.addAttribute("dog", new Dog("Pluto", 3));
        return "view2.html";
    }

    @GetMapping("/ex3")
    String demo1ex3(Model model) {
        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog("Pluto", 3));
        dogs.add(new Dog("Ludde", 13));
        dogs.add(new Dog("Chicco", 2));
        model.addAttribute("dogs", dogs);
        return "view3.html";
    }
}
