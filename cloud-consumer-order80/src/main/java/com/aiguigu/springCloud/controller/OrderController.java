package com.aiguigu.springCloud.controller;

import com.aiguigu.springCloud.entities.CommonResult;
import com.aiguigu.springCloud.entities.Payment;
import com.aiguigu.springCloud.lb.LoadBalancer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.net.URI;
import java.util.List;

/**
 * @ClassName: OrderController
 * @Description TODO:
 * @Author: LiZhenxiang
 * @Creat: 2020/7/27 11:41
 * @Update 2020/7/27 11:41
 * @See:
 * @Version: 1.0
 **/
@RestController
@RequestMapping(value = "/consumer")
@Slf4j
public class OrderController {

    //public static final String PAYMENT_URL= "http://localhost:8001";
    //public static final String PAYMENT_URL= "http://CLOUD-PROVIDER-SERVICE";
    public static final String PAYMENT_URL= "http://CLOUD-PAYMENT-SERVICE";

    @Resource
    private RestTemplate restTemplate;

    @Resource
    private LoadBalancer loadBalancer;

    @Resource
    private DiscoveryClient discoveryClient;

    @GetMapping("/payment/create")
    public CommonResult<Payment> create(Payment payment){
        log.info("*******消费者启动创建订单*******");
        return restTemplate.postForObject(PAYMENT_URL+"/payment/create",payment, CommonResult.class);
    }

    @GetMapping("/payment/get/{id}")
    public CommonResult<Payment> getPayment(@PathVariable("id") Long id){
        log.info("*****消费者获取订单******");
        return restTemplate.getForObject(PAYMENT_URL+"/payment/get/"+id,CommonResult.class);
    }

    @GetMapping("/payment/getEntity/{id}")
    public CommonResult<Payment> getForEntity(@PathVariable("id") Long id){
        ResponseEntity<CommonResult> forEntity = restTemplate.getForEntity(PAYMENT_URL+"/payment/get/"+id,CommonResult.class);
        log.info("******调用结果*******"+forEntity.getStatusCode());
        if((forEntity.getStatusCode().is2xxSuccessful())){
            return forEntity.getBody();
        }else {
            return new CommonResult<>(444,"调用失败");
        }
    }

    @GetMapping(value = "/payment/lb")
    public  String getPaymentLB(){
        List<ServiceInstance> instances = discoveryClient.getInstances("CLOUD-PAYMENT-SERVICE");
        if(instances==null||instances.size()<0){
            return null;
        }
        ServiceInstance instances1 = loadBalancer.instances(instances);
        URI uri = instances1.getUri();
        return restTemplate.getForObject(uri+"/payment/lb",String.class);
    }

}
