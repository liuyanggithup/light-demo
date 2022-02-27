package com.seventeen.lightdemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author xia_xun
 */
@EnableHystrix
@EnableFeignClients
@SpringBootApplication
@MapperScan(basePackages = "com.seventeen.lightdemo.dao.mapper")
public class StartApplication {

    public static void main(String[] args) {
        SpringApplication.run(com.seventeen.lightdemo.StartApplication.class, args);
    }

}
