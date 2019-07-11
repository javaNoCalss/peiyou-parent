package com.peiyou.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class DiscoveryClientController {

    @Autowired
    private DiscoveryClient discoveryClient;

    @GetMapping("/testDiscoveryClient")
    public List<ServiceInstance> testDiscoveryClient(){
        List<ServiceInstance> list=new ArrayList<>();
        discoveryClient.getServices().stream().forEach(name -> {
            ServiceInstance instanceOptional = discoveryClient.getInstances(name).stream().findFirst().orElse(null);
            if (instanceOptional!=null){
                list.add(instanceOptional);
            }
        });
        return list;
    }
}
