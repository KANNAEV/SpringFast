package com.example.controllers;

import com.example.model.PaymentDetails;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

@RestController
public class PaymentController {

	private static final Logger logger =
			Logger.getLogger(PaymentController.class.getName());

	@PostMapping("/payment")
	public ResponseEntity<PaymentDetails> makePayment(
			@RequestBody PaymentDetails paymentDetails // Извлекаем информацию о платеже из тела HTTP-запроса
	) {
		logger.info("Received payment " + paymentDetails.getAmount()); // Выводим в консоль сервера сумму платежа

		// Возвращаем объект с информацией
		return ResponseEntity
				.status(HttpStatus.ACCEPTED)
				.body(paymentDetails);
	}
}
