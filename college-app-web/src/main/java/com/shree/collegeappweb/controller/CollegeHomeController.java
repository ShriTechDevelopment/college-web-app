package com.shree.collegeappweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CollegeHomeController {
	
	@RequestMapping(value = "/")
	public String home() {
		return "index";
	}

}
