package com.aiguigu.springCloud.controller;

import com.aiguigu.springCloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @ClassName: PaymentHystrixController
 * @Description TODO:
 * @Author: LiZhenxiang
 * @Creat: 2020/8/6 10:26
 * @Update 2020/8/6 10:26
 * @See:
 * @Version: 1.0
 **/
@RestController
@RequestMapping("payment")
@Slf4j
public class PaymentHystrixController {
    @Resource
    private PaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;

    @GetMapping("/hystrix/ok/{id}")
    public String paymentInfoOK(@PathVariable("id") Integer id){
        String result = paymentService.paymentInfoOK(id);
        log.info("**********result:"+result);
        return result;
    }

    @GetMapping("/hystrix/timeout/{id}")
    public String paymentInfoTimeOut(Integer id){
        String result = paymentService.paymentInfoTimeOut(id);
        log.info("*****result："+result);
        return result;
    }

    @GetMapping("/circuit/{id}")
    public String paymentCircuitBreaker(@PathVariable("id") Integer id){
        String circuitBreaker = paymentService.paymentCircuitBreaker(id);
        log.info("******result: "+circuitBreaker);
        return circuitBreaker;
    }

}
