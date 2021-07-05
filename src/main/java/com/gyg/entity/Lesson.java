package com.gyg.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Classname Lesson
 * @Date 2021/7/4 23:24
 * @Author by gyg
 * @Description TODO
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Lesson {
    Integer id;
    Integer tid;
    String name;
}
