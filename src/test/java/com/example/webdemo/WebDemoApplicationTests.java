package com.example.webdemo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class WebDemoApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    void contextLoads2() {
        System.out.println(com.example.webdemo.service.Test.testHuToolUtil());
        System.out.println(com.example.webdemo.service.Test.getWhatType("dddddddddddddddddddddddddddddddddddd"));
    }



}
