package Homework.Concrete;

import Homework.Abstract.ICustomerCheckService;
import Homework.Entities.Customer;

public class CustomerCheckManager implements ICustomerCheckService{

	
	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		
		
		return true;
	}

	
	
}
