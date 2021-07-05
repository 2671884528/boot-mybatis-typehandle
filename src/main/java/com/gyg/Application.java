package com.gyg;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Classname Application
 * @Date 2021/7/4 12:05
 * @Author by gyg
 * @Description TODO
 */
@SpringBootApplication
@MapperScan("com.gyg.mapper")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
