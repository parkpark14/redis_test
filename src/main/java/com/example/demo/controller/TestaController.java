package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.serviceImpl.TestaServiceImpl;

@RestController
public class TestaController {
    
    @Autowired
    private TestaServiceImpl testaService;

    @GetMapping(value = "getTesta/{key}")
    public int getTesta(@PathVariable("key") int key) {

        int val1 = testaService.testaVal1(key);

        return val1;
    }

    @GetMapping(value = "getTesta1/{key}")
    public int getTesta1(@PathVariable("key") int key) {

        int val1 = testaService.testaVal2(key);

        return val1;
    }
}
