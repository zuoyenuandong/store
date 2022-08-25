package com.kuang.store.coupon;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@MapperScan("com.kuang.store.coupon.dao")
@EnableDiscoveryClient
@SpringBootApplication
public class StoreCouponApplication {

    public static void main(String[] args) {
        SpringApplication.run(StoreCouponApplication.class, args);
    }

}
