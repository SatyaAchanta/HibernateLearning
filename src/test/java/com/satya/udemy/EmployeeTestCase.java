package com.satya.udemy;

import static org.assertj.core.api.Assertions.assertThat;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.satya.udemy.employee.entities.Employee;
import com.satya.udemy.employee.repos.EmployeeRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EmployeeTestCase {

	@Autowired
	EmployeeRepository employeeRepository;
	
	@Test
	public void contextLoads() {
	}
	
	@Test
	public void testCreateEmployee() {
		
		Employee employee = new Employee();
		employee.setName("Satya");
		
		this.employeeRepository.save(employee);
	}
	
}
