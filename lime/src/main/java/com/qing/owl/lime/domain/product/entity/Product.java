package com.qing.owl.lime.domain.product.entity;

import java.util.List;


import com.qing.owl.lime.domain.category.Category;
import com.qing.owl.lime.domain.product.values.ProductName;
import com.qing.owl.lime.domain.product.values.ProductStatus;
import com.qing.owl.lime.domain.product.values.Shop;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String no;
    @Embedded
    private ProductName name;
    @Embedded
    private Shop shop;
    @ManyToOne
    private Category category;
    
    @OneToMany
    @JoinColumn(name = "product_no")
    private List<Sku> skus;

    @Enumerated(EnumType.STRING)
    private ProductStatus status;
    
}
