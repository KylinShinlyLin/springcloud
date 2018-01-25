package com.zsl.provider.user.controller;

import com.zsl.provider.user.entity.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Create by ZengShiLin on 2018-01-17
 */
@RestController
public class UserController {

    @Value("${server.port}")
    String port;

    @GetMapping("/user/{id}")
    public User getUser(@PathVariable Long id){
        System.out.println("获取的id值为："+id);
        User user = new User();
        user.setName("张三");
        user.setAge("19");
        user.setPort(port);
        return user;
    }
}
