package com.example.product_microservice.cqrs.events;


public class ProductCreatedEvent {
    private final String id;
    private final String name;
    private final String description;
    private final double price;
    private final int stock;

    public ProductCreatedEvent(String id, String name, String description, double price, int stock) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.stock = stock;
    }

    // Getters
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }
}