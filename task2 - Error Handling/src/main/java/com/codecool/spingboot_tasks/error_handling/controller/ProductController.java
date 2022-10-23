package com.codecool.spingboot_tasks.error_handling.controller;

import com.codecool.spingboot_tasks.error_handling.model.Product;
import com.codecool.spingboot_tasks.error_handling.service.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping()
    public List<Product> getProducts() {
        System.out.println("LOOL");
        return productService.getProducts();
    }

    @GetMapping("/{id}")
    public List<Product> getProducts(@PathVariable long id) {
        System.out.println("LOOL");
        return productService.getProduct(id);
    }

}
