package Homework5.business.abstacts;

import Homework5.entities.concretes.User;

public interface UserActivationService {
	public void add(User user);
	public void check(String activationCode);
}
