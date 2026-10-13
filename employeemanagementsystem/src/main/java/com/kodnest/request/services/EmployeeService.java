package com.kodnest.request.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.kodnest.request.entities.Employee;
import com.kodnest.request.repositories.EmployeeRepo;

@Service
public class EmployeeService {
         EmployeeRepo employeeRepo;

		 public EmployeeService(EmployeeRepo employeeRepo) {
			super();
			this.employeeRepo = employeeRepo;
		 }
         
         public List<Employee> getAllEmployees() {
        	           
        	           return employeeRepo.findAll();
         }
         
         public Employee getEmployee(int id) {
        	       return employeeRepo.findById(id).orElse(null);
         }
         
         public void deleteEmployeeById(Employee ref)  {
        	        employeeRepo.delete(ref);
         }
         
         public Employee addEmployee(Employee ref) {
        	      return  employeeRepo.save(ref);
         }
         
         
}
