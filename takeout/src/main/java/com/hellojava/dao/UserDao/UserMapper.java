package com.hellojava.dao.UserDao;

import com.hellojava.entity.User;

import java.util.List;

public interface UserMapper {
    //     查询全部
    List<User> findAll();
    //     登录
    User findOneByUser(User user);
    //     注册
    void addUser(User user);
}
