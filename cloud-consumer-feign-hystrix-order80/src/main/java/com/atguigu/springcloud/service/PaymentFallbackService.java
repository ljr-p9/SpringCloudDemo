package com.atguigu.springcloud.service;

import org.springframework.stereotype.Component;

@Component
public class PaymentFallbackService implements OrderHystrixService {
    @Override
    public String paymentInfo_OK(Integer id) {
        return "fallback ok";
    }

    @Override
    public String paymentInfo_Timeout(Integer id) {
        return "fallback timeout";
    }
}
