package com.kuang.store.product.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RefreshScope
@RestController
public class TestController {
    @Value("${myuser.name}")
    String name;

    @RequestMapping("/test")
    public String getValue(){
        return name;
    }
}
