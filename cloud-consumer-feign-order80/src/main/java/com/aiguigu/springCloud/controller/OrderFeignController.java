package com.aiguigu.springCloud.controller;

import com.aiguigu.springCloud.entities.CommonResult;
import com.aiguigu.springCloud.service.PaymentFeignService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @ClassName: OrderFeignController
 * @Description TODO:
 * @Author: LiZhenxiang
 * @Creat: 2020/8/5 17:09
 * @Update 2020/8/5 17:09
 * @See:
 * @Version: 1.0
 **/
@RestController
@RequestMapping("consumer")
public class OrderFeignController {
    @Resource
    private PaymentFeignService paymentFeignService;

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id){
        CommonResult paymentById = paymentFeignService.getPaymentById(id);
        return paymentById ;
    }
}
