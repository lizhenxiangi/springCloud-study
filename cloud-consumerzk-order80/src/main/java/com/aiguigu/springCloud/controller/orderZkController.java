package com.aiguigu.springCloud.controller;

import com.aiguigu.springCloud.entities.CommonResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @ClassName: orderZkCOntroller
 * @Description TODO:
 * @Author: LiZhenxiang
 * @Creat: 2020/7/28 16:05
 * @Update 2020/7/28 16:05
 * @See:
 * @Version: 1.0
 **/
@RestController
@RequestMapping("/zk")
public class orderZkController {
    public static final String PAYMENT_URL= "http://cloud-provider-payment";

    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/get")
    public CommonResult<String> paymentzk(){
        return restTemplate.getForObject(PAYMENT_URL+"/zk/get",CommonResult.class);
    }
}
