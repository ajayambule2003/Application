package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DashboardController {

	@GetMapping("/dashboard")
	public String showDashboard(Model model) {
		model.addAttribute("memberName", "Ajay Ambule");
		model.addAttribute("assignedTasks", 5);
		model.addAttribute("completedTasks", 3);
		model.addAttribute("pendingTasks", 2);
		return "dashboard";
	}
}
