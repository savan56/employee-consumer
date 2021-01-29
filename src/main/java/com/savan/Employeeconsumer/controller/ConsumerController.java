package com.savan.Employeeconsumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumerController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/consume-client")
    public String consumeEmployee(){
        String url = "http://EMPLOYEE-PRODUCER/employee";
        return restTemplate.getForObject(url,String.class);
    }
}
