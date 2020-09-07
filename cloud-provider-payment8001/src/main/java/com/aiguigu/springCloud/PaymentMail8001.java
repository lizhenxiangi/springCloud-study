package com.aiguigu.springCloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @ClassName: PaymentMail8001
 * @Description TODO:
 * @Author: LiZhenxiang
 * @Creat: 2020/7/27 10:23
 * @Update 2020/7/27 10:23
 * @See:
 * @Version: 1.0
 **/
@SpringBootApplication
@EnableEurekaClient
public class PaymentMail8001 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentMail8001.class, args);
    }
}
