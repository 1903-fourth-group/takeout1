package com.hellojava.controller;


import com.hellojava.entity.User;
import com.hellojava.service.UserService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @ResponseBody
    @RequestMapping(value = "/checkLogin/{userName}/{userPassword}",method = RequestMethod.GET)
    @ApiOperation (value = "登录验证")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "query", name = "userName", value = "用户名", required = true, dataType = "String") ,
            @ApiImplicitParam(paramType = "query", name = "userPassword", value = "密码", required = true, dataType = "String") ,
    })
    public Integer checkLogin(@RequestParam("userName") String userName, @RequestParam("userPassword")String userPassword){
        System.out.println (userName+"+"+userPassword);
        int res = userService.checkLogin (userName,userPassword);
        return res;
    }

    @ResponseBody
    @RequestMapping(value = "/loadAll",method = RequestMethod.GET)
    @ApiOperation (value = "查询所有用户信息")
    public List<User> loadAll(){
        List<User> userList = userService.loadAll ();
        return userList;
    }

    @RequestMapping(value = "index",method = RequestMethod.GET)
    @ApiOperation("测试")
    public void loadsAll(){
        System.out.println(11111);
    }
}
