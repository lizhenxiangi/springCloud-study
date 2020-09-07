package com.aiguigu.springCloud.lb;

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @ClassName: MyLB
 * @Description TODO:
 * @Author: LiZhenxiang
 * @Creat: 2020/7/29 16:26
 * @Update 2020/7/29 16:26
 * @See:
 * @Version: 1.0
 **/
@Component
public class MyLB implements LoadBalancer{
    private AtomicInteger atomicInteger=new AtomicInteger(0);

    public final int getAndIncrement(){
        int current;
        int next;
        do{
            current=atomicInteger.get();
            next=current>=2147483647?0:current+1;
        }while (!this.atomicInteger.compareAndSet(current,next));
        System.out.println("***第几次访问,次数: "+next);
        return next;
    }


    public ServiceInstance instances(List<ServiceInstance> serviceInstances){
        int index=getAndIncrement()%serviceInstances.size();
        return serviceInstances.get(index);
    }
}
