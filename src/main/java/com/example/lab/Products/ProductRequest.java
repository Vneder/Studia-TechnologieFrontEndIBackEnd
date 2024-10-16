package com.example.lab.Products;

public record ProductRequest (
    String name,
    String duration,
    String release_date,
    String studio,
    Long categoryId
){}
