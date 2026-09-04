package com.example.task1.services;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.ApplicationScope;

// Пример бина с областью видимости на уровне приложения
@Component
@ApplicationScope
public class LoginCountService {
	private int count;

	public int getCount() {
		return count;
	}

	public void incrementCount() {
		count++;
	}
}
