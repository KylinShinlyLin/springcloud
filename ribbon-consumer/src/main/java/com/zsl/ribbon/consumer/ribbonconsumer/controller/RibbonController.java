package com.zsl.ribbon.consumer.ribbonconsumer.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.zsl.ribbon.consumer.ribbonconsumer.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Create by ZengShiLin on 2018-01-17
 */
@RestController
public class RibbonController {

    @Autowired
    RestTemplate restTemplate;


    @GetMapping("/get/{id}")
    @HystrixCommand(fallbackMethod = "fallbackMe")
    public User getUser(@PathVariable Long id){
        System.out.println("收到的id是："+id);
        return restTemplate.getForObject("http://USER-SERVICE/user/"+id,User.class);
    }

    /**
     * 熔断器
     */
    public User fallbackMe(Long id){
        User user = new User();
        user.setName("服务发生断路");
        user.setAge("断开");
        user.setPort("disconnection");
        return user;
    }


}
