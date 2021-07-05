package com.gyg.service.impl;

import com.gyg.entity.Grade;
import com.gyg.entity.Grades;
import com.gyg.service.GradesService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @Classname GradesServiceImplTest
 * @Date 2021/7/5 9:43
 * @Author by gyg
 * @Description TODO
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class GradesServiceImplTest {
    @Autowired
    GradesService gradesService;

    @Test
    public void insertOne(){
        Grades grades = new Grades();
        grades.setLid(1);
        grades.setTid(1);
        grades.setUid(8);
        grades.setScore(87.4);
        grades.setPass(true);
        try {
            gradesService.insertOne(grades);
        }catch (Exception ignored){};
        System.out.println("插入完成！");
    }

    @Test
    public void insertOne2(){
        Grade grades = new Grade();
        grades.setLid(1);
        grades.setTid(1);
        grades.setUid(2);
        grades.setScore(98.1);
        grades.setPass(1);
        try {
            gradesService.insertOne2(grades);
            System.out.println("插入完成！");
        }catch (Exception ignored){};
    }

    @Test
    public void selectOne(){
        Grades grades = gradesService.selectOne(1);
        if (grades!=null) {
            System.out.println(grades.toString());
        }
    }

    @Test
    public void selectByScore(){
        List<Grades> gradesList = gradesService.selectByScore(60);
        if (gradesList!=null) {
            gradesList.forEach((e)->{
                System.out.println(e.toString());
            });
        }
    }
}