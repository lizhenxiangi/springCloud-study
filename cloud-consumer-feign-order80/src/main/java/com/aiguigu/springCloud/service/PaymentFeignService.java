package com.aiguigu.springCloud.service;

import com.aiguigu.springCloud.entities.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @ClassName: PaymentFeignService
 * @Description TODO:
 * @Author: LiZhenxiang
 * @Creat: 2020/8/5 17:36
 * @Update 2020/8/5 17:36
 * @See:
 * @Version: 1.0
 **/
@FeignClient(value = "cloud-payment-service")
@Component
public interface PaymentFeignService {
    @GetMapping(value = "/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id);
}
