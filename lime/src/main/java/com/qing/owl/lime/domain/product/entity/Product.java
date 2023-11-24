package com.qing.owl.lime.domain.product.entity;

import java.util.List;

import com.qing.owl.lime.domain.category.Category;
import com.qing.owl.lime.domain.product.values.Shop;

public class Product {
    private Long id;
    private Shop shop;
    private Category category;
    private List<Sku> skus;
    private String name;
}
