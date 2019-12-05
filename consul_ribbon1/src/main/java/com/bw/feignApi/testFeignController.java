package com.bw.feignApi;


import com.bw.hystrix.testHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "ribbon-server02",fallback = testHystrix.class)
public interface testFeignController {
    @RequestMapping("/testfeign/{name}")
    public String callfeign(@RequestParam(name = "name") String name);
}
