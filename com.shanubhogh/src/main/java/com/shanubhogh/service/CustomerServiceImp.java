package com.shanubhogh.service;

import java.util.List;

import com.shanubhogh.Customer;
import com.shanubhogh.CustomerRepository;
import com.shanubhogh.HibernateCustomerRepositoryImpl;

public class CustomerServiceImp implements CustomerService {

	private CustomerRepository customerReporty=new HibernateCustomerRepositoryImpl();
	
	/* (non-Javadoc)
	 * @see com.shanubhogh.service.CustomerService#findAll()
	 */
	@Override
	public List<Customer> findAll(){
		return customerReporty.findAll();
	}
	
}
