package com.satya.udemy.product.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Entity class for the database table Product
 * @author sachanta
 *
 */
@Entity
@Table
public class Product {

	@Id
	private int id;

	private String name;

	/**
	 * We have to specify @Column attribute
	 * when the column name in database
	 * is different from the variable name
	 * In our case desc is different from 
	 * "description" in the database table
	 */
	@Column(name="description")
	private String desc;

	private double price;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
