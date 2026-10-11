package com.example.demo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component(value="unix")

public class Unix implements Oss {
	
	
	@Override
	public void operating() {
		System.out.println("Unix os is operating");
	}

}
