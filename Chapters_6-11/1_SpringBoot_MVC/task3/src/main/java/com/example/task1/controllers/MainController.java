package com.example.task1.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
	@RequestMapping("/home")
	public String home(
			@RequestParam(value = "color", defaultValue = "red", required = false) String color,
			@RequestParam(value = "name", defaultValue = "User", required = false) String name,
			Model page) {
		page.addAttribute("username", name);
		page.addAttribute("color", color);
		return "home.html";

	}

}
