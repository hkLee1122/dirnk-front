package com.example.sample.ship.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/ship/")
public class ShipmainController {
    protected Logger logger = LogManager.getLogger(ShipmainController.class);

    @RequestMapping(value="test")
    public String shipTest(){

        logger.debug("vue test debug");


        return "";
    }

}
