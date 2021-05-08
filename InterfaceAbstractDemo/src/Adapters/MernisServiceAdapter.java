package Adapters;

import Abstract.CustomerCheckService;
import Entities.Customer;

public class MernisServiceAdapter implements CustomerCheckService {

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		if(customer.getNationalityId().length()==11) {
			return true;
		}
		else {
			return false;
		}
		
	}

}
