package com.kuang.store.order.dao;

import com.kuang.store.order.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * 
 * @author kuang
 * @email 1400584782@qq.com
 * @date 2022-08-20 23:06:34
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {
	
}
