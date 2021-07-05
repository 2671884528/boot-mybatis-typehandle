package com.gyg.entity;

import com.sun.tracing.dtrace.ArgsAttributes;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @Classname User
 * @Date 2021/7/4 12:20
 * @Author by gyg
 * @Description TODO
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class User {
    Integer id;
    String name;
}
