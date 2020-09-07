package com.aiguigu.springCloud.service.impl;

import com.aiguigu.springCloud.dao.PaymentDao;
import com.aiguigu.springCloud.entities.Payment;
import com.aiguigu.springCloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @ClassName: PaymentServiceImpl
 * @Description TODO:
 * @Author: LiZhenxiang
 * @Creat: 2020/7/27 10:38
 * @Update 2020/7/27 10:38
 * @See:
 * @Version: 1.0
 **/
@Service("paymentService")
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return  paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
