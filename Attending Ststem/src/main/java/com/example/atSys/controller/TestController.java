package com.example.atSys.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/hello")
    public String hello(@RequestParam(value = "fuck", defaultValue = "shit") String name){
        return "fuck" + name;
    }
}
