package com.kuang.store.product.config;

import org.redisson.Redisson;
import org.redisson.api.RedissonClient;
import org.redisson.config.Config;
import org.springframework.context.annotation.Bean;

import java.io.IOException;

public class MyRedissonConfig {

    @Bean(destroyMethod = "shutdown")
    RedissonClient redissonClient() throws IOException{
        Config config = new Config();
        config.useSingleServer().setAddress("redis://192.168.80.3");
        return Redisson.create();
    }
}
