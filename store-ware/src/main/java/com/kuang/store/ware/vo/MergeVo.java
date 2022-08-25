package com.kuang.store.ware.vo;

import lombok.Data;

import java.util.List;

/**
 * @Description:
 * @Created: with IntelliJ IDEA.
 * @author kuang
 * @email 1400584782@qq.com
 * @date 2022-08-20 23:09:45
 **/

@Data
public class MergeVo {

    private Long purchaseId;

    private List<Long> items;

}
