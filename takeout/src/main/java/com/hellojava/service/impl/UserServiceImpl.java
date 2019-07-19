package com.hellojava.service.impl;

//import com.hellojava.dao.UserDao.UserMapper;
import com.hellojava.dao.UserDao.UserRepository;
import com.hellojava.entity.User;
import com.hellojava.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    //@Autowired
    //private UserMapper userMapper;
    @Autowired
    private UserRepository userRepository;
    @Override
    public int checkLogin(String userName , String userPassword) {
        User userInfo = userRepository.findUserByUserNameAndUserPassword (userName,userPassword);
        System.out.println (userInfo);
        if (userInfo ==null)
            return 0;
        return 1;
    }

    @Override
    public List<User> loadAll(){
        return userRepository.findAll ();
    }
}
