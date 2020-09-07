package com.aiguigu.springCloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @ClassName: OrderOpenFeignMain80
 * @Description TODO:
 * @Author: LiZhenxiang
 * @Creat: 2020/8/5 17:06
 * @Update 2020/8/5 17:06
 * @See:
 * @Version: 1.0
 **/
@SpringBootApplication
@EnableFeignClients
public class OrderOpenFeignMain80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderOpenFeignMain80.class,args);
    }
}
