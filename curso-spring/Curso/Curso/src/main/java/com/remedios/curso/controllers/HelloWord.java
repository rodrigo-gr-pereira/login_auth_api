package com.remedios.curso.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloWord {
	
	public String olaMundo() {
		return "Hello Word";
	}

}
