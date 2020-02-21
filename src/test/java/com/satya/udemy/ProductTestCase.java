package com.satya.udemy;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.util.ArrayList;
import java.util.List;
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
public class ProductTestCase {

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

		List<Product> allProducts = this.createTestProducts(15);

		for(Product currentProduct : allProducts) {
			
			this.repository.save(currentProduct);
		}
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
	
	/**
	 * Creates List of Products
	 * @param numberOfProducts
	 * @return
	 */
	private List<Product> createTestProducts(int numberOfProducts) {
		
		List<Product> allProducts = new ArrayList<Product>();
		
		for (int currentProduct = 1; currentProduct <= numberOfProducts; currentProduct++) {
			
			Product product = new Product();
			
			product.setId(currentProduct + 1);
			product.setDesc("Product Desc" + currentProduct);
			product.setName("Product " + currentProduct);
			product.setPrice(currentProduct * 250.50);
			
			allProducts.add(product);
		}
		
		return allProducts;
	}

}
