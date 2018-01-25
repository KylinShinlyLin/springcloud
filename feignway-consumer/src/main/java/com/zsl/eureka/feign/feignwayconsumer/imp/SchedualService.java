package com.zsl.eureka.feign.feignwayconsumer.imp;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.zsl.eureka.feign.feignwayconsumer.entity.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Create by ZengShiLin on 2018-01-25
 */
@FeignClient(value = "user-service")
public interface SchedualService {
    @RequestMapping(value = "/user/{id}",method = RequestMethod.GET)
    User sayHiFromClientOne(@PathVariable("id") Long id);
}
