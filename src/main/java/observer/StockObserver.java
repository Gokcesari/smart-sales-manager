package com.example.smartsalesmanager.observer;

import com.example.smartsalesmanager.model.Product;

public class StockObserver {

    public void checkStock(Product product) {
        if (product.getQuantity() < 5) {
            System.out.println("⚠️ WARNING: Stock of " + product.getName() + " is critically low!");
        }
    }
}