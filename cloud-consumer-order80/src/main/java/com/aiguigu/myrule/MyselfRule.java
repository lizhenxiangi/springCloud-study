package com.aiguigu.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName: MyselfRule
 * @Description TODO:
 * @Author: LiZhenxiang
 * @Creat: 2020/7/29 10:44
 * @Update 2020/7/29 10:44
 * @See:
 * @Version: 1.0
 **/
@Configuration
public class MyselfRule {

    @Bean
    public IRule myRule(){
        //负载均衡规则定义为随机
        return new RandomRule();
    }
}
