package com.kodnest.business;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
@RequestMapping("/api")
public class DynamicController {
	
	int a  = 0;
	@GetMapping("/show")
	String getContent(Model m) {
		String content = "HELLO USER "+  ++a + "WELCOME";
		m.addAttribute("message", content);
		return "welcome";
	}

}
