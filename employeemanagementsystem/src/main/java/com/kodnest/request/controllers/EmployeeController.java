package com.kodnest.request.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kodnest.request.entities.Employee;
import com.kodnest.request.services.EmployeeService;

@RestController
@RequestMapping("/empapi")
public class EmployeeController {

	
	  EmployeeService  employeeService;

	  public EmployeeController(EmployeeService employeeService) {
		super();
		this.employeeService = employeeService;
	  }
	  
	  @GetMapping("/employees")
	  public List<Employee> getAllEmployees() {
		  
		   return employeeService.getAllEmployees();
	  }
	  
	  @GetMapping("/employee/{id}")
	  public Employee getEmployee(@PathVariable int id) {
		  return employeeService.getEmployee(id);
	  }
	  
	  @PostMapping("/employee") 
	  public Employee createEmployee(@RequestBody Employee ref) {
		  return employeeService.addEmployee(ref);
	  }
	  
	  @DeleteMapping("/employee/{id}") 
	  public String deleteEmployee(@PathVariable int id) {
		  Employee ref = employeeService.getEmployee(id);
		  if(ref!=null) {
			  employeeService.deleteEmployeeById(ref);
			  return "Employee Deleted Successfully";
		  }
		  
		  else {
			  return "Employee with id: " + id+" Doesnot Exist to delete";
		  }
	  }
	  
	  @PutMapping("/employee")
	  public Employee updateEmployee(@RequestBody Employee ref) {
		  
		   Employee existing= employeeService.getEmployee(ref.getId());
		   if(existing!=null) {
			   existing.setName(ref.getName());
			   existing.setGender(ref.getGender());
			   existing.setSalary(ref.getSalary());
			return    employeeService.addEmployee(ref);
		   }
		   else {
			   return null;
		   }
	  }
}
