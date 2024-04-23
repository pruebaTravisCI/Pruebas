package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiContoller {

	@GetMapping("/helloWold")
	public String helloWorld(@RequestParam(name = "prueba", defaultValue = "mundo")String prueba){
	
		return "hola " + prueba;
	}
}
