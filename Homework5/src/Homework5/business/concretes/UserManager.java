package Homework5.business.concretes;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

import Homework5.business.abstacts.UserActivationService;
import Homework5.business.abstacts.UserCheckService;
import Homework5.business.abstacts.UserService;
import Homework5.business.abstacts.UserValidationService;
import Homework5.dataAccess.abstracts.UserDao;
import Homework5.entities.concretes.User;

public class UserManager implements UserService {
	
	private UserDao userDao ;
	private UserValidationService userValidationService;
	private UserCheckService userCheckService;
	private UserActivationService userActivationService;	
	
	
	private List<String> mailList = new ArrayList<String>() ;
	
	
	public UserManager(UserDao userDao,UserValidationService userValidationService, UserCheckService userCheckService, UserActivationService userActivationService) {
		this.userDao = userDao;
		this.userValidationService = userValidationService;
		this.userCheckService = userCheckService;
		this.userActivationService = userActivationService;	
	}


	@Override
	public void signin(User user) {
	
		try {
			this.userValidationService.validate(user);
			this.userCheckService.check(user);
		} catch (Exception e) {
			e.printStackTrace();
			return;
		}
		
		this.userDao.signin(user);
		System.out.println(user.toString()+" kullanýcýsý oluþturuldu.");
		this.userActivationService.add(user);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*if(user.getPassword().length()<6) {
			System.out.println("Parola 6 karakterden büyük olmalýdýr");
			return;
		}
		
		else if(!Pattern.matches(".+@hotmail.com", user.getEmail())){
			System.out.println("Lütfen geçerli bir mail adresi giriniz.");
			return;
		}
		else if(user.getFirstName().length()<2 || user.getLastName().length()<2){
			System.out.println("Ad ve Soyad en az iki haneli olmalýdýr.");
			return;
		}
		
		else if(mailList.contains(user.getEmail())) {
			System.out.println("Bu E-mail daha önce kullanýlmýþtýr.");
			return;
		}
		
	
			mailList.add(user.getEmail());
			this.userDao.signin(user);	*/
		

	}


	@Override
	public User login(User user) {
		List<User>userList = this.userDao.getAll();
		
		for(User getUser : userList) {
			
			if(getUser.getEmail().equals(user.getEmail().toLowerCase()) 
					&& getUser.getPassword().contains(user.getPassword())){
				userDao.login(getUser);	
				return getUser;
			}	
		}
		System.out.println("Kullanýcý veya Þifreniz Yanlýþ");
		return null;
	}

}
