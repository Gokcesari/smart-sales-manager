package com.example.smart_sales_manager.models;

public class Product {

    private String name;   // Ürünün adı
    private double price;  // Fiyatı
    private String type;   // Ürün tipi (örnek: "Elektronik", "Gıda")

    // Constructor (oluşturucu)
    public Product(String name, double price, String type) {
        this.name = name;
        this.price = price;
        this.type = type;
    }

    // Getter ve Setter'lar (değerlere ulaşmak ve değiştirmek için)

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}

