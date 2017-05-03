package com.netease.poct.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by alex on 2017/5/3.
 */
@RestController
public class Recognizer {

    private final Logger logger = Logger.getLogger(getClass());

    @Autowired
    private DiscoveryClient discoveryClient;

    @RequestMapping(value = "getHello")
    public String getHello(@RequestParam String name) {
        ServiceInstance localServiceInstance = discoveryClient.getLocalServiceInstance();
        logger.info("Info : ****** " + localServiceInstance.getHost() + ", *****" + localServiceInstance.getServiceId());
        return "SUCCESS";
    }
}
