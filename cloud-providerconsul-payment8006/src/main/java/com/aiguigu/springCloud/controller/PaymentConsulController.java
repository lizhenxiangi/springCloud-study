package com.aiguigu.springCloud.controller;

import com.aiguigu.springCloud.entities.CommonResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @ClassName: PaymentConsulController
 * @Description TODO:
 * @Author: LiZhenxiang
 * @Creat: 2020/7/28 16:37
 * @Update 2020/7/28 16:37
 * @See:
 * @Version: 1.0
 **/
@RestController
@RequestMapping("consul")
@Slf4j
public class PaymentConsulController {
    @Value("${server.port}")
    private String serverPort;

    @GetMapping(value = "/get")
    public CommonResult<String> paymentConsul(){
        return new CommonResult<>(200,"Spring cloud with consul port: "+serverPort+"\t  "+ UUID.randomUUID().toString());
    }
}
