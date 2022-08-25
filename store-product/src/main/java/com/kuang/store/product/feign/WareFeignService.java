package com.kuang.store.product.feign;


import org.springframework.cloud.openfeign.FeignClient;

@FeignClient("store-ware")
public interface WareFeignService {
}
