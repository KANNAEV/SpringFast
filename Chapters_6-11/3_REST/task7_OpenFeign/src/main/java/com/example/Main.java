package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/***************************************************
* Прокси (шлюз) между клиентом и платёжным сервисом.
* Он не делает сам платёж, а просто перенаправляет запрос.
 ***************************************************/

@SpringBootApplication
public class Main {

  public static void main(String[] args) {
    SpringApplication.run(Main.class, args);
  }

}
