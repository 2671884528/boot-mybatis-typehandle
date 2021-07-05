package com.gyg.service.impl;

import com.gyg.entity.Teacher;
import com.gyg.service.TeacherService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Classname TeacherServiceImplTest
 * @Date 2021/7/4 22:51
 * @Author by gyg
 * @Description TODO
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class TeacherServiceImplTest {
    @Autowired
    TeacherService teacherService;

    @Test
    public void insertTeacher(){
        Teacher teacher = new Teacher();
        teacher.setName("杨哥");
        try {
            teacherService.insertOne(teacher);
        }catch (Exception ignored){}
        System.out.println("插入成功！");
    }
}