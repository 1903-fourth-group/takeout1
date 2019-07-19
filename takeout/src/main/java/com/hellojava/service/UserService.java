package com.hellojava.service;


import com.hellojava.entity.User;

import java.util.List;

public interface UserService {
    int checkLogin(String userName,String userPassword);
    List<User> loadAll();
}
