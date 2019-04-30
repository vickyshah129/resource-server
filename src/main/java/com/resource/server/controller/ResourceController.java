package com.resource.server.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResourceController {

    @GetMapping(value ="/test")
    public String getUser(){
        return "SUCCESS";
    }


}
