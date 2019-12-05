package com.bw;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableZuulProxy
@RestController
public class zuulServer {
    public static void main(String[] args) {
        SpringApplication.run(zuulServer.class);
    }

    @RequestMapping("/testHealth")
    public String testHealth()
    {
        System.out.println("========================+健康检查服务调用+===================================");
        return "ok";
    }
}
