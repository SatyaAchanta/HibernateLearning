package com.satya.udemy;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.satya.udemy.customer.entities.Customer;
import com.satya.udemy.customer.repos.CustomerRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CustomerTestCase {

	@Autowired
	CustomerRepository customerRepository;

	/**
	 * Test Case for Create
	 */
	@Test
	public void testCreateCustomer() {

		Customer customer = new Customer();
		// customer.setId(1);
		customer.setName("Cus1");
		customer.setEmail("cust1@gmail.com");

		Customer savedCustomer = customerRepository.save(customer);

		// assertThat(savedCustomer.getId()).isEqualTo(customer.getId());
	}

	/**
	 * Test case for Update
	 */
	@Test
	public void updateCustomer() {

		int customerId = 1;

		Optional<Customer> optionalCustomer = customerRepository.findById(customerId);

		Customer customer = optionalCustomer.get();

		customer.setName("Customer1");

		Customer updatedCustomer = customerRepository.save(customer);

		assertThat(updatedCustomer.getName()).isEqualTo(customer.getName());
	}

	/**
	 * Test for read customer
	 */
	@Test
	public void readCustomer() {

		int customerId = 1;

		if (customerRepository.existsById(customerId)) {

			Optional<Customer> optionalCustomer = customerRepository.findById(customerId);

			Customer customer = optionalCustomer.get();

			assertThat(customer.getId()).isEqualTo(customerId);
		} else {
			System.out.println("No Customer Found");
		}
	}
	
	
	/**
	 * test for delete customer
	 */
	@Test
	public void deleteCustomer() {
		// TODO
	}

}
