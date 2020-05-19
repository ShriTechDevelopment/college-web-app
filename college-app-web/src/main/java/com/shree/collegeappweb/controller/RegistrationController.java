package com.shree.collegeappweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class RegistrationController {
	
	@RequestMapping(value = "/registration")
	public String registrationForm() {
		return "registration";
	}
	
	@RequestMapping(value = "/registration", method = RequestMethod.POST )
	public String save(@RequestBody Object object) {
		return null;
	}

}
