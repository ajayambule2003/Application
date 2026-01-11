package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.service.StudentService;

@Controller
@RequestMapping("/students")
public class StudentController {
	
	private StudentService service;
	
	// http://localhost:8080/Application/students/
	@GetMapping("/")
	public String openForm() {
		return "welcome";
	}
	
	

}
