package com.gyg.mapper;

import com.gyg.entity.Lesson;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @Classname LessonMapper
 * @Date 2021/7/4 23:29
 * @Author by gyg
 * @Description TODO
 */
@Repository
public interface LessonMapper {
    /**
     * XXX
     * @author gyg
     * @param lesson
     * @return
     **/
    void insertOne(Lesson lesson);
}
