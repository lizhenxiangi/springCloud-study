package com.aiguigu.springCloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName: PaymentMain9001
 * @Description TODO:
 * @Author: LiZhenxiang
 * @Creat: 2020/8/14 10:53
 * @Update 2020/8/14 10:53
 * @See:
 * @Version: 1.0
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentMain9002 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentMain9002.class,args);
    }
}
