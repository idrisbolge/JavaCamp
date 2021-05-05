package Homework.Concrete;

import Homework.Abstract.BaseCustomerManager;
import Homework.Abstract.ICustomerCheckService;
import Homework.Entities.Customer;

public class StarbuckCustomerManager extends BaseCustomerManager{
	
	ICustomerCheckService customerCheckService;
	
	
	
	
		@Override
		public void Save(Customer customer) throws Exception 
		{
			if (customerCheckService.CheckIfRealPerson(customer)) 
				super.Save(customer);
			else
			throw new Exception("Not a valid person");
		}




		public StarbuckCustomerManager(ICustomerCheckService customerCheckService) {
			super();
			this.customerCheckService = customerCheckService;
		}
}
