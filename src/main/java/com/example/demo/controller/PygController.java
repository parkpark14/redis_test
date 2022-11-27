package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PygController {
    
    @GetMapping(value = "pyg")
    public String pyg() {
        return "pyg";
    }
}
