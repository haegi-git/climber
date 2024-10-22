package com.climber.climber.test;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class TestController {

    @GetMapping("/api/test")
    public String hello() {
        return "hello";
    }

    @GetMapping("/")
    public @ResponseBody String test() {
        return "test";
    }
}