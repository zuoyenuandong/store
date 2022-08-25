package com.kuang.store.order;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;


@EnableFeignClients
@EnableDiscoveryClient
@MapperScan("com.kuang.store.order.dao")
@SpringBootApplication
public class StoreOrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(StoreOrderApplication.class, args);
    }

}
