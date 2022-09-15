package com.employee.support.crudopeartion.employeeservice;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.employee.entity.Employee;
import com.employee.repository.EmployeeRepository;
import com.employee.service.EmployeService;

@SpringBootTest
public class EmployeeServiceTest {
	List<Employee> listEmployee;
	Employee employee;
	@MockBean
	private EmployeeRepository employeeRespository;
	@Autowired
	private EmployeService employeeService;

	@BeforeEach
	void init() {
		employee = new Employee();
		listEmployee = new ArrayList<Employee>();

	}

	@Test
	public void TestGetAll() {
		employee.setEmpId(2);
		listEmployee.add(employee);
		when(employeeRespository.findAll()).thenReturn(listEmployee);
		assertEquals(1, employeeService.getAllEmploye().size());

	}

	@Test
	public void SaveEmployee() {
		// Employee employee=new Employee();
		employee.setEmpId(2);
		when(employeeRespository.save(employee)).thenReturn(employee);

		assertEquals(employee, employeeService.saveEmployee(employee));

	}

	@Test
	public void updateEmployeeById() {
		Integer empId = 2;
		employee.setEmpId(2);

		when(employeeRespository.save(employee)).thenReturn(employee);
		assertEquals(employee, employeeService.updateEmployeeById(employee, empId));

	}

	@Test
	public void deleteById() {
		

		 Integer empId=2;
		employeeService.deleteById(empId);
		verify(employeeRespository,times(1)).deleteById(2);

	}

	// public void deleteById(Integer empId) {
	// employeeRespository.deleteById(empId);
	// }

}

	

	
	