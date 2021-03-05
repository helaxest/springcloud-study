package com.hyy.springcloud.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * Description
 *
 * @author helaxest
 * @date 2021/02/28  12:47
 * @mail:
 * @since JDK 1.8
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)  //链式写法
public class Dept implements Serializable {
    private Long deptno;
    private String dname;
    private String db_source;
}
