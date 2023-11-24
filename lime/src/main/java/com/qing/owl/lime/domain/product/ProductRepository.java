package com.qing.owl.lime.domain.product;

import java.util.List;

import com.qing.owl.lime.domain.product.entity.Product;

public interface ProductRepository {
    void save(Product product);
    List<Product> list();
}
