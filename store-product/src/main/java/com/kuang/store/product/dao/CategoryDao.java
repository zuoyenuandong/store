package com.kuang.store.product.dao;

import com.kuang.store.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author kuang
 * @email 1400584782@qq.com
 * @date 2022-08-20 15:42:51
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
