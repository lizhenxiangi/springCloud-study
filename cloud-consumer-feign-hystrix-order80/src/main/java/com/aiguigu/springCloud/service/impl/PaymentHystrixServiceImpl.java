package com.aiguigu.springCloud.service.impl;

import com.aiguigu.springCloud.service.PaymentHystrixService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @ClassName: PaymentHystrixServiceImpl
 * @Description TODO:
 * @Author: LiZhenxiang
 * @Creat: 2020/8/6 13:15
 * @Update 2020/8/6 13:15
 * @See:
 * @Version: 1.0
 **/
@Component("fallback")
@Slf4j
public class PaymentHystrixServiceImpl implements PaymentHystrixService {
    @Override
    public String paymentInfoOK(Integer id) {
        return "11111111111111111111111111111";
    }

    @Override
    public String paymentInfoTimeOut(Integer id) {
        log.info("********触发熔断");
        return "222222222222222222";
    }
}
