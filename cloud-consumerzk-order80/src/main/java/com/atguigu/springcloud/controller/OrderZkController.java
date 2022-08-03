package com.atguigu.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.io.Serializable;

@RestController
@Slf4j
public class OrderZkController {

    private static final String SERVER_URL = "http://cloud-provider-payment";

    @Resource
    private RestTemplate restTemplate;

    @GetMapping("consumer/payment/zk")
    public String orderPaymentZk(){
        return restTemplate.getForObject(SERVER_URL+"/payment/zk",String.class);
    }
}
