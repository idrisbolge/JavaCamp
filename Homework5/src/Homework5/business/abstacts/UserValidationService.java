package Homework5.business.abstacts;

import Homework5.entities.concretes.User;

public interface UserValidationService {
	void validate(User user)throws Exception;
}
