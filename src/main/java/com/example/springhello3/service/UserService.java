package com.example.springhello3.service;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    public int add(int x, int y) {
        return x + y;
    }

    public void addString(String str) {
        List.of("aa").add(str);
    }
}
