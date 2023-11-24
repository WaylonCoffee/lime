package com.qing.owl.lime.domain.entity;

import java.util.List;

import com.qing.owl.lime.domain.values.Shop;


public class Product {
    private Long id;
    private Shop shop;
    private Category category;
    private List<Sku> skus;
}
