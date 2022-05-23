package com.example.springbootwithadminclient.controller;


import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @GetMapping("/welcome")
    public String getMessage(){
        return "welcome amma nanna";
    }
}
