package com.example.common.config;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "service2")
public interface RemoteBook {

    @GetMapping("/book")
    String test();
}
