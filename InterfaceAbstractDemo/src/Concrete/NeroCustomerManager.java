package Concrete;

import Entities.Customer;

public class NeroCustomerManager extends BaseCustomerManager{
	@Override
public void save(Customer customer) {
	System.out.println("Nero m��terisi kaydedildi!! : "+customer.getFirstName()+" "+customer.getLastName() );
}
}
