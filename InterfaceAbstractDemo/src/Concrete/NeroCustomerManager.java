package Concrete;

import Entities.Customer;

public class NeroCustomerManager extends BaseCustomerManager{
	@Override
public void save(Customer customer) {
	System.out.println("Nero müþterisi kaydedildi!! : "+customer.getFirstName()+" "+customer.getLastName() );
}
}
