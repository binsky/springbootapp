package com.example.springbootapp.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/")
public class ApiController {

    @RequestMapping(path = "greet/{name}", method = RequestMethod.GET)
    public String greetings(@PathVariable (name = "name") String name) {
        return "What's up, " + name;
    }
}
