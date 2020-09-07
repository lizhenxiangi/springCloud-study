package com.aiguigu.springCloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @ClassName: GatewayMain9527
 * @Description TODO:
 * @Author: LiZhenxiang
 * @Creat: 2020/8/13 13:07
 * @Update 2020/8/13 13:07
 * @See:
 * @Version: 1.0
 **/
@SpringBootApplication
@EnableEurekaClient
public class GatewayMain9527 {
    public static void main(String[] args) {
        SpringApplication.run(GatewayMain9527.class,args);
    }
}
