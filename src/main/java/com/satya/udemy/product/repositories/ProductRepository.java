/**
 * 
 */
package com.satya.udemy.product.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.satya.udemy.product.entities.Product;

/**
 * @author sachanta
 *
 */
public interface ProductRepository extends CrudRepository<Product, Integer> {
	
}
