package com.example.controllers;

import com.example.model.Product;
import com.example.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ProductController {

	private final ProductService productService;


	// DI в конструкторе для доступа к бину сервиса
	public ProductController(ProductService productService) {
		this.productService = productService;
	}

	@GetMapping("/products") // По-умолчанию GET
	public String viewProducts(Model model) {

		var products = productService.findAll();               // сервисом получаем список продуктов
		model.addAttribute("products", products); // Передаем полученный список в model-представление

		return "products.html";   // возвращаем имя представления диспетчеру сервлетов

	}
	
	@PostMapping("/products")
	public String addProduct(
			@RequestParam String name,
			@RequestParam double price,
			Model model
	) {
		Product p = new Product();
		p.setName(name);
		p.setPrice(price);

		productService.addProduct(p);
		var products = productService.findAll();
		model.addAttribute("products", products);

		return "products.html";
	}

}
