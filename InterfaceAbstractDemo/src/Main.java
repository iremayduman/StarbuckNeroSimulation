import Adapters.MernisServiceAdapter;
import Concrete.BaseCustomerManager;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {

		BaseCustomerManager customerManager2 = new NeroCustomerManager();
		BaseCustomerManager customerManager1 = new StarbucksCustomerManager(new MernisServiceAdapter());

		Customer customer = new Customer(1, "İrem", "Ayduman", "01.01.2000", "10599262966");
		customerManager2.save(customer);
		customerManager1.save(customer);
		
		
		Customer customer2 = new Customer(2, "Azra", "Ayduman", "1998.01.05", "4999626");
		
		customerManager2.save(customer2);
		customerManager1.save(customer2);
		
		
		
		

	}

}
