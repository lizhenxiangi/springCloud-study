package com.aiguigu.springCloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @ClassName: OrderHystrixMain80
 * @Description TODO:
 * @Author: LiZhenxiang
 * @Creat: 2020/8/6 11:01
 * @Update 2020/8/6 11:01
 * @See:
 * @Version: 1.0
 **/
@SpringBootApplication
@EnableFeignClients
@EnableHystrix
public class OrderHystrixMain80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderHystrixMain80.class,args);
    }
}
