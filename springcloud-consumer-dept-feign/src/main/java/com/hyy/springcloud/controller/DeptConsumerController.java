package com.hyy.springcloud.controller;


import com.hyy.springcloud.pojo.Dept;
import com.hyy.springcloud.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


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
    // 消费者，不应该有Service层
//  (url,  实体 ,map ,class<T> responseType
//    private static final  String REST_URL_PREFIX="http://localhost:8001";
//    ribbon,地址应为变量，通过服务名访问



    @Resource
    private DeptClientService service=null;

    @RequestMapping("/consumer/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id) {
       return this.service.queryById(id);
    }

    @RequestMapping("/consumer/dept/add")
    public boolean add(Dept dept) {
      return this.service.addDept(dept);
    }

    @RequestMapping("/consumer/dept/list")
    public List<Dept> list() {
       return this.service.queryAll();
    }

}
