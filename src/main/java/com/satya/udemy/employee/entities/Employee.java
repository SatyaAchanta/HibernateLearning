package com.satya.udemy.employee.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

/**
 * Entity for employee
 * @author perso
 *
 */
@Entity
@Table
public class Employee {
	
	// @TableGenerator(name="employee_gen", table = "id_gen", pkColumnName = "gen_name", valueColumnName = "gen_val", allocationSize = 100)
	@GenericGenerator(name="generic_emp_id", strategy="com.satya.udemy.utils.CustomGenerator")
	@GeneratedValue(generator = "generic_emp_id")
	@Id
	// @GeneratedValue(strategy=GenerationType.TABLE, generator="employee_gen")
	private long id;
	
	private String name;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
