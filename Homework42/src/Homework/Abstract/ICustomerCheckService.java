package Homework.Abstract;

import java.rmi.RemoteException;

import Homework.Entities.Customer;

public interface ICustomerCheckService   {
	
	boolean CheckIfRealPerson(Customer customer)throws NumberFormatException, RemoteException;

}
