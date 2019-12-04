package com.bw.config;


import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/*全局配置负载均衡配置*/
@Configuration
public class TestConfig {

@Bean
    @LoadBalanced
    public RestTemplate getResttemplate()
    {
            return  new RestTemplate();
    }

    @Bean
    public IRule randdomRule()
    {
        return new RoundRobinRule();
    }
}
