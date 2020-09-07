package com.aiguigu.springCloud.service;

import com.aiguigu.springCloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @ClassName: PaymentService
 * @Description TODO:
 * @Author: LiZhenxiang
 * @Creat: 2020/7/27 10:37
 * @Update 2020/7/27 10:37
 * @See:
 * @Version: 1.0
 **/
public interface PaymentService {
    public int create(Payment payment);
    public Payment getPaymentById(@Param("id") Long id);
}
