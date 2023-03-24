package com.example.rex.demo.controller;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.rex.demo.service.DemoService;
import com.example.rex.demo.entity.Person;


@RestController
class DemoController{
    // init logger
    private static final Logger logger = LoggerFactory.getLogger(DemoController.class);
    @RequestMapping("/hello")
    public String hello(){
        return "Hello World";
    }

    private DemoService demoService;

    @RequestMapping("/saveBasicInfo")
    public String saveBasicInfo(@RequestBody Person person){
        // print the person
        logger.info(person.getName());
        logger.info(person.getSurname());
        return "saveBasicInfo";
    }
}