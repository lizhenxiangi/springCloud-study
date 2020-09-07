package com.aiguigu.springCloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @ClassName: PaymentMail8002
 * @Description TODO:
 * @Author: LiZhenxiang
 * @Creat: 2020/7/28 11:32
 * @Update 2020/7/28 11:32
 * @See:
 * @Version: 1.0
 **/
@SpringBootApplication
@EnableEurekaClient
public class PaymentMail8002 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentMail8002.class,args);
    }
}
