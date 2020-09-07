package com.aiguigu.springCloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName: ConfigCenterMain3355
 * @Description TODO:
 * @Author: LiZhenxiang
 * @Creat: 2020/8/13 15:50
 * @Update 2020/8/13 15:50
 * @See:
 * @Version: 1.0
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class ConfigCenterMain3355 {
    public static void main(String[] args) {
        SpringApplication.run(ConfigCenterMain3355.class,args);
    }
}
