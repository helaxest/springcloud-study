package com.hyy.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Description
 *
 * @author helaxest
 * @date 2021/02/28  21:09
 * @mail:
 * @since JDK 1.8
 */
@SpringBootApplication
@EnableEurekaServer
public class Eureka_Server_7001 {
    public static void main(String[] args) {
        SpringApplication.run(Eureka_Server_7001.class,args);
    }
}

