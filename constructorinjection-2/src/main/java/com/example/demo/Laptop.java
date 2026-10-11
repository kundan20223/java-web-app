package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Laptop {
	
	@Autowired
	@Qualifier(value = "win")
	Oss os;
	
/*	@Autowired
	public Laptop(Os os) {
		super();
		this.os = os;
	}*/
	
	
	
	public void build() {
		System.out.println("Building the projject");
		os.operating();
	}

	/*public Os getOs() {
		return os;
	}

	@Autowired
	public void setOs(Os os) {
		this.os = os;
	}*/

}
