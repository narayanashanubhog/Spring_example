package com.shanubhogh;

import java.util.ArrayList;
import java.util.List;

public class HibernateCustomerRepositoryImpl implements CustomerRepository {

	/* (non-Javadoc)
	 * @see com.shanubhogh.CustomerRepository#findAll()
	 */
	@Override
	public List<Customer> findAll(){
		List<Customer> customers=new ArrayList<>();
		Customer customer=new Customer();
		customer.setFirstName("Narayan");
		customer.setLastName("shanu");
		customers.add(customer);
		return customers;
			
	}
}
