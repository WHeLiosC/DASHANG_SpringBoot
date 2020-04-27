package com.dashang.controller;

import com.dashang.model.Result;
import com.dashang.model.User;
import com.dashang.model.UserDomain;
import com.dashang.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/showAllUsers")
    public List<UserDomain> showAllUsers() {
        return userService.getUsers();
    }

    @PostMapping("/login")
    public Result login(@RequestBody User user) {
        return userService.login(user);
    }

    @RequestMapping("/register")
    public Result register(@RequestBody User user) {
        return userService.register(user);
    }

    @RequestMapping("/modifyInfo")
    public Result modifyInfo(@RequestBody UserDomain ud) {
        return userService.modifyInfo(ud);
    }

}

// @RequestMapping如果没有指定请求方式，将接收Get,Post,Head,Options等所有的请求方式。
// @GetMapping是一个组合注解，是@RequestMapping(method = RequestMethod.GET)的缩写。 
// @PostMapping是一个组合注解，是@RequestMapping(method = RequestMethod.POST)的缩写。

// @CrossOrigin 解决跨域请求问题
