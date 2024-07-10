package com.MicroServicCrudSave.main.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.MicroServicCrudSave.main.Model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>
{

}
