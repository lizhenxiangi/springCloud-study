package com.aiguigu.springCloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName: ApplicationContextConfig
 * @Description TODO:
 * @Author: LiZhenxiang
 * @Creat: 2020/7/27 11:38
 * @Update 2020/7/27 11:38
 * @See:
 * @Version: 1.0
 **/
@Configuration
public class ApplicationContextConfig {

    @Bean
    //@LoadBalanced
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
