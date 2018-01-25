package com.zsl.eureka.feign.feignwayconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@SpringBootApplication
@EnableFeignClients
@EnableEurekaClient
@EnableHystrix
public class FeignwayConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(FeignwayConsumerApplication.class, args);

	}
}
