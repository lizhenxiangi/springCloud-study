package com.aiguigu.springCloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName: PaymentMain8004
 * @Description TODO:
 * @Author: LiZhenxiang
 * @Creat: 2020/7/28 13:45
 * @Update 2020/7/28 13:45
 * @See:
 * @Version: 1.0
 **/
@SpringBootApplication
@EnableDiscoveryClient  //该注解用于想使用consul或者zookeeper作为注册中心时注册服务
public class PaymentMain8004 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentMain8004.class,args);
    }
}
