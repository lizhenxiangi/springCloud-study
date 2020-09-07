package com.aiguigu.springCloud.dao;

import com.aiguigu.springCloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @ClassName: PaymentDao
 * @Description TODO:
 * @Author: LiZhenxiang
 * @Creat: 2020/7/27 10:46
 * @Update 2020/7/27 10:46
 * @See:
 * @Version: 1.0
 **/
@Mapper
public interface PaymentDao {
    int create(@Param("payment") Payment payment);

    Payment getPaymentById(@Param("id") Long id);
}
