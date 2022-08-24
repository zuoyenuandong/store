package com.kuang.store.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.kuang.common.utils.PageUtils;
import com.kuang.store.product.entity.AttrGroupEntity;

import java.util.Map;

/**
 * 属性分组
 *
 * @author kuang
 * @email 1400584782@qq.com
 * @date 2022-08-20 15:42:51
 */
public interface AttrGroupService extends IService<AttrGroupEntity> {

    PageUtils queryPage(Map<String, Object> params);

    PageUtils queryPage(Map<String, Object> params, Long catelogId);
}

