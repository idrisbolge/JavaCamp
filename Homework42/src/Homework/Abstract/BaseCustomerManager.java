package Homework.Abstract;

import Homework.Entities.Customer;

public abstract class BaseCustomerManager implements ICustomerService{
	
	public void Save(Customer customer) throws Exception {
		System.out.println("sisteme kaydedildi");
	}
}
