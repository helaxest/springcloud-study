package com.hyy.springcloud.service;

import com.hyy.springcloud.pojo.Dept;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

/**
 * Description
 *
 * @author helaxest
 * @date 2021/02/28  12:24
 * @mail:
 * @since JDK 1.8
 */
@Component
@FeignClient(value = "SPRINGCLOUD-PROVIDER-DEPT",fallbackFactory = DeptClientServiceFallbackFactory.class)
public interface DeptClientService {
//把@GetMapping之类写到接口的方法上
    @GetMapping("/dept/get/{id}")
    public Dept queryById(@PathVariable("id") Long id);
    @GetMapping("/dept/list")
    public List<Dept> queryAll();
    @PostMapping("/dept/add")
    public Boolean addDept(Dept dept);

}
