package com.shanubhogh.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.shanubhogh.Customer;
import com.shanubhogh.CustomerRepository;
@Service("customerService")
//@Scope("singleton")
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class CustomerServiceImp implements CustomerService {

	
	private CustomerRepository customerReporty;//=new HibernateCustomerRepositoryImpl();
	
	public CustomerServiceImp()
	{
		
	}
	
	public CustomerServiceImp(CustomerRepository customerReporty)
	{
		System.out.println("we are using constructor injection");
		this.customerReporty = customerReporty;
	}
	
	@Autowired
	public void setCustomerReporty(CustomerRepository customerReporty) {
		System.out.println("we are using setter injection");
		this.customerReporty = customerReporty;
	}

	/* (non-Javadoc)
	 * @see com.shanubhogh.service.CustomerService#findAll()
	 */
	@Override
	public List<Customer> findAll(){
		return customerReporty.findAll();
	}
	
}
