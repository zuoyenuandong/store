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
public class SpuSaveVo {

  private String spuName;
  private String spuDescription;
  private Long catalogId;
  private Long brandId;
  private BigDecimal weight;
  private int publishStatus;
  private List<String> decript;
  private List<String> images;
  private Bounds bounds;
  private List<BaseAttrs> baseAttrs;
  private List<Skus> skus;


}
