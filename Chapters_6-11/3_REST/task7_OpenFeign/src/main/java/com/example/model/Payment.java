package com.example.model;

// DTO-модель для передачи данных между сервисами.
public class Payment {

  private String id;
  private double amount;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public double getAmount() {
    return amount;
  }
  public Payment() {
  }

  public void setAmount(double amount) {
    this.amount = amount;
  }
}
