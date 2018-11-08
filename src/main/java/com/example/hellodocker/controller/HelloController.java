package com.example.hellodocker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xn
 * 2018/11/8 14:31
 */
@RestController
public class HelloController {

    @GetMapping("hello")
    public String hello(){
        return "{\"data\":\"hello docker!\"}";
    }
}
