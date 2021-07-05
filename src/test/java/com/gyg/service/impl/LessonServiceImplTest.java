package com.gyg.service.impl;

import com.gyg.entity.Lesson;
import com.gyg.service.LessonService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * @Classname LessonServiceImplTest
 * @Date 2021/7/5 0:07
 * @Author by gyg
 * @Description TODO
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class LessonServiceImplTest {
    @Autowired
    LessonService lessonService;

    @Test
    public void insertOne(){
        Lesson lesson = new Lesson();
        lesson.setTid(1);
        lesson.setName("JAVA开发");
        lessonService.insertOne(lesson);
    }

}