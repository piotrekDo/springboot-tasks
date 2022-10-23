package com.codecool.spingboot_tasks.error_handling.error;

public class ProductNotFoundException extends RuntimeException{
    public ProductNotFoundException(String message) {
        super(message);
    }
}
