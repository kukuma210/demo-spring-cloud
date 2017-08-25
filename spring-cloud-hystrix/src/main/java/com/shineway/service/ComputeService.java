package com.shineway.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by Administrator on 2017/8/21.
 */

@Service
public class ComputeService {

    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod="addServiceFallback")
    public String addService()
    {
        return restTemplate.getForEntity("http://COMPUTER-SERVICE/add?a=10&b=20",String.class).getBody();
    }

    public String addServiceFallback()
    {
        return "Error";
    }
}
