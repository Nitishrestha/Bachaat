package com.kat.bachaat.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DefaultController
{
    @GetMapping("/")
    public String index(){
        return "Up & Running";
    }
}
