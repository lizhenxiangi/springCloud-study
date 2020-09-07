package com.aiguigu.springCloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName: MainApp8401
 * @Description TODO:
 * @Author: LiZhenxiang
 * @Creat: 2020/8/14 16:49
 * @Update 2020/8/14 16:49
 * @See:
 * @Version: 1.0
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class MainApp8401 {
    public static void main(String[] args) {
        SpringApplication.run(MainApp8401.class,args);
    }
}
