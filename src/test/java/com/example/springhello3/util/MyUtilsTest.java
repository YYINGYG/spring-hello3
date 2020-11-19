package com.example.springhello3.util;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MyUtilsTest {
    @Test
    @DisplayName("输入1+1，预期为2")
    public void test_add(){
        Assertions.assertEquals(2, MyUtils.add(1, 1));
    }

}
