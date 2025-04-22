package com.example.smart_sales_manager;

import com.example.smart_sales_manager.helpers.LogHelper;
import com.example.smart_sales_manager.models.Product;

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
		LogHelper.info("Uygulama başlatıldı!");

		//LogHelper.error("Hata oluştu (try catchte catch icerisinde kullanilabilir)");
		//LogHelper.debug("debug için kullanabilirsin");
		//LogHelper.warn("warn için kullanabilirsin");
		Product p = new Product("AirPods", 4500.0, "Elektronik");
	    ProductManager manager = ProductManager.getInstance();
	    manager.addProduct(p);
	}

}
