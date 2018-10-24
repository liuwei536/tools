package com.liu.controller;

import com.liu.model.User;
import com.liu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2018/10/17/017.
 */
@RestController
public class HelloController {
    @Autowired
    private UserService userService;

    @RequestMapping("/hello")
    public String hello() {
        return "hello";
    }


    @RequestMapping("/getUserById")
    public Map getUserById(@RequestParam("id") Integer id) {
        return this.userService.getUserById(id);
    }

    @RequestMapping("/selectAllUser")
    public List<User> selectAllUser(@RequestParam("pageNo") Integer pageNo, @RequestParam("pageNum") Integer pageNum) {
        return this.userService.selectAllUser(pageNo, pageNum);
    }
}
