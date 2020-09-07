package com.aiguigu.springCloud.controller;

import com.aiguigu.springCloud.service.PaymentHystrixService;
import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @ClassName: OrderHystrixController
 * @Description TODO:
 * @Author: LiZhenxiang
 * @Creat: 2020/8/6 11:03
 * @Update 2020/8/6 11:03
 * @See:
 * @Version: 1.0
 **/
@RestController
@RequestMapping("consumer")
@Slf4j
//@DefaultProperties(defaultFallback = "payment_Global_FallbackMethod")
public class OrderHystrixController {

    @Resource
    private PaymentHystrixService paymentHystrixService;

    @GetMapping(value ="/payment/hystrix/ok/{id}")
    public String paymentInfoOK(@PathVariable("id") Integer id){
        String result = paymentHystrixService.paymentInfoOK(id);
        return  result;
    }
    //@HystrixCommand
    @GetMapping(value ="/payment/hystrix/timeout/{id}")
    public String paymentInfo_TimeOut(@PathVariable("id") Integer id){
        String result = paymentHystrixService.paymentInfoTimeOut(id);
        return result;
    }


    public String payment_Global_FallbackMethod(){
        return "Global异常处理信息,请稍后再试: orz~";
    }

}
