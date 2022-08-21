package com.kuang.store.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.kuang.common.utils.PageUtils;
import com.kuang.store.ware.entity.PurchaseDetailEntity;

import java.util.Map;

/**
 * 
 *
 * @author kuang
 * @email 1400584782@qq.com
 * @date 2022-08-20 23:09:45
 */
public interface PurchaseDetailService extends IService<PurchaseDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

