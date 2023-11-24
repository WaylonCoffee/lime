package com.qing.owl.lime.domain.product;

import com.qing.owl.lime.application.product.command.ProductParam;
import com.qing.owl.lime.domain.category.Category;
import com.qing.owl.lime.domain.product.entity.Product;
import com.qing.owl.lime.domain.product.values.Shop;

public class ProductFactory {
    
    public static Product create(Shop shop, Category category, ProductParam param){
        return new Product();
    }

}
