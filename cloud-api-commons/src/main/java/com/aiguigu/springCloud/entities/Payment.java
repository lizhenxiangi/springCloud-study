package com.aiguigu.springCloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @ClassName: Payment
 * @Description TODO:
 * @Author: LiZhenxiang
 * @Creat: 2020/7/27 10:32
 * @Update 2020/7/27 10:32
 * @See:
 * @Version: 1.0
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment implements Serializable {
    private Long id;
    private String serial;
}
