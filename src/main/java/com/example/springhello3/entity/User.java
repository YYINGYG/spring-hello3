package com.example.springhello3.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;//lomnok 编译时运行
@Data
@AllArgsConstructor
@NoArgsConstructor


public class User {
    private String name;
    private String address;
}
