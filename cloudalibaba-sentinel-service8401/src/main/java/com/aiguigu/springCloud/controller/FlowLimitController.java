package com.aiguigu.springCloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: FlowLimitController
 * @Description TODO:
 * @Author: LiZhenxiang
 * @Creat: 2020/8/14 16:59
 * @Update 2020/8/14 16:59
 * @See:
 * @Version: 1.0
 **/
@RestController
@Slf4j
public class FlowLimitController {
    @GetMapping("/testA")
    public String testA(){
        return "--------testA";
    }

    @GetMapping("/testB")
    public String testB(){
        return "--------testB";
    }
}
