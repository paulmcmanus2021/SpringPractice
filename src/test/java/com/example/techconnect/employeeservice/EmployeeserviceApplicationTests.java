package com.example.techconnect.employeeservice;

import com.example.techconnect.employeeservice.models.Employee;
import com.example.techconnect.employeeservice.repositories.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class EmployeeserviceApplicationTests {

	@Autowired
	private EmployeeRepository employeeRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void canGetEmployeeFirstName(){
		Employee employee = new Employee ("Daniel", "Larusso", "Karate", 20000);
		assertEquals("Daniel",employee.getFirstName());
	}

	@Test
	public void canGetEmployeeLastName(){
		Employee employee = new Employee("Tony", "Montana", "Importing", 100000);
		assertEquals("Montana", employee.getLastName());
	}

	@Test
	public void canGetEmployeeDepartment(){
		Employee employee = new Employee ("Hannibal", "Lecter", "Kitchen", 50000);
		assertEquals("Kitchen", employee.getDepartment());
	}

	@Test
	public void canGetEmployeeSalary(){
		Employee employee = new Employee("Ferris", "Bueller", "Fun", 0);
		assertEquals(0, employee.getSalary());
	}

	@Test
	public void canCreateAndSaveEmployeeObject(){
		Employee employee = new Employee("Paul", "McManus", "Development", 25000);
		employeeRepository.save(employee);
	}

}
