package Homework5.core.concretes;

import Homework5.Google.GoogleLogin;
import Homework5.core.abstracts.GoogleService;
import Homework5.entities.concretes.User;

public class GoogleAdapter implements GoogleService{

	@Override
	public void googleLoginSystem(User user) {
		GoogleLogin login = new GoogleLogin();
		login.googleLogin(user);;	
	}
}
