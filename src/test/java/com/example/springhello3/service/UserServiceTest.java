package com.example.springhello3.service;

import com.example.springhello3.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
@Slf4j
public class UserServiceTest {
    @Autowired
    private UserService userService;

    @Test
    public void test_user() {
        User user = new User("pc","aa");
        log.debug(user.getName());
        log.debug(user.toString());
    }

    @Test
    public void test_logging() {
        String str = "aa";
        //先拼接字符串后判断日志级别，浪费资源
        log.debug("log debug" + str);
        //使用占位符  {}   先判断日志级别
        log.debug("log debug{}{}{}",str,str,str);
    }

    @Test
    @DisplayName("输入1+1，预期为2")
    public void test_add() {
        Assertions.assertEquals(2, userService.add(1, 1));
    }

    @Test
    public void test_addString() {
        Assertions.assertThrows(Exception.class, () -> {
            userService.addString("bb");
        });
    }
}
