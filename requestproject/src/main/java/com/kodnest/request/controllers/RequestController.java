package com.kodnest.request.controllers;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kodnest.request.services.RequestServices;

@Controller
@RequestMapping("/api")
public class RequestController {
	
	RequestServices ref;
	
	
	
	
           @Autowired
	         public RequestController(RequestServices ref) {
		
		this.ref = ref;
	}


            @GetMapping("/show1/{Fname}/{Mname}/{Lname}")
            @ResponseBody
           String method1(@PathVariable String fname,@PathVariable String mname,@PathVariable String lname) {
        	         
        	   String content=ref.generateMessage(fname, mname, lname);
        	         return content;
           }
            
            
       /*     @GetMapping("/show2")
            @ResponseBody
            String method2( @RequestParam String name) {
   	         
         	   String content=ref.generateMessage(name);
         	         return content;
            }
            
            @GetMapping("/show3")
            @ResponseBody
            String method3(@RequestBody Map<String, String>  req) {
   	         String name = req.get("username");
         	   String content=ref.generateMessage(name);
         	         return content;
            }*/
            
            
            
            

			
}
