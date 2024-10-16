package com.example.lab.Products;

import com.example.lab.Category.Category;
import java.util.List;

public interface ProductService {
    List<Product> findAllProducts();
    List<Product> findByCategory(Category category);

    Product saveProduct(Product product);
}
