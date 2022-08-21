package com.kuang.store.member.dao;

import com.kuang.store.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author kuang
 * @email 1400584782@qq.com
 * @date 2022-08-20 23:01:54
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
