package com.example.task1.controllers;

import com.example.task1.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductController {

	private final ProductService productService;


	// DI в конструкторе для доступа к бину сервиса
	public ProductController(ProductService productService) {
		this.productService = productService;
	}

	@RequestMapping("/products") // По-умолчанию GET
	public String viewProducts(Model model) {

		var products = productService.findAll();               // сервисом получаем список продуктов
		model.addAttribute("products", products); // Передаем полученный список в model-представление

		return "products.html";   // возвращаем имя представления диспетчеру сервлетов

	}
}
