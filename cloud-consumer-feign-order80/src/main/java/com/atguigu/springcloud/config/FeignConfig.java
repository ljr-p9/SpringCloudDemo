package com.atguigu.springcloud.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 配置openfeign日志
 */

@Configuration
public class FeignConfig {
    @Bean
    Logger.Level feignLOggerLevel(){
        return Logger.Level.FULL;
    }
}
