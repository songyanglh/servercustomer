package com.as.servercustomer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: songyang  Date: 2018/10/11 Time: 10:17
 */

@RestController
@RequestMapping("customer")
public class TestController {

    @Autowired
    private RestTemplate restTemplate;


    @RequestMapping("test1")
    public String testCustomer(String name){
        Map<String,Object> map = new HashMap<>();
        map.put("name",name);
        return restTemplate.getForObject("http://support/server/support",String.class,map);
    }


    @Bean
    @LoadBalanced
    /**
     * @Bean 初始化restTemplate注入
     * @loadBalanced 负载均衡注解
     */
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}