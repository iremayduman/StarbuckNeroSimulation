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
			System.out.println("Starbucks m��terisi kaydedildi!! : "+customer.getFirstName()+" "+customer.getLastName() );
		}
		
		else {
			System.out.println("M��teri bilgisi do�rulanamad�");
		}
	}
	

	
}
