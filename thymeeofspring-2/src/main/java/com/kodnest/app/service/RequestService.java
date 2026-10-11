package com.kodnest.app.service;

import org.springframework.stereotype.Service;

@Service
public class RequestService {
	
	public String generateMessage(int x) {
		return "Hello user " + x + "Welcome To Kodnest";
	}

}
