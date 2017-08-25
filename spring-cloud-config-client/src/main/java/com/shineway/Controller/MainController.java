package com.shineway.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017/8/24.
 */
@RestController
public class MainController {

   @Value("${name}")
   private String name;

   //@Value("${cc.dd}")
   @Value("${ni.hao}")
   private String ni;


    @RequestMapping("/test")
    public String test(){

        return ni + name;

    }
}
