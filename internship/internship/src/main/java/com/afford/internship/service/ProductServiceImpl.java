package com.afford.internship.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.afford.internship.model.Product;

@Service
public class ProductServiceImpl implements ProductService {

    @Value("${api.id}")
    private String apiId;

    @Value("${api.token}")
    private String apiToken;

    private final RestTemplate restTemplate;

    public ProductServiceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public List<Product> getTopProducts(String category, int top, Integer minPrice, Integer maxPrice, String sortBy) {
        // Implement logic to call external API and retrieve top products
        return null;
    }

    @Override
    public Product getProductById(String category, String productId) {
        // Implement logic to call external API and retrieve product by ID
        return null;
    }
}
