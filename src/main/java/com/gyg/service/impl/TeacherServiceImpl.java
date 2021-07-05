package com.gyg.service.impl;

import com.gyg.entity.Teacher;
import com.gyg.mapper.TeacherMapper;
import com.gyg.service.TeacherService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Classname TeacherServiceImpl
 * @Date 2021/7/4 22:43
 * @Author by gyg
 * @Description TODO
 */
@Service
public class TeacherServiceImpl implements TeacherService {

    final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    TeacherMapper teacherMapper;

    @Override
    public void insertOne(Teacher teacher) {
        teacherMapper.insertTeacher(teacher);
        logger.info("{}插入成功","教师");
        logger.debug("{}插入成功","教师");
    }
}
