package com.qing.owl.lime.application.product.command;

import java.math.BigDecimal;
import java.util.List;

import lombok.Data;

@Data
public class SkuParam {
    private List<String> photos;
    private BigDecimal price;
    private String unit;
    private String barCode;
    private List<SpecParam> specs;
}