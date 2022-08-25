package com.kuang.store.product.vo;


import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
 * @Description:
 * @Created: with IntelliJ IDEA.
 * @author kuang
 * @email 1400584782@qq.com
 * @date 2022-08-20 15:42:51
 **/

@Data
@ToString
public class SpuItemAttrGroupVo {

    private String groupName;

    private List<Attr> attrs;

}
