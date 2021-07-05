package com.gyg.service.impl;

import com.gyg.entity.Lesson;
import com.gyg.mapper.LessonMapper;
import com.gyg.service.LessonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Classname LessonServiceImpl
 * @Date 2021/7/5 0:07
 * @Author by gyg
 * @Description TODO
 */
@Service
public class LessonServiceImpl implements LessonService {

    @Autowired
    LessonMapper mapper;

    @Override
    public void insertOne(Lesson lesson) {
        mapper.insertOne(lesson);
    }
}
