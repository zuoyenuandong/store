package com.kuang.store.coupon.dao;

import com.kuang.store.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author kuang
 * @email 1400584782@qq.com
 * @date 2022-08-20 22:55:02
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
