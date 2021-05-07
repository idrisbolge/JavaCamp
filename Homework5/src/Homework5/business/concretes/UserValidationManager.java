package Homework5.business.concretes;

import java.util.regex.Pattern;

import Homework5.business.abstacts.UserValidationService;
import Homework5.core.utils.result.ErrorResult;
import Homework5.core.utils.result.Result;
import Homework5.core.utils.result.SuccessResult;
import Homework5.entities.concretes.User;

public class UserValidationManager implements UserValidationService{

	public UserValidationManager() {
	}

	@Override
	public void validate(User user) throws Exception {
		Result[] results = {
				this.checkFirstName(user.getFirstName()),
				this.checkLastName(user.getLastName()),
				this.checkPasswordNotNull(user.getPassword()),
				this.checkEmailIsValid(user.getEmail())
		};
		
		for(Result result : results) {
			if(!result.isSuccess()) {
				throw new Exception(result.getMessage());
				}
		}
		
	}
	
	Result checkFirstName(String firstName) {
		if(firstName.isEmpty() || firstName == null || firstName.length()<2)
			return new ErrorResult("�sminiz bo� veya 2 karakterden k���k olamaz");
		return new SuccessResult();
	}
	
	Result checkLastName(String lastName) {
		if(lastName.isEmpty() || lastName== null || lastName.length()<2)
			return new ErrorResult("Soyisminiz bo� veya 2 karakterden k���k olamaz");
		return new SuccessResult();
	}
	
	Result checkEmailNotNull(String email) {
		if(email.isEmpty() || email == null)
			return new ErrorResult("Mail adresiniz bo� olamaz");
		return new SuccessResult();
	}

	Result checkPasswordNotNull(String password) {
		if(password.isEmpty() || password == null)
			return new ErrorResult("�ifreniz bo� olamaz");
		return new SuccessResult();
	}
	
	Result checkPassword(String password) {
		if(password.length()<6)
			return new ErrorResult("�ifreniz 6 karakterden az olamaz");
		return new SuccessResult();
	}
	
	Result checkEmailIsValid(String email) {
		String regexString = "[a-zA-Z0-9_!#$%&�*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";
		if(!Pattern.compile(regexString).matcher(email).matches())
			return new ErrorResult("Ge�ersiz Mail adresi girdiniz.");
		return new SuccessResult();
	}
	

}
