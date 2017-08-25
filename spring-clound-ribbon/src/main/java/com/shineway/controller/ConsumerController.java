package com.shineway.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by Administrator on 2017/8/21.
 */

@RestController
public class ConsumerController {

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping(value = "/add")
    public String  Add() {
        return restTemplate.getForEntity("http://COMPUTER-SERVICE/add?a=10&b=20", String.class).getBody();
    }

}
