package com.mkhululi.app.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HarnessAppController {
    @GetMapping
    public String hello(){
        return "hello-world";
    }
}
