package com.qing.owl.lime.application.product.command;

import lombok.Data;

@Data
public class CreateProductCmd {
    private Long shopId;
    private Long categoryId;
    private ProductParam product;
  
}
