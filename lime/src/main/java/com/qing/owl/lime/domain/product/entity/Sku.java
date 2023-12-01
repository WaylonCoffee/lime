package com.qing.owl.lime.domain.product.entity;

import java.math.BigDecimal;

import com.qing.owl.lime.domain.product.values.BarCode;
import com.qing.owl.lime.domain.product.values.PhotoTuple;
import com.qing.owl.lime.domain.product.values.SpecTuple;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Sku {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private PhotoTuple photoTuple;
    @Embedded
    private SpecTuple specTuple;
    private BigDecimal price;
    private String unit;
    private BarCode barCode;
    private String skuNo;
}
