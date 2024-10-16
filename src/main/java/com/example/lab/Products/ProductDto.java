package com.example.lab.Products;

import com.example.lab.Category.Category;

public record ProductDto(String name, String duration, String release_date, String studio, Category category) {
}


