package com.aiguigu.springCloud.controller;

import com.aiguigu.springCloud.entities.CommonResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @ClassName: OrderConsulController
 * @Description TODO:
 * @Author: LiZhenxiang
 * @Creat: 2020/7/28 16:43
 * @Update 2020/7/28 16:43
 * @See:
 * @Version: 1.0
 **/
@RestController
@RequestMapping("/consul")
@Slf4j
public class OrderConsulController {

    public static final String INVOKE_URL ="http://consul-provider-payment";

    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/get")
    public CommonResult<String> getPaymentInfo(){
        return restTemplate.getForObject(INVOKE_URL+"/consul/get",CommonResult.class);
    }
}
