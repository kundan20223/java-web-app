package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
@RequestMapping("/api")
public class FirstWebController {
	
	/*public FirstWebController() {
		
		System.out.println("Object Created");
		
	}*/
	
	@GetMapping("/greet")
	@ResponseBody
	public String greet() {
		System.out.println("Method Called");
		String message = "Hello User";
		return message;
	}
	
	

}
