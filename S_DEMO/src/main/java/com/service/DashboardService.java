package com.service;

import org.springframework.stereotype.Service;

@Service
public class DashboardService {
	public String getWelcomeMessage(String name) {
		return "Welcome back, " + name + "!";
	}

}
