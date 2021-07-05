package com.gyg.service;

import com.gyg.entity.Grade;
import com.gyg.entity.Grades;

import java.util.List;

/**
 * @Classname GradesService
 * @Date 2021/7/5 1:46
 * @Author by gyg
 * @Description TODO
 */
public interface GradesService {
    /**
     * 插入
     * @param grades
     */
    void insertOne(Grades grades);
    void insertOne2(Grade grade);

    Grades selectOne(Integer id);
    /**
     * 通过平均分查询
     * @author gyg
     * @param score
     * @return
     **/
    List<Grades> selectByScore(double score);
}
