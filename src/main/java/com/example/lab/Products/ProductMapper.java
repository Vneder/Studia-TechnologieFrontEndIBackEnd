package com.example.lab.Products;

import org.springframework.stereotype.Component;

@Component
public class ProductMapper {
    public ProductDto toDto(Product product){
        return new ProductDto(product.getName(), product.getDuration(),
                product.getRelease_date(), product.getStudio(), product.getCategory());
    }
}
