package com.bw.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping("/testfeign")
    public String testfeign(String name)
    {
        if(name.equals("1"))
        {
            throw new RuntimeException("+=========fackbackerror=========");
        }
        System.out.println("====================实例被启用============================");
        return name;
    }
}
