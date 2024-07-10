package com.MicroServicCrudSave.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.MicroServicCrudSave.main.Model.Employee;
import com.MicroServicCrudSave.main.ServiceI.EmployeeServiceI;

@RestController
public class HomeController 
{
	@Autowired
	EmployeeServiceI es;
	
	@GetMapping("/")
	public String preLogin()
	{
		return "Employee Details";
		
	}
	@PostMapping("/saveEmployee")
	public Employee saveEmployee(@RequestBody Employee e) 
	{
		Employee emp=es.saveEmployee(e);
			return emp;
	}
	@GetMapping("/Employee/{id}") 
			public List<Employee> allEmployee(@RequestBody Employee emp) 
			{
			  List<Employee>employees=es.allEmployee(emp);
			  return employees;
		 
			}
		
	
}
