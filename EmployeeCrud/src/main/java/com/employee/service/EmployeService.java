package com.employee.service;

import java.util.List;

import com.employee.entity.Employee;

public interface EmployeService {
	List<Employee>getAllEmploye();

	Employee saveEmployee(Employee employee);

	Employee updateEmployeeById(Employee employee,Integer empId);

	void deleteById(Integer empId);

	


}