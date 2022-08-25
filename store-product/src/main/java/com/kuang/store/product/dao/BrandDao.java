package com.kuang.store.product.dao;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.kuang.store.product.entity.BrandEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 品牌
 *
 * @author kuang
 * @email 1400584782@qq.com
 * @date 2022-08-20 15:42:51
 */
@Mapper
public interface BrandDao extends BaseMapper<BrandEntity> {
	
}
