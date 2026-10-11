package com.kodnest.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kodnest.app.service.RequestService;


@Controller
@RequestMapping("/api")
public class RequestController {
          int a  = 0;
          
          RequestService ref;
          
          
          @Autowired
          public RequestController( RequestService ref) {
			super();
			
			this.ref = ref;
		}


         @GetMapping("/show")
		  String getPage(Model m) {
			String content  =ref.generateMessage(++a);
			m.addAttribute("message", content);
        	  return "page";
          }
}
