package com.example.task1.contrrollers;

import com.example.task1.models.Country;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class HelloController {
	// Ответ текстом
	@GetMapping("/hello")
	public String hello() {
		return "hello";
	}
	@GetMapping("/ciao")
	public String ciao() {
		return "ciao";
	}

	// Ответ в JSON (Передача объекта в теле HTTP-ответа)
	@GetMapping("/france")
	public Country france () {
		Country c = Country.of("France", 13);
		return c;
	}

	// Ответ в JSON [Возвращение коллекции в теле ответа]
	@GetMapping("/all")
	public List<Country>  listCountries() {

		return List.of(
				Country.of("France", 60),
				Country.of("Russia", 150),
				Country.of("China", 1200));
	}

	// Создание HTTP-ответа со специальным статусом и заголовками
	@GetMapping("/russia")
	public ResponseEntity<Country> russia () {
		return ResponseEntity
				.status(HttpStatus.ACCEPTED)
				.header("continent", "Asia")
				.header("capital", "Moscow")
				.body(Country.of("Russia", 10));
	}


}
