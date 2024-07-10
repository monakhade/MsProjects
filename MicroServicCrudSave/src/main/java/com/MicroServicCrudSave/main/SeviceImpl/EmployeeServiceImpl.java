package com.MicroServicCrudSave.main.SeviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MicroServicCrudSave.main.Model.Employee;
import com.MicroServicCrudSave.main.Repository.EmployeeRepository;
import com.MicroServicCrudSave.main.ServiceI.EmployeeServiceI;
@Service
public class EmployeeServiceImpl implements EmployeeServiceI
{
	@Autowired
	EmployeeRepository er;

	@Override
	public Employee saveEmployee(Employee e) 
	{
		Employee emp=er.save(e);
		return emp;
	}

	@Override
	public List<Employee> allEmployee(Employee emp) 
	{
		return (List<Employee>) er.findAll();
		
	}
	

}
