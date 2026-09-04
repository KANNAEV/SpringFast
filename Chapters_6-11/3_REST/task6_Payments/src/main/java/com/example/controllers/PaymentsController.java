package com.example.controllers;

import com.example.model.Payment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;
import java.util.logging.Logger;

@RestController
public class PaymentsController {

  private static Logger logger = Logger.getLogger(PaymentsController.class.getName());

  @PostMapping("/payment")
  public ResponseEntity<Payment> createPayment(
      @RequestHeader String requestId, // Spring создает объект String с параметром заголовка запроса
      @RequestBody Payment payment  // ← Spring создаёт объект Payment c параметрами тела запроса
  ) {
    logger.info("Received request with ID " + requestId +
        " ;Payment Amount: " + payment.getAmount());

    payment.setId(UUID.randomUUID().toString());

    logger.info("ID for payment assigned to : " + payment.getId());

    return ResponseEntity
        .status(HttpStatus.OK)
        .header("requestId", requestId)
        .body(payment);
  }

}

// Данный запрос вернет нам payment с новым ID
//curl -X POST http://127.0.0.1:8080/payment \
//        -H "Content-Type: application/json" \
//        -H "requestId: reg-1231" \
//        -d '{"amount": 150.50}'