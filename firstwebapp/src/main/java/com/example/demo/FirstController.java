package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/api")
public class FirstController {
	
	public FirstController() {
		System.out.println("OBJECT CREATED");
	}
	
	@GetMapping("/greet")
	@ResponseBody
	public String greet() {
		System.out.println("METHOD CALLED");
		String message = "HELLO USER";
		return message;
	}

}
