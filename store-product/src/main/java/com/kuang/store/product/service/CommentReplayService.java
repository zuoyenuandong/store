package com.kuang.store.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.kuang.common.utils.PageUtils;
import com.kuang.store.product.entity.CommentReplayEntity;

import java.util.Map;

/**
 * 商品评价回复关系
 *
 * @author kuang
 * @email 1400584782@qq.com
 * @date 2022-08-20 15:42:51
 */
public interface CommentReplayService extends IService<CommentReplayEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

