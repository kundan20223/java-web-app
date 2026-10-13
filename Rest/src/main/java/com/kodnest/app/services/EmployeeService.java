package com.kodnest.app.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.kodnest.app.entities.Employee;
import com.kodnest.app.repositories.EmployeeRepo;

@Service
public class EmployeeService {
	
	EmployeeRepo employeeRepo;
	
	
	
	public EmployeeService(EmployeeRepo emplooyeeRepo) {
		super();
		this.employeeRepo = emplooyeeRepo;
	}



	public List<Employee>getAllEmployees() {
		  return employeeRepo.findAll();
	}
	
	public Employee getEmployee(int id) {
	/*	Optional<Employee> ref =employeeRepo.findById(id); 
		if(ref!=null) {
		    Employee e = ref.get();
		    return e;
		}
		else {
			return null;
		}*/
		
		return employeeRepo.findById(id).orElse(null);
	}

}
