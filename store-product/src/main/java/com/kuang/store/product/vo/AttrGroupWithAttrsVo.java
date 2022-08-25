package com.kuang.store.product.vo;


import com.kuang.store.product.entity.AttrEntity;
import lombok.Data;

import java.util.List;

/**
 * @Description:
 * @Created: with IntelliJ IDEA.
 * @author kuang
 * @email 1400584782@qq.com
 * @date 2022-08-20 15:42:51
 **/

@Data
public class AttrGroupWithAttrsVo {


    /**
     * 分组id
     */
    private Long attrGroupId;
    /**
     * 组名
     */
    private String attrGroupName;
    /**
     * 排序
     */
    private Integer sort;
    /**
     * 描述
     */
    private String descript;
    /**
     * 组图标
     */
    private String icon;
    /**
     * 所属分类id
     */
    private Long catelogId;

    private List<AttrEntity> attrs;
}
