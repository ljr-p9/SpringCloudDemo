/**
 * 负载均衡算法：rest接口的第几次请求 % 服务器集群总数量 = 实际调用服务器位置的下标，每次服务重启动后从1开始
 *
 * 使用ribbon的组件IRule实现ribbon调用算法
 * 此类不能被主启动类的SpringBootApplication里的ComponentScan扫描到
 * 需要在主启动类上配置：@RibbonClient(name = "CLOUD-PAYMENT-SERVICE",configuration = MySelfRule.class)
 *
 */
package com.atguigu.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MySelfRule {
    @Bean
    public IRule myRule(){
        return new RandomRule();//定义为随机
    }
}
