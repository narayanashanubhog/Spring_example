package com.shanubhogh;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;
@Repository("customerRepository")
public class HibernateCustomerRepositoryImpl implements CustomerRepository {

	@Value("${dbUserName}")
	private String dbUserName;
	/* (non-Javadoc)
	 * @see com.shanubhogh.CustomerRepository#findAll()
	 */
	@Override
	public List<Customer> findAll(){
		System.out.println(dbUserName);
		List<Customer> customers=new ArrayList<>();
		Customer customer=new Customer();
		customer.setFirstName("Narayan");
		customer.setLastName("shanu");
		customers.add(customer);
		return customers;
			
	}
}
