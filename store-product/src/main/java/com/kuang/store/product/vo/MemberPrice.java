package com.kuang.store.product.vo;


import lombok.Data;

import java.math.BigDecimal;

/**
 * @author kuang
 * @email 1400584782@qq.com
 * @date 2022-08-20 15:42:51
 */

@Data
public class MemberPrice {

  private Long id;
  private String name;
  private BigDecimal price;

}
