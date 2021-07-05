package com.gyg.service.impl;


import com.gyg.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Classname UserServiceImplTest
 * @Date 2021/7/4 12:47
 * @Author by gyg
 * @Description TODO
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class UserServiceImplTest {

    @Autowired
    UserServiceImpl userService;

    @Test
    public void insert() {
        User user = new User();
        user.setName("曹安");
        userService.insertOne(user);
        System.out.println("插入成功！");
    }

    @Test
    public void selectOne() {
        User user = userService.selectOne(1);
        if (user != null) {
            System.out.println(user.toString());
        }
    }

    @Test
    public void insertUser() {
        User user = new User();
        user.setName("刘德华");
        try {
            userService.insertUser(user);
        }catch (Exception ignored){}
        System.out.println("插入成功！");

    }
}