package com.gyg.service.impl;

import com.gyg.entity.Grade;
import com.gyg.entity.Grades;
import com.gyg.mapper.GradesMapper;
import com.gyg.service.GradesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Classname GradesServiceImpl
 * @Date 2021/7/5 1:47
 * @Author by gyg
 * @Description TODO
 */
@Service
public class GradesServiceImpl implements GradesService {
    @Autowired
    GradesMapper gradesMapper;

    @Override
    public void insertOne(Grades grades) {
        gradesMapper.insertOne(grades);
    }

    @Override
    public void insertOne2(Grade grade) {
        gradesMapper.insertOne2(grade);
    }

    @Override
    public Grades selectOne(Integer id) {
        return gradesMapper.selectOne(id);
    }

    @Override
    public List<Grades> selectByScore(double score) {
        return gradesMapper.selectByScore(score);
    }
}
