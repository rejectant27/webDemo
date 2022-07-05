package com.example.webdemo.service;

import cn.hutool.core.date.DateUtil;

import java.time.LocalDateTime;

public class Test {

    public static String getWhatType(String str){
        return "The content you type is " +str;
    }

    public static String testHuToolUtil(){
//        DateUt
        return DateUtil.format(LocalDateTime.now(),"yyyy-MM-dd");
    }

}
