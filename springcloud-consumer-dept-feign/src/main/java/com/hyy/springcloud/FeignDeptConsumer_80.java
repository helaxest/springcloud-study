package com.hyy.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * Description
 *
 * @author helaxest
 * @date 2021/02/26  12:48
 * @mail:
 * @since JDK 1.8
 */
//ribbon和eureka整合后 客户端可以直接用 不用关关心ip 端口
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages= {"com.hyy.springcloud"})
public class FeignDeptConsumer_80 {
    public static void main(String[] args) {
        SpringApplication.run(FeignDeptConsumer_80.class,args);
    }
}
