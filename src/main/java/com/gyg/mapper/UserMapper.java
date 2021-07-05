package com.gyg.mapper;

import com.gyg.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @Classname UserMapper
 * @Date 2021/7/4 12:21
 * @Author by gyg
 * @Description TODO
 */
@Mapper
@Repository
public interface UserMapper {
    /**
     * XXX
     * @author gyg
     * @param user
     * @return
     **/
    void insertOne(User user);

    /**
     * XXX
     * @author gyg
     * @param user
     * @return
     **/
    void insertUser(User user);

    /**
     * XXX
     * @author gyg
     * @param id
     * @return
     **/
    User selectOne(Integer id);
}
