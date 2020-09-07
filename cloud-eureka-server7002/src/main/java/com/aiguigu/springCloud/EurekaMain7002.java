package com.aiguigu.springCloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @ClassName: EurekaMain7001
 * @Description TODO:
 * @Author: LiZhenxiang
 * @Creat: 2020/7/28 10:43
 * @Update 2020/7/28 10:43
 * @See:
 * @Version: 1.0
 **/
@SpringBootApplication
@EnableEurekaServer
public class EurekaMain7002 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaMain7002.class,args);
    }
}
