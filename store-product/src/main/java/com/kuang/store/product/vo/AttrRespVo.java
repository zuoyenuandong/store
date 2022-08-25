package com.kuang.store.product.vo;


import lombok.Data;

/**
 * @Description:
 * @Created: with IntelliJ IDEA.
 * @author kuang
 * @email 1400584782@qq.com
 * @date 2022-08-20 15:42:51
 **/

@Data
public class AttrRespVo extends AttrVo {

    /**
     *
     */
    private String catelogName;

    private String groupName;

    private Long[] catelogPath;

}
