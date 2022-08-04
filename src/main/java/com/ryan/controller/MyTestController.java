package com.ryan.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Raofy
 */
@RestController
@RequestMapping(value = "test")
public class MyTestController {


    @GetMapping("getInfo")
    public String getInfo() {
        return "Hello, Kubernetes!!!何以解忧，唯有Java！！";
    }
}
