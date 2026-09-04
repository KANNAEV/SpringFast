package com.example.task1.contrrollers;

import com.example.task1.exeptions.NotEnoughMoneyException;
import com.example.task1.models.ErrorDetails;
import com.example.task1.models.PaymentDetails;
import com.example.task1.services.PaymentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PaymentController {
	private final PaymentService paymentService;


	public PaymentController(PaymentService paymentService) {
		this.paymentService = paymentService;
	}

	@PostMapping("/payment")
	public ResponseEntity<?> makePayment () {
		try {
			PaymentDetails paymentDetails = paymentService.processPayment();
			return ResponseEntity
					.status(HttpStatus.ACCEPTED)
					.body(paymentDetails);
		} catch (NotEnoughMoneyException e) { // 👈 Ловим ТОЛЬКО эту ошибку
			ErrorDetails errorDetails = new ErrorDetails();
			errorDetails.setMessage("Not enough money to make the payment.");
			return ResponseEntity
					.badRequest()
					.body(errorDetails);
		}
	}
}
