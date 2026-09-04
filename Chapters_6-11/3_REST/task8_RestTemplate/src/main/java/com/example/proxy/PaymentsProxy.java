package com.example.proxy;

import com.example.model.Payment;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.UUID;

@Component
public class PaymentsProxy {

  private final RestTemplate rest;
  @Value("${name.service.url}")   // Получаем из файла свойств URL сервиса платежей
  private String paymentsServiceUrl;

  // С помощью DI внедряем в конструкторе RestTemplate из контекста Spring
  public PaymentsProxy(RestTemplate rest) {
    this.rest = rest;
  }

  public Payment createPayment(Payment payment) {
    String uri = paymentsServiceUrl + "/payment";

    // Создаем объект HttpHeaders, в котором определяются заголовки HTTP-запроса
    HttpHeaders headers = new HttpHeaders();
    headers.add("requestId", UUID.randomUUID().toString());

    // Строим объект HttpEntity с данными запроса
    HttpEntity<Payment> httpEntity = new HttpEntity<>(payment, headers);

    // Отправляем HTTP-запрос и извлекаем данные из HTTP-ответа
    ResponseEntity<Payment> response =
        rest.exchange(uri,
            HttpMethod.POST,
            httpEntity,
            Payment.class);

    return response.getBody();  // Возвращаем тело HTTP-запроса
  }
}
