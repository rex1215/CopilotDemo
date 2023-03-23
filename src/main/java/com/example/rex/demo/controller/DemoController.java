package com.example.rex.demo.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.rex.demo.service.DemoService;


@RestController
class DemoController{
    @RequestMapping("/hello")
    public String hello(){
        return "Hello World";
    }

    private DemoService demoService;

    @RequestMapping("/saveBasicInfo")
    public String saveBasicInfo(@RequestBody String body){
        System.out.println(body);
        // TODO: save to database
        demoService.saveBasicInfo(body);
        // parse the body to Object
        
        return "saveBasicInfo";
    }
}