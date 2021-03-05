package com.hyy.springcloud.dao;

import com.hyy.springcloud.pojo.Dept;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Description
 *
 * @author helaxest
 * @date 2021/02/28  13:00
 * @mail:
 * @since JDK 1.8
 */
@Mapper
@Repository
public interface DeptDao {
    boolean addDept(Dept dept);
    Dept queryById(Long id);
    List<Dept> queryAll();
}
