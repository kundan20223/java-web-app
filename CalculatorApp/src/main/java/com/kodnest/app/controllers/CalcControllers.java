package com.kodnest.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.kodnest.app.services.CalcServices;

@Controller
@RequestMapping("/api")
public class CalcControllers {
	
	CalcServices calservices;
	
	
	
	public CalcControllers(CalcServices calservices) {
		super();
		this.calservices = calservices;
	}
      
	/*@GetMapping("/")
	String index() {
		return "index";
	}

    @GetMapping("/calculate")
	String add(@RequestParam int a,@RequestParam int b,Model m) {
		 int c = calservices.add(a,b);
		 m.addAttribute("sum",c);
		 return "result";
	}*/
	
	@GetMapping("/")
    public String home() {
        return "index";
    }

    // Process the calculation and redirect to result page
    @PostMapping("/calculate")
    public String calculate(@RequestParam("num1") double n1,
                            @RequestParam("num2") double n2,
                            @RequestParam("operation") String operation,
                            Model model) {
        double result = 0;

        switch (operation) {
            case "add":
                result = calservices.add(n1, n2);
                break;
            case "sub":
                result = calservices.subtract(n1, n2);
                break;
            case "mul":
                result = calservices.multiply(n1, n2);
                break;
            case "div":
                if (n2 != 0) {
                    result = calservices.divide(n1, n2);
                } else {
                    model.addAttribute("error", "Division by zero is not allowed.");
                    model.addAttribute("num1", n1);
                    model.addAttribute("num2", n2);
                    return "result";
                }
                break;
            default:
                model.addAttribute("error", "Invalid operation.");
                return "result";
        }

        model.addAttribute("num1", n1);
        model.addAttribute("num2", n2);
        model.addAttribute("operation", operation);
        model.addAttribute("result", result);
        return "result";
    }

}
