package com.example.task1.model;

import com.example.task1.services.LoggedUserManagementService;
import com.example.task1.services.LoginCountService;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

@Component
@RequestScope
public class LoginProcessor {

	private final LoggedUserManagementService loggedUserManagementService;
	private final LoginCountService loginCountService;

	private String username;
	private String password;

	public LoginProcessor(
			LoggedUserManagementService loggedUserManagementService,
			LoginCountService loginCountService
	) {
		this.loggedUserManagementService = loggedUserManagementService;
		this.loginCountService = loginCountService;
	}

	public boolean login() {
		// Увеличиваем счетчик при каждой попытке аутентификации
		loginCountService.incrementCount();
		String username = this.username;
		String password = this.password;

		boolean loginResult = false;

		if ("natalie".equals(username) && "password".equals(password)) {
			loginResult = true;
			loggedUserManagementService.setUsername(username);
		}
		return loginResult;
	}


	// Getters and Setters
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
