package com.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.entity.Employee;
import com.employee.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeService {

	@Autowired
	private EmployeeRepository employeeRespository;

	@Override
	public List<Employee> getAllEmploye() {
		return employeeRespository.findAll();
	}

	@Override
	public Employee saveEmployee(Employee employee) {
		return employeeRespository.save(employee);
	}

	@Override
	public Employee updateEmployeeById(Employee employee, Integer empId) {
		return employeeRespository.save(employee);

	}

	@Override
	
	public void deleteById(Integer empId) {
	employeeRespository.deleteById(empId);
	}

	
}