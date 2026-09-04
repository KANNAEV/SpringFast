package com.example.task1.exeptions;

// RuntimeException относится к unchecked (необязательно обрабатывать)
public class NotEnoughMoneyException extends RuntimeException {
	// Пустой класс! Но он важен!
	// Дает имя ошибке (вместо Exception говорим NotEnoughMoneyException)
	// Позволяет отличить эту ошибку от других
	// Spring может перехватить именно ЕЁ
}
