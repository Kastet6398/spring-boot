package com.example.springboot.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Objects;

@Controller
public class HelloController {
    private DataModel someData;

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("someData", someData);
        return "index";
    }

    @GetMapping("/form")
    public String form(Model model) {
        model.addAttribute("someData", Objects.requireNonNullElseGet(someData, () -> new DataModel(0, "Default", false)));
        return "form";
    }

    @PostMapping("/form")
    public String submitForm(DataModel someData) {
        this.someData = someData;
        return "redirect:/";
    }

}
