package com.liu.controller;

import com.liu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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
}
