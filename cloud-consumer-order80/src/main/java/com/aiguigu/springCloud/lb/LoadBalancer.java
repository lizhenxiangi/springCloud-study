package com.aiguigu.springCloud.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * @ClassName: LoadBalancer
 * @Description TODO:
 * @Author: LiZhenxiang
 * @Creat: 2020/7/29 16:15
 * @Update 2020/7/29 16:15
 * @See:
 * @Version: 1.0
 **/
public interface LoadBalancer {
    ServiceInstance instances(List<ServiceInstance> serviceInstances);
}
