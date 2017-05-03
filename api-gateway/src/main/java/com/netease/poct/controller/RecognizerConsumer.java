package com.netease.poct.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by alex on 2017/5/3.
 */
@RestController
public class RecognizerConsumer {

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping(value = "/get")
    public String getHello() {
        return restTemplate.getForEntity("http://RECOGNIZER-SERVICE/getHello?name=alex", String.class).getBody();
    }
}
