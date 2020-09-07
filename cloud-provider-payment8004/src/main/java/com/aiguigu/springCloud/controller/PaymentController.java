package com.aiguigu.springCloud.controller;

import com.aiguigu.springCloud.entities.CommonResult;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @ClassName: PaymentController
 * @Description TODO:
 * @Author: LiZhenxiang
 * @Creat: 2020/7/28 13:47
 * @Update 2020/7/28 13:47
 * @See:
 * @Version: 1.0
 **/
@RestController
@RequestMapping("/zk")
public class PaymentController {
    @Value("${server.port}")
    private String serverPort;

    @GetMapping(value = "/get")
    public CommonResult<String> paymentzk(){
        return new CommonResult<>(200,"Spring cloud with zk port: "+serverPort+"\t"+ UUID.randomUUID().toString());
    }
}
