package com.bw.hystrix;


import com.bw.feignApi.testFeignController;
import org.springframework.stereotype.Component;

@Component
public class testHystrix implements testFeignController {
    @Override
    public String callfeign(String name) {
        System.out.println("实例已被调用");
        return "服务出错404";
    }
}
