package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@RequestMapping(value="/hello",method=RequestMethod.GET)
	public String say() { 
		return "Hello Spring Boot!";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         System.out.println("Hello Spring Boot!");
	}

}
