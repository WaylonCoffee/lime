package com.qing.owl.lime.infra.external;

import org.springframework.stereotype.Component;

import com.qing.owl.lime.domain.product.values.Shop;

@Component
public class ShopFeignService {
    public Shop getById(Long id) {
        return new Shop(1l,"lime");
    }
}
