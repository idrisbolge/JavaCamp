package Homework5.business.concretes;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import Homework5.business.abstacts.UserActivationService;
import Homework5.core.utils.mail.MailService;
import Homework5.dataAccess.abstracts.UserActivationDao;
import Homework5.dataAccess.abstracts.UserDao;
import Homework5.entities.concretes.User;
import Homework5.entities.concretes.UserActivation;

public class UserActivationManager implements UserActivationService{

	private UserDao userDao;
	private UserActivationDao userActivationDao;
	private MailService mailService;
	
	
	public UserActivationManager(UserDao userDao, UserActivationDao userActivationDao , MailService mailService) {
		this.userDao = userDao;
		//this.mailService = mailService;
		this.userActivationDao = userActivationDao;
	}
	
	@Override
	public void add(User user) {
		UUID uuid = UUID.randomUUID();
		String activationCode = uuid.toString();
		
		this.userActivationDao.add(new UserActivation(1,user.getId(),activationCode));
		this.mailService.sendMail(user.getEmail(), 	activationCode);
		
	}

	@Override
	public void check(String activationCode) {
		List<User> userList = userDao.getAll();
		List<UserActivation> activationList = userActivationDao.getUserActivationList();
		
		UserActivation userActivation = (UserActivation) activationList.stream().filter(u->u.getActivationCode()==activationCode).collect(Collectors.toList());
		if(userActivation !=null) {
			int userId = userActivation.getUserId();
			User user = (User) userList.stream().filter(u->u.getId()==userId).collect(Collectors.toList());
			user.setActive(true);
			this.userDao.update(user);
			System.out.println("Kullanýcý aktif edildi.");
		}
		else {
			System.out.println("Kullanýcý aktif edilemedi.");
		}
		
		 
	}
	
	
}
