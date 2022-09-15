
package com.employee.controller;

import java.util.List;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.employee.entity.Employee;
import com.employee.service.EmployeService;

@RestController
public class EmployeeController {
	@Autowired

	EmployeService employeeService;
	private final Logger logger = LoggerFactory.getLogger(EmployeeController.class);

	@GetMapping("/employee")
	public List<Employee> getAllEmploye() {
		logger.info("Endpoint 'getAllEmployee' was triggered");
		try {
			if (logger.isDebugEnabled()) {

			}
		} catch (Exception e) {
			logger.error("Exception at Endpoint 'getAllEmployee':"+e.getMessage());
			if (logger.isDebugEnabled()) {
				e.printStackTrace();
			}
		}

		return employeeService.getAllEmploye();
	}

	@PostMapping("/employee")
	public Employee saveEmployee(@RequestBody Employee employee) {
		logger.info("Endpoint 'saveEmployee' was triggered");
		try {
			if (logger.isDebugEnabled()) {

			}
		} catch (Exception e) {
			logger.error("Exception at Endpoint 'saveEmployee':"+e.getMessage());
			if (logger.isDebugEnabled()) {
				e.printStackTrace();
				
			}
		}

		return employeeService.saveEmployee(employee);

	}

	@PutMapping("/employee/{empId}")
	public Employee updateEmployees(@RequestBody Employee employee, @PathVariable Integer empId) {

		logger.info("Endpoint 'updateEmployees' was triggered");
		try {
			if (logger.isDebugEnabled()) {

			}
		} catch (Exception e) {
			logger.error("Exception at Endpoint 'updateEmployees':"+e.getMessage());
			if (logger.isDebugEnabled()) {
				e.printStackTrace();
			}
		}

		return employeeService.updateEmployeeById(employee, empId);
	}

	@DeleteMapping("/employee/{empId}")
	public void deleteEmployeeById(@PathVariable Integer empId) {
		
			logger.info("Endpoint 'deleteEmployeeById' was triggered");
			try {
				if(logger.isDebugEnabled()) {
					
				}
			}catch(Exception e) {
				logger.error("Exception at Endpoint 'deleleteById':"+e.getMessage());
				if(logger.isDebugEnabled()) {
					e.printStackTrace();
				}
			}

		employeeService.deleteById(empId);
	}

}