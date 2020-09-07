package com.aiguigu.springCloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName: CommonResult
 * @Description TODO:
 * @Author: LiZhenxiang
 * @Creat: 2020/7/27 10:34
 * @Update 2020/7/27 10:34
 * @See:
 * @Version: 1.0
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {
    private Integer code;
    private String message;
    private  T      data;

    public CommonResult(Integer code,String message){
        this(code,message,null);
    }
}
