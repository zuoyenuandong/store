package com.kuang.store.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.kuang.common.utils.PageUtils;
import com.kuang.store.ware.entity.WareOrderTaskEntity;

import java.util.Map;

/**
 * 库存工作单
 *
 * @author kuang
 * @email 1400584782@qq.com
 * @date 2022-08-20 23:09:45
 */
public interface WareOrderTaskService extends IService<WareOrderTaskEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

