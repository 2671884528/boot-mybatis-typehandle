package com.gyg.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @Classname Grades
 * @Date 2021/7/5 0:14
 * @Author by gyg
 * @Description TODO
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Grades {
    Integer id;
    Integer uid;
    Integer lid;
    Integer tid;
    // 注意JAVA  double对应数据库的double，float对应的是REAL，
    // JDBC float对应double，double对应double REAL对应float
    Double score;
    Boolean pass;
}
