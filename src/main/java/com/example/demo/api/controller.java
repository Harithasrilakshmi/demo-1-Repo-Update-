package com.example.demo.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class controller {
    @GetMapping("/current-date")
    public Date currentdate() {
        return new Date();
    }

    @GetMapping("/name")
    public String name() {
        return "hello world";

    }
}
