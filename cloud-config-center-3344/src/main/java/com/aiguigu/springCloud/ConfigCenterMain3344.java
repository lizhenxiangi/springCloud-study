package com.aiguigu.springCloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @ClassName: ConfigCenterMain3344
 * @Description TODO:
 * @Author: LiZhenxiang
 * @Creat: 2020/8/13 15:24
 * @Update 2020/8/13 15:24
 * @See:
 * @Version: 1.0
 **/
@SpringBootApplication
@EnableConfigServer
public class ConfigCenterMain3344 {
    public static void main(String[] args) {
        SpringApplication.run(ConfigCenterMain3344.class,args);
    }
}
