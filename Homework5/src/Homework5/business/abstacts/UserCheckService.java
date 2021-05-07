package Homework5.business.abstacts;

import Homework5.entities.concretes.User;

public interface UserCheckService {
	void check(User user)throws Exception;
}
