package Homework;


import java.util.GregorianCalendar;
import Homework.Abstract.BaseCustomerManager;
import Homework.Adapters.MernisServiceAdapter;
import Homework.Concrete.NeroCustomerManager;
import Homework.Concrete.StarbuckCustomerManager;
import Homework.Entities.Customer;

public class Main {

	public static void main(String[] args) throws Exception {
		
		Customer customer = new Customer(1,"Ýdris","Bölge",new GregorianCalendar(1977,11,1).getTime(),"32341483884");
		BaseCustomerManager customerManager = new StarbuckCustomerManager(new MernisServiceAdapter());
		customerManager.Save(customer);

	}

}
