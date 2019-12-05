package com.bw.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Value("${server.port}")
    private String port;

    @RequestMapping("/testfeign/{name}")
    public String testfeign(@PathVariable("name") String name)
    {
        if("1".equals(name))
        {
            System.out.println("出错了");
        }
        System.out.println("-------------------->"+name+"<------------------------------");
        return name;
    }
}
