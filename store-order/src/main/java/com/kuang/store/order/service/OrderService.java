package com.kuang.store.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.kuang.common.utils.PageUtils;
import com.kuang.store.order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author kuang
 * @email 1400584782@qq.com
 * @date 2022-08-20 23:06:34
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

