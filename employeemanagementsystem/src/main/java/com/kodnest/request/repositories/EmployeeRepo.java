package com.kodnest.request.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kodnest.request.entities.Employee;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Integer>{

}
