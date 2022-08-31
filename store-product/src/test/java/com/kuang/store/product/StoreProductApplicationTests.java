package com.kuang.store.product;

import com.kuang.store.product.entity.BrandEntity;
import com.kuang.store.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;

@SpringBootTest
class StoreProductApplicationTests {

    @Autowired
    BrandService brandService;

    @Autowired
    StringRedisTemplate stringRedisTemplate;


    @Test
    void test01() {
        stringRedisTemplate.opsForValue().set("name","kuang");
    }

    @Test
    void contextLoads() {
        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setDescript("测试专用");
        brandService.save(brandEntity);
        System.out.println(brandService.query());
    }


}
