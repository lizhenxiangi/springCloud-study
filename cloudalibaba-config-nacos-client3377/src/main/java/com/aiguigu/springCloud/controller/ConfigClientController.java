package com.aiguigu.springCloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: ConfigClientController
 * @Description TODO:
 * @Author: LiZhenxiang
 * @Creat: 2020/8/14 14:06
 * @Update 2020/8/14 14:06
 * @See:
 * @Version: 1.0
 **/
@RestController
@RequestMapping("config")
@RefreshScope   //SpringCloud原生注解 支持Nacos的动态刷新功能
public class ConfigClientController {

    @Value("${config.info}")
    private String configInfo;

    @GetMapping("/info")
    public String getConfigInfo(){
        return configInfo;
    }
}
