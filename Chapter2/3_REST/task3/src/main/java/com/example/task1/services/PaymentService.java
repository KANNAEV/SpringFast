package com.example.task1.services;
import com.example.task1.exeptions.NotEnoughMoneyException;
import com.example.task1.models.PaymentDetails;
import org.springframework.stereotype.Service;

// Сервис логики обработки платежей
// В данном примере он просто выдаст исключение
// В реальных приложениях такие сервисы выполняют сложную логику электронных платежей
@Service
public class PaymentService {
	public PaymentDetails processPayment() {
		throw new NotEnoughMoneyException();  // 👈 Генерируем ошибку


	}
}
