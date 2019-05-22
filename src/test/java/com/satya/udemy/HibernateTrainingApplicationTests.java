package com.satya.udemy;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.satya.udemy.product.entities.Product;
import com.satya.udemy.product.repositories.ProductRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HibernateTrainingApplicationTests {

	@Autowired
	ProductRepository repository;

	@Test
	public void contextLoads() {
	}

	/**
	 * Test for createProduct
	 */
	@Test
	public void testCreateProduct() {

		Product currentProduct = new Product();

		currentProduct.setId(3);
		currentProduct.setDesc("Mobile");
		currentProduct.setName("iPhone");
		currentProduct.setPrice(10000);

		Product savedProduct = repository.save(currentProduct);

		assertEquals(savedProduct.getId(), currentProduct.getId());
	}

	/**
	 * Test for findProduct
	 */
	@Test
	public void testFindProduct() {

		int productId = 3;

		Optional<Product> product = repository.findById(productId);

		assertEquals(product.get().getId(), productId);
	}

	/**
	 * Test for updating product details
	 */
	@Test
	public void testUpdateProduct() {

		int productId = 3;

		Optional<Product> product = repository.findById(productId);

		Product currentProduct = product.get();

		currentProduct.setDesc("Innovative Mobile");

		repository.save(currentProduct);

		// TODO: read product with ID 3 and assert the desc

	}

	/**
	 * Test for delete product
	 */
	@Test
	public void deleteProduct() {

		int productId = 3;

		if (repository.existsById(productId)) {

			Optional<Product> product = repository.findById(productId);

			Product currentProduct = product.get();

			repository.delete(currentProduct);
		}
	}

}
