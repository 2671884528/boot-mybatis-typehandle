package com.gyg.service.impl;

import com.gyg.entity.User;
import com.gyg.mapper.UserMapper;
import com.gyg.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * @Classname UserServiceImpl
 * @Date 2021/7/4 12:43
 * @Author by gyg
 * @Description TODO
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public void insertOne(User user) {
        userMapper.insertOne(user);
    }

    @Override
    public User selectOne(Integer id) {
        return userMapper.selectOne(id);
    }

    @Override
    public void insertUser(User user) {
        userMapper.insertUser(user);
    }


}
