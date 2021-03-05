package com.hyy.springcloud.service;

import com.hyy.springcloud.pojo.Dept;

import java.util.List;

/**
 * Description
 *
 * @author helaxest
 * @date 2021/02/28  13:23
 * @mail:
 * @since JDK 1.8
 */
public interface DeptService {
    public boolean addDept(Dept dept);
    public Dept queryById(Long id);
    public List<Dept> queryAll();
}
