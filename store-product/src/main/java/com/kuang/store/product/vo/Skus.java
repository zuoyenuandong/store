package com.kuang.store.product.vo;


import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author kuang
 * @email 1400584782@qq.com
 * @date 2022-08-20 15:42:51
 */

@Data
public class Skus {

  private List<Attr> attr;
  private String skuName;
  private BigDecimal price;
  private String skuTitle;
  private String skuSubtitle;
  private List<Images> images;
  private List<String> descar;
  private int fullCount;
  private BigDecimal discount;
  private int countStatus;
  private BigDecimal fullPrice;
  private BigDecimal reducePrice;
  private int priceStatus;
  private List<MemberPrice> memberPrice;

}
