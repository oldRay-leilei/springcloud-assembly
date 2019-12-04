package com.bw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableFeignClients
@EnableCircuitBreaker /*开启熔断器*/
public class ribboServer01 {

    public static void main(String[] args) {
        SpringApplication.run(ribboServer01.class);
    }
    @RequestMapping("/testHelth")
    public String testHelth()
    {
        System.out.println("+++++++++***健康检查已生效****++++++++++++=");
        return "ok";
    }
}
