package com.aiguigu.springCloud.service;

import cn.hutool.core.util.IdUtil;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * @ClassName: PaymentService
 * @Description TODO:
 * @Author: LiZhenxiang
 * @Creat: 2020/8/6 10:26
 * @Update 2020/8/6 10:26
 * @See:
 * @Version: 1.0
 **/
@Service("paymentService")
public class PaymentService {

    public String paymentInfoOK(Integer id) {
        return "当前线程: "+Thread.currentThread().getName()+"paymentInfo_OK,id："+id+"\t"+"O(∩_∩)O哈哈~";
    }

    /*@HystrixCommand(fallbackMethod = "paymentInfoTimeOutHandler",commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds",value = "3000")
    })*/
    public String paymentInfoTimeOut(Integer id) {
        int timeout=5;
        try {
            TimeUnit.SECONDS.sleep(timeout);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "线程池："+Thread.currentThread().getName()+"   paymentInfo_Timeout,id："+id+"\t"+"O(∩_∩)O哈哈~"+"   耗时(秒)："+timeout;
    }

    public String  paymentInfoTimeOutHandler(Integer id){
        return "程序运行繁忙或报错,请稍后再试*****"+"当前线程: "+Thread.currentThread().getName()+id+"\t "+"orz!";
    }

    /**
     * 三个断路器的重要参数：快照时间窗、请求总数阀值、错误百分比阀值。
     * 1、快照时间窗：断路器确定是否打开需要统计一些请求和错误数据，而统计的时间范围就是快照时间窗，默认为最近的10秒
     * 2、请求总数阀值：在快照时间窗内必须满足请求总数阀值才有资格熔断。默认为20，意味着在10秒内，如果该hystrix命令的调用次数不足20次，即使所有请求都超时或者因为其他原因失败，断路器都不会打开
     * 3、错误百分比阀值：当请求总数在快照时间内超过了阀值，比如发生了30次调用，如果在30次调用中，有15次发生了超时异常，也就是超过50%的错误百分比，在默认设定50%的阀值下，这时候就会将断路器打开
     * @return
     */
    @HystrixCommand(fallbackMethod="paymentCircuitBreakerFallback", commandProperties={
            @HystrixProperty(name = "circuitBreaker.enabled" ,value = "true"),//是否开启断路器
            @HystrixProperty(name = "circuitBreaker.requestVolumeThreshold",value = "3"),// 请求次数
            @HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds",value = "3000"),//时间窗口期 "
            @HystrixProperty(name = "circuitBreaker.errorThresholdPercentage",value = "2")//失败率达到多少后跳闸
    })
    public String paymentCircuitBreaker(Integer id) {
        if (id<0){
            throw new RuntimeException();
        }
        List<String> test = new ArrayList<>();
        System.out.println(test.get(0));
        /*try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        String serialNumber = IdUtil.simpleUUID();
        return Thread.currentThread().getName()+"\t "+"调用成功,流水号: "+serialNumber;
    }
    public String paymentCircuitBreakerFallback(@PathVariable("id") Integer id){
        return "**********熔断器出发**********: "+ id;
    }
}
