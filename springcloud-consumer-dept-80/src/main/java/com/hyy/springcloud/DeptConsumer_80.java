package com.hyy.springcloud;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

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
//微服务启动时加载ribbon类
@RibbonClient(name = "SPRINGCLOUD-PROVIDER-DEPT")
public class DeptConsumer_80 {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer_80.class,args);
    }
}
