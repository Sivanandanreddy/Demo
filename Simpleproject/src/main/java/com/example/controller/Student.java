package com.example.controller;

import javax.annotation.Generated;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Student {
	
	@RequestMapping
	@GetMapping
	public String shoe()
	{
		return "siva";
	}

}
