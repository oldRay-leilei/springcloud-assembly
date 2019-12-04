package com.bw;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ribboServer02 {

    public static void main(String[] args) {
        SpringApplication.run(ribboServer02.class);
    }

    /*健康检查*/
    @RequestMapping("/testHelth")
    public String testHelth()
    {
        System.out.println("=====================————通过健康检查————+++++++++++++++++++++++++++=");
        return "ok";
    }
}
