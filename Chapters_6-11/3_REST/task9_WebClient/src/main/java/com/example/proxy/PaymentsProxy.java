package com.example.proxy;

import com.example.model.Payment;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Component
public class PaymentsProxy {

  private final WebClient webClient;

  @Value("${name.service.url}")
  private String url;  // Извлекаем базовый URL из файла свойств

  public PaymentsProxy(WebClient webClient) {
    this.webClient = webClient;
  }

  public Mono<Payment> createPayment(String requestId, Payment payment) {
    return webClient.post() // Определяем HTTP-метод, который будет использоваться при вызове
            .uri(url + "/payment") // Определяем URI вызова
              .header("requestId", requestId) // Добавляем к запросу HTTP-заголовок (можно вызвать несколько раз Для создания нескольких заголовков)
              .body(Mono.just(payment), Payment.class) // Формируем тело HTTP-запроса
              .retrieve() // Отправляем HTTP-запрос и получаем ответ
              .bodyToMono(Payment.class); // Извлекаем тело HTTP-запроса
  }
}
