package com.codegym.service;

import java.util.List;

import com.codegym.model.Customer;

public interface ICustomerService {
	
	List<Customer> findAll();
	
	Customer findById(int id);
	
	void save(Customer customer);
	
	void update(int id, Customer customer);
	
	void remove(int id);

}
