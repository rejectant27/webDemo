package com.example.webdemo;

import com.example.webdemo.service.Test;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebDemoApplication implements InitializingBean {

    public static void main(String[] args) {

        SpringApplication.run(WebDemoApplication.class, args);
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println(Test.testHuToolUtil());
        System.out.println(Test.getWhatType("dddddddddddddddddddddddddddddddddddd"));
    }
}
