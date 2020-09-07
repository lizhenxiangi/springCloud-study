package com.aiguigu.springCloud.controller;

import com.aiguigu.springCloud.entities.CommonResult;
import com.aiguigu.springCloud.entities.Payment;
import com.aiguigu.springCloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @ClassName: PaymentController
 * @Description TODO:
 * @Author: LiZhenxiang
 * @Creat: 2020/7/27 10:40
 * @Update 2020/7/27 10:40
 * @See:
 * @Version: 1.0
 **/
@RequestMapping(value = "/payment")
@RestController
@Slf4j
public class PaymentController {

    @Value("${server.port}")
    private String serverPort;

    @Resource
    private PaymentService paymentService;

    @PostMapping(value = "/create")
    public CommonResult create(@RequestBody Payment payment){
        int result = paymentService.create(payment);
        log.info("*******插入结果为: "+result);
        if(result>0){
            return new CommonResult(200,"插入数据库成功"+"机器端口号为："+serverPort,result);
        }else{
            return new CommonResult(444,"插入数据库失败"+"机器端口号为："+serverPort,null);
        }
    }

    @GetMapping(value = "/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id){
        Payment paymentById = paymentService.getPaymentById(id);
        log.info("*********查找结果为: "+paymentById);
        if(paymentById!=null){
            return new CommonResult(200,"查找成功"+"机器端口号为："+serverPort,paymentById);
        }else{
            return new CommonResult(444,"查找为空,查找ID为: "+id+"机器端口号为："+serverPort,null);
        }

    }
    @GetMapping("/lb")
    public String getPaymentLB(){
        return serverPort;
    }

}
