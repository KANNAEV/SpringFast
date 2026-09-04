package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {

  public static void main(String[] args) {
    SpringApplication.run(Main.class, args);
  }


  // curl -X POST -H 'content-type:application/json' -d '{"amount":1000}'  http://localhost:9090/payment
}
