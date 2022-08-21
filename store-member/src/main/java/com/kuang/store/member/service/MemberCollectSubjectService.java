package com.kuang.store.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.kuang.common.utils.PageUtils;
import com.kuang.store.member.entity.MemberCollectSubjectEntity;

import java.util.Map;

/**
 * 会员收藏的专题活动
 *
 * @author kuang
 * @email 1400584782@qq.com
 * @date 2022-08-20 23:01:54
 */
public interface MemberCollectSubjectService extends IService<MemberCollectSubjectEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

