/**
 * 
 */
package com.satya.udemy.product.repositories;

import org.springframework.data.repository.CrudRepository;

import com.satya.udemy.product.entities.Product;

/**
 * @author sachanta
 *
 */
public interface ProductRepository extends CrudRepository<Product, Integer> {

}
