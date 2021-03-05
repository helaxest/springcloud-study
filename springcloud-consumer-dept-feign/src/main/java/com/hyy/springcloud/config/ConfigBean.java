package com.hyy.springcloud.config;


import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * Description
 *
 * @author helaxest
 * @date 2021/02/26  12:33
 * @mail:
 * @since JDK 1.8
 */
@Configuration
public class ConfigBean {
    //    配置负载均衡，实现RestTemplate
    //    IRule
    //    轮询
    @Bean
    @LoadBalanced //ribbon负载均衡
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}
