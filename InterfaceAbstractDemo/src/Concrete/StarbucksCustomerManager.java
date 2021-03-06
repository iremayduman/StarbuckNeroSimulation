package Concrete;


import Entities.Customer;
import Abstract.CustomerCheckService;

public class StarbucksCustomerManager extends BaseCustomerManager{
	CustomerCheckService customerCheckService;
	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		super();
		this.customerCheckService = customerCheckService;
	}
	@Override
	public void save(Customer customer) {
		if( customerCheckService.checkIfRealPerson(customer)) {
			System.out.println("Starbucks müşterisi kaydedildi!! : "+customer.getFirstName()+" "+customer.getLastName() );
		}
		
		else {
			System.out.println("Müşteri bilgisi doğrulanamadı");
		}
	}
	

	
}
