package Homework5.business.concretes;


import java.util.List;
import java.util.stream.Collectors;

import Homework5.business.abstacts.UserCheckService;
import Homework5.core.utils.ServiceUtils;
import Homework5.core.utils.result.ErrorResult;
import Homework5.core.utils.result.Result;
import Homework5.core.utils.result.SuccessResult;
import Homework5.dataAccess.abstracts.UserDao;
import Homework5.entities.concretes.User;

public class UserCheckManager implements UserCheckService {
	private UserDao userDao;

	public UserCheckManager(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public void check(User user) throws Exception {
		Result[] results = ServiceUtils.runChecks(this.checkDuplicateEmail(user.getEmail()));
		for (Result result : results) {
			if(!result.isSuccess())
				throw new Exception(result.getMessage());
		}
	}
	
	private Result checkDuplicateEmail(String Email) {
		List<User> userList = userDao.getAll();
		
		if(userList.stream().filter(u -> u.getEmail() == Email).collect(Collectors.toList()) != null)
			return new ErrorResult("Bu mail adresi zaten sistemde kayýtlý");
		return new SuccessResult();
	}
}
