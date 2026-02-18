package com.example.smartsalesmanager.manager;

import com.example.smartsalesmanager.model.Product;
import com.example.smartsalesmanager.observer.StockObserver;

import java.util.ArrayList;
import java.util.List;

public class ProductManager {

    private static ProductManager instance;
    private List<Product> products = new ArrayList<>();
    private StockObserver stockObserver;

    private ProductManager() {
        this.stockObserver = new StockObserver();
    }

    public static synchronized ProductManager getInstance() {
        if (instance == null) {
            instance = new ProductManager();
        }
        return instance;
    }

    public void addProduct(Product product) {
        products.add(product);
        stockObserver.checkStock(product);
    }

    public void deleteProduct(Long id) {
        products.removeIf(p -> p.getId().equals(id));
    }

    public List<Product> getProducts() {
        return products;
    }
}