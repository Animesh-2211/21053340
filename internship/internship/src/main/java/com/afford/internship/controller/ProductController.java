package com.afford.internship.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.afford.internship.model.Product;
import com.afford.internship.service.ProductService;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/categories/{category}/products")
    public List<Product> getTopProducts(@PathVariable String category,
                                        @RequestParam(required = false, defaultValue = "10") int top,
                                        @RequestParam(required = false) Integer minPrice,
                                        @RequestParam(required = false) Integer maxPrice,
                                        @RequestParam(required = false) String sortBy) {
        return productService.getTopProducts(category, top, minPrice, maxPrice, sortBy);
    }

    @GetMapping("/categories/{category}/products/{productId}")
    public Product getProductById(@PathVariable String category,
                                  @PathVariable String productId) {
        return productService.getProductById(category, productId);
    }
}
