package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Student {
	
	@RequestMapping
	public String shoe()
	{
		return "siva";
	}

}
