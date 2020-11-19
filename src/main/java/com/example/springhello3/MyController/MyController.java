package com.example.springhello3.MyController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class MyController {
    @GetMapping("/name")
    public Map get() {
        return Map.of("name","pc");
    }
}
