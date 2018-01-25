package com.zsl.eureka.feign.feignwayconsumer.entity;

/**
 * Create by ZengShiLin on 2018-01-17
 */
public class User {
    private String name;
    private String age;
    private String port;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }
}
