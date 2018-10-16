package com.liu;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2018/10/17/017.
 */
@RestController
public class Hello {
    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }
}
