package com.example.smart_sales_manager;


	

	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.RestController;
	
		@RestController
		public class HelloController {
		    @GetMapping("/hello")
		    public String hello() {
		        return "Hello, Gökçe!";
		    }
		}
	
	

