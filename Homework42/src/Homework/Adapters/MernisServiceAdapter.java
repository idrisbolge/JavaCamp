package Homework.Adapters;

import java.rmi.RemoteException;
import java.time.ZoneId;

import Homework.Abstract.ICustomerCheckService;
import Homework.Entities.Customer;
import Homework.Utils.Result;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements ICustomerCheckService{
	
	
	@Override
	public boolean CheckIfRealPerson(Customer customer) throws NumberFormatException, RemoteException  {
		boolean result ;
		
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		
			return  client.TCKimlikNoDogrula(
					Long.parseLong(customer.getNationalityId()), 
					customer.getFirstName().toUpperCase(),
					customer.getLastName().toUpperCase(), 
					customer.getDateOfBirth().toInstant().atZone(ZoneId.systemDefault()).toLocalDate().getYear());
	}
}


	


