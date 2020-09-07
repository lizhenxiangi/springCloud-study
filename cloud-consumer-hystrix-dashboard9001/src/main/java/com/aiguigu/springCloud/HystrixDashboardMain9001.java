package com.aiguigu.springCloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @ClassName: HystrixDashboardMain9001
 * @Description TODO:
 * @Author: LiZhenxiang
 * @Creat: 2020/8/13 11:35
 * @Update 2020/8/13 11:35
 * @See:
 * @Version: 1.0
 **/
@SpringBootApplication
@EnableHystrixDashboard
public class HystrixDashboardMain9001 {
    public static void main(String[] args) {
        SpringApplication.run(HystrixDashboardMain9001.class,args);
    }
}
