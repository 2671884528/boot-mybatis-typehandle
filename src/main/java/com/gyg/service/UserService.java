package com.gyg.service;

import com.gyg.entity.User;
import org.springframework.stereotype.Service;

/**
 * @Classname UserService
 * @Date 2021/7/4 12:20
 * @Author by gyg
 * @Description TODO
 */
public interface UserService {
    /**
     * @Description:
     * @Author: gyg
     * @Date: 2021/7/4 20:45
     * @param: [user]
     * @return:
     **/
    void insertOne(User user);

   /**
    * XXX
    * @author gyg
    * @param id
    * @return
    **/
    User selectOne(Integer id);

    /**
     * XXX
     * @author gyg
     * @param user
     * @return
     **/
    void insertUser(User user);
}
