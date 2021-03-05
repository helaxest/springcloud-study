package com.hyy.springcloud.controller;


import com.hyy.springcloud.pojo.Dept;
import com.hyy.springcloud.service.DeptService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description
 *
 * @author helaxest
 * @date 2021/02/28  13:28
 * @mail:
 * @since JDK 1.8
 */
@RestController
public class DeptController {
    @Autowired
    private DeptService deptService;


    @GetMapping("/dept/get/{id}")
    @HystrixCommand(fallbackMethod = "HystrixGet")
    public Dept getDept(@PathVariable("id") Long id) {

        Dept dept = deptService.queryById(id);
        if (dept == null) {
            throw new RuntimeException("id=>" + id + ",不存在该用户，或无法找到");
        }
        return dept;
    }

    public Dept HystrixGet(@PathVariable("id") Long id) {

        return new Dept()
                .setDeptno(id)
                .setDname("id=>" + id + "没有对应信息，null -----@hystrix")
                .setDb_source("no data in database!!");
    }

}
