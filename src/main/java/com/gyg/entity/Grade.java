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
public class Grade {
    Integer id;
    Integer uid;
    Integer lid;
    Integer tid;
    Double score;
    Integer pass;
}
