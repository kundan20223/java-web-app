package com.example.demo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component(value="win")

public class Windows implements Oss{
	
	@Override
	public void operating() {
		
		System.out.println("Windows os is operating");
	}

}
