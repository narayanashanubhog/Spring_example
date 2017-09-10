package com.shanubhogh.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shanubhogh.Customer;
import com.shanubhogh.CustomerRepository;

@Service("customerService")
public class CustomerServiceImp implements CustomerService {
	@Autowired
	public void setCustomerRepository(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}

	
	private CustomerRepository customerRepository;//=new HibernateCustomerRepositoryImpl();
	
	/* (non-Javadoc)
	 * @see com.shanubhogh.service.CustomerService#findAll()
	 */
	@Override
	public List<Customer> findAll(){
		return customerRepository.findAll();
	}
	
}
