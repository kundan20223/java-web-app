package com.kodnest.request.services;

import org.springframework.stereotype.Service;

@Service
public class RequestServices {
	
	
	
	
	public String generateMessage(String fname,String mname, String lname) {
		 return "Hello " + fname + " " + mname + " " + lname + "Welcome to kodnest";
	}

}
