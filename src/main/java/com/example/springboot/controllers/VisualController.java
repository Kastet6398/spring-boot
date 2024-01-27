package com.example.springboot.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class VisualController {
    private int a;
    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("a", a);
        return "index";
    }
    @PostMapping("/")
    public String indexPost() {
        a++;
        return "redirect:/";
    }
}
