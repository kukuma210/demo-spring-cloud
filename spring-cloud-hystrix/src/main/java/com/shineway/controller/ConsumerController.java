package com.shineway.controller;

import com.shineway.service.ComputeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017/8/21.
 */
@RestController
public class ConsumerController {

    @Autowired
    private ComputeService    computeService;

    @RequestMapping("/add")
    public  String add()
    {
        return computeService.addService();
    }
}
