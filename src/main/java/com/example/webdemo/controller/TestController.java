package com.example.webdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping
public class TestController {

    @GetMapping("get")
    public String whatYouType(@RequestParam("param") String param) {
        return "what you type is" + param;
    }

    @GetMapping()
    public String firstPage() {
        return "Greetings from Spring Boot " + LocalDateTime.now();
    }
}
