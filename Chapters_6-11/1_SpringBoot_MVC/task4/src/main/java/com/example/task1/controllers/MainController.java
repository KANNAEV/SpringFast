package com.example.task1.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
	@RequestMapping("/home/{color}")
	public String home(
			@PathVariable String color,
			@RequestParam(value = "user", defaultValue = "User", required = false) String user,
			Model page) {
		page.addAttribute("user", user);
		page.addAttribute("color", color);
		return "home.html";

	}


}
