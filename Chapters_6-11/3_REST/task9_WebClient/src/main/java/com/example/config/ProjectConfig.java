package com.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class ProjectConfig {

  @Bean
  // Создаем бин WebClient и добавляем его в контекст Spring
  public WebClient webClient() {
    return WebClient.builder().build();
  }
}
