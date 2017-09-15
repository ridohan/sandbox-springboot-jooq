package com.ridohan.sandbox.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @RequestMapping("/greeting")
    public String greeting(@RequestParam(value="name", defaultValue="my friend") String name) {
        return "Greetings "+name+" let's take a journey ...";
    }
}
