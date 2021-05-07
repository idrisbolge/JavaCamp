package Homework5;


import Homework5.business.abstacts.UserActivationService;
import Homework5.business.abstacts.UserCheckService;
import Homework5.business.abstacts.UserService;
import Homework5.business.abstacts.UserValidationService;
import Homework5.business.concretes.UserActivationManager;
import Homework5.business.concretes.UserCheckManager;
import Homework5.business.concretes.UserManager;
import Homework5.business.concretes.UserValidationManager;
import Homework5.core.utils.mail.CustomMailManager;
import Homework5.core.utils.mail.MailService;
import Homework5.dataAccess.abstracts.UserActivationDao;
import Homework5.dataAccess.abstracts.UserDao;
import Homework5.dataAccess.concretes.InMemoryUserActivate;
import Homework5.dataAccess.concretes.InMemoryUserDao;
import Homework5.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		
		UserDao userDao= new InMemoryUserDao();
		UserValidationService userValidationService = new UserValidationManager();
		UserActivationDao userActivationDao = new InMemoryUserActivate();

		UserCheckService userCheckService = new UserCheckManager(userDao);
		MailService mailService = new CustomMailManager();	
		UserActivationService userActivationService = new UserActivationManager(userDao, userActivationDao, mailService);
		
		User user =new User(1,"Ýdris","Bölge","idris@hotmail.com","123456");
		User user2 =new User(2,"Ali","Bölge","idris@hotmail.com","1234567");
		UserService userService = new UserManager(userDao, userValidationService, userCheckService, userActivationService);
		userService.signin(user);
		userService.signin(user2);
		
		
		userService.login(user);
		
		

	}

}
