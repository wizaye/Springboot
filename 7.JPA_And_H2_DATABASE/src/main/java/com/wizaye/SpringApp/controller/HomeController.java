package com.wizaye.SpringApp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @RequestMapping("/")
    // we don't use controller because we cant return welcome to app page as it doesnt exist
    // instead we share the state in the return type
    public String greet(){
       return "Welcome to the APP";
    }
    @RequestMapping("/about")
    public String about(){
        return "Welcome to the about page";
    }
}
