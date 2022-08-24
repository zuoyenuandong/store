package com.kuang.store.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.kuang.common.utils.PageUtils;
import com.kuang.store.product.entity.CategoryEntity;

import java.util.List;
import java.util.Map;

/**
 * 商品三级分类
 *
 * @author kuang
 * @email 1400584782@qq.com
 * @date 2022-08-20 15:42:51
 */
public interface CategoryService extends IService<CategoryEntity> {

    PageUtils queryPage(Map<String, Object> params);

    List<CategoryEntity> listWithTree();

    void removeMenuByIds(List<Long> asList);
}

