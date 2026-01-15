package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.model.Student;
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
	
	@PostMapping(value="/new", method =RequestMethod.GET)
	public String studentRegistrationForm(Model model) {
		model.addAttribute("stud",new Student());
		return "studform";
		
	}
	
	

}
