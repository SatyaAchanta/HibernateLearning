package com.satya.udemy.customer.repos;

import org.springframework.data.repository.CrudRepository;

import com.satya.udemy.customer.entities.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Integer> {

}
