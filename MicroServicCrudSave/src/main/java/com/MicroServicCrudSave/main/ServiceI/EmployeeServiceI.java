package com.MicroServicCrudSave.main.ServiceI;

import java.util.List;

import com.MicroServicCrudSave.main.Model.Employee;

public interface EmployeeServiceI {

	public Employee saveEmployee(Employee e);

	public List<Employee> allEmployee(Employee emp);

}
