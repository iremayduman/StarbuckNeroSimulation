package Concrete;

import Abstract.CustomerService;
import Entities.Customer;

public abstract class BaseCustomerManager implements CustomerService{

	@Override
	public void save(Customer customer) {
		System.out.println("Save to database: "+customer.getFirstName()+" "+customer.getLastName());
		
	}

}
