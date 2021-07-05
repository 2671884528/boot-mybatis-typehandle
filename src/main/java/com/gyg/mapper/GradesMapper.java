package com.gyg.mapper;

import com.gyg.entity.Grade;
import com.gyg.entity.Grades;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Classname GradesMapper
 * @Date 2021/7/5 0:32
 * @Author by gyg
 * @Description TODO
 */
@Repository
//@Mapper
public interface GradesMapper {
    /**
     * XXX
     * @author gyg
     * @param grades
     * @return
     **/
    void insertOne(Grades grades);
    void insertOne2(Grade grade);
    Grades selectOne(Integer id);

    List<Grades> selectByScore(double score);
}
