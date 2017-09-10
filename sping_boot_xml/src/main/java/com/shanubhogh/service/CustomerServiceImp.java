package com.shanubhogh.service;

import java.util.List;

import com.shanubhogh.Customer;
import com.shanubhogh.CustomerRepository;

public class CustomerServiceImp implements CustomerService {

	private CustomerRepository customerRepository; // =new
	
	public CustomerServiceImp()
	{
		
	}
	
	public CustomerServiceImp(CustomerRepository customerRepository)
	{
		this.customerRepository=customerRepository;
	}
	public void setCustomerRepository(CustomerRepository customerReporty) {
		this.customerRepository = customerReporty;
	}

	// HibernateCustomerRepositoryImpl();

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.shanubhogh.service.CustomerService#findAll()
	 */
	@Override
	public List<Customer> findAll() {
		return customerRepository.findAll();
	}

	
}
