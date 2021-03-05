package com.hyy.springcloud.controller;


import com.hyy.springcloud.pojo.Dept;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.List;

/**
 * Description
 *
 * @author helaxest
 * @date 2021/02/26  12:29
 * @mail:
 * @since JDK 1.8
 */
@RestController
public class DeptConsumerController {
//    消费者，不应该有Service层
//    (url,  实体 ,map ,class<T> responseType
//    private static final  String REST_URL_PREFIX="http://localhost:8001";
//    ribbon,地址应为变量，通过服务名访问
    private static final  String REST_URL_PREFIX="http://SPRINGCLOUD-PROVIDER-DEPT";
    @Resource
    private RestTemplate restTemplate;//提供多种远程访问http，简单restful服务模板


    @RequestMapping("/consumer/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id){
        return restTemplate.getForObject(REST_URL_PREFIX+"/dept/get/"+id, Dept.class);
    }
    @RequestMapping("/consumer/dept/add")
    public boolean add(Dept dept){
        return restTemplate.postForObject(REST_URL_PREFIX+"/dept/add",dept,Boolean.class);
    }
    @RequestMapping("/consumer/dept/list")
    public List<Dept> list(){
        return restTemplate.getForObject(REST_URL_PREFIX+"/dept/list",List.class);
    }

//    public Object discovery(){
////      获取微服务清单
//        client.getServices()
//    }

}
