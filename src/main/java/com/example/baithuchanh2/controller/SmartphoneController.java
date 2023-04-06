package com.example.baithuchanh2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SmartphoneController {
    @GetMapping("/")
    public String showAll(){
        return "/list";
    }
}
