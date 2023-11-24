package com.qing.owl.lime.application.product;

import java.util.List;

import org.springframework.stereotype.Service;

import com.qing.owl.lime.application.product.command.CreateProductCmd;
import com.qing.owl.lime.domain.category.Category;
import com.qing.owl.lime.domain.category.CategoryRepository;
import com.qing.owl.lime.domain.product.ProductFactory;
import com.qing.owl.lime.domain.product.ProductRepository;
import com.qing.owl.lime.domain.product.entity.Product;
import com.qing.owl.lime.domain.product.values.Shop;
import com.qing.owl.lime.infra.external.ShopFeignService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ShopFeignService shopFeignService;
    private final CategoryRepository categoryRepository;
    private final ProductRepository productRepository;


    public void create(CreateProductCmd createProductCmd){
        Shop shop = shopFeignService.getById(createProductCmd.getShopId());
        Category category = categoryRepository.findById(createProductCmd.getCategoryId());
        Product product = ProductFactory.create(shop, category, createProductCmd.getProduct());
        productRepository.save(product);
    }

    public List<Product> list(){
        return productRepository.list();
    }
}
