package com.aiguigu.springCloud.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName: FeignConfig
 * @Description TODO:
 * @Author: LiZhenxiang
 * @Creat: 2020/8/5 18:01
 * @Update 2020/8/5 18:01
 * @See:
 * @Version: 1.0
 **/
@Configuration
public class FeignConfig {
    @Bean
    Logger.Level feignloggerLevel(){
        return Logger.Level.FULL;
    }
}
