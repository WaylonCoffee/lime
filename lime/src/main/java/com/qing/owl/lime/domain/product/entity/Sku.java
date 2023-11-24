package com.qing.owl.lime.domain.product.entity;

import java.math.BigDecimal;

import com.qing.owl.lime.domain.product.values.BarCode;
import com.qing.owl.lime.domain.product.values.PhotoTuple;
import com.qing.owl.lime.domain.product.values.SpecTuple;

public class Sku {
    private Long id;
    private PhotoTuple photoTuple;
    private SpecTuple specTuple;
    private BigDecimal price;
    private String unit;
    private BarCode barCode;
    private String skuNo;
}
