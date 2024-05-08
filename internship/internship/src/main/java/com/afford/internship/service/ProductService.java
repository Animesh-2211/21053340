package com.afford.internship.service;

import java.util.List;

import com.afford.internship.model.Product;

public interface ProductService {

    List<Product> getTopProducts(String category, int top, Integer minPrice, Integer maxPrice, String sortBy);

    Product getProductById(String category, String productId);
}
