package com.gyg.mapper;

import com.gyg.entity.Teacher;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @Classname TeacherMapper
 * @Date 2021/7/4 22:44
 * @Author by gyg
 * @Description TODO
 */
@Mapper
//@Repository
public interface TeacherMapper {
    /**
     * XXX
     * @author gyg
     * @param teacher
     * @return
     **/
    void insertTeacher(Teacher teacher);
}
