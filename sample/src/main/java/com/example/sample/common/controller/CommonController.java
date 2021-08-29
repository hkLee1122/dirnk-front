package com.example.sample.common.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CommonController {
    protected Logger logger = LogManager.getLogger(CommonController.class);
/*
    @RequestMapping(value = "/{depth1}")
    public String proxyRedirect (){

        logger.error("#############");

        return "forward:/";
    }
    */
}
