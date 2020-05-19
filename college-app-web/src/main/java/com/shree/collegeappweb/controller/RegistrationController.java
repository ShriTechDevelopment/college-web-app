package com.shree.collegeappweb.controller;

import org.springframework.stereotype.Controller;

@Controller
public class RegistrationController {
	
	public String registrationForm() {
		return "registration";
	}

}
