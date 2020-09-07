package com.aiguigu.springCloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName: OrderConsulMain80
 * @Description TODO:
 * @Author: LiZhenxiang
 * @Creat: 2020/7/28 16:42
 * @Update 2020/7/28 16:42
 * @See:
 * @Version: 1.0
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class OrderConsulMain80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderConsulMain80.class,args);
    }
}
