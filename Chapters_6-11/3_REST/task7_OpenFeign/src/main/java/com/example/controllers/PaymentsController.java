package com.example.controllers;

import com.example.model.Payment;
import com.example.proxy.PaymentsProxy;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

// Принимает запрос от клиента, генерирует requestId, вызывает Feign
@RestController
public class PaymentsController {

  private final PaymentsProxy paymentsProxy; // ← Внедряем Feign-клиент через конструктор

  public PaymentsController(PaymentsProxy paymentsProxy) {
    this.paymentsProxy = paymentsProxy;
  }

  @PostMapping("/payment")
  public Payment addHeaderRequestIdAndCreatePayment(
          @RequestBody Payment payment // Получаем только Body запроса
  ) {
    // Генерируем уникальный ID для отслеживания запроса
    String requestId = UUID.randomUUID().toString();

    // Вызываем Feign-прокси (это локальный вызов метода)
    // Прокси сам отправит HTTP-запрос в другой сервис с:
    //   - Header: requestId
    //   - Body: payment
    return paymentsProxy.createPayment(requestId, payment);
  }
}