package com.klodnicki.bike.rest.API.Bike.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Home {

    @GetMapping("/api/v1")
    public String homePage() {
        return "home";
    }
}
