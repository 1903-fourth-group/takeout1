package com.hellojava.dao.UserDao;


import com.hellojava.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.data.jpa.repository.JpaRepository;

@Mapper
public interface UserRepository extends JpaRepository<User,Integer> {
    User findUserByUserNameAndUserPassword(String userName, String userPassword);
}
