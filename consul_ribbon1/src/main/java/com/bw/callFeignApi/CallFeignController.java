package com.bw.callFeignApi;


import com.bw.feignApi.testFeignController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CallFeignController {

        @Autowired
        private testFeignController testfeigncontroller;

        @RequestMapping("testfeign/{name}")
        public String callfeign(@PathVariable String name)
        {
            String callfeign = testfeigncontroller.callfeign(name);
            return callfeign;
        }
}
