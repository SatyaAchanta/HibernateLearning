package com.satya.udemy.employee.repos;

import org.springframework.data.repository.CrudRepository;

import com.satya.udemy.employee.entities.Employee;

/**
 * Repository for Employee
 * @author perso
 *
 */
public interface EmployeeRepository extends CrudRepository<Employee, Long> {

}
