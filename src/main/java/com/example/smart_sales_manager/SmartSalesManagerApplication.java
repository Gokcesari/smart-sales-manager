package com.example.smart_sales_manager;

import com.example.smart_sales_manager.model.Product;

import manager.ProductManager;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SmartSalesManagerApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SmartSalesManagerApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	    System.out.println("Uygulama başlatıldı!");

	    Product p = new Product("AirPods", 4500.0, "Elektronik");
	    ProductManager manager = ProductManager.getInstance();
	    manager.addProduct(p);
	}

}
