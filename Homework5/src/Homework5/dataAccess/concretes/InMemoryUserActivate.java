package Homework5.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import Homework5.dataAccess.abstracts.UserActivationDao;
import Homework5.entities.concretes.User;
import Homework5.entities.concretes.UserActivation;

public class InMemoryUserActivate implements UserActivationDao{
	private List<UserActivation> userActivationList;
	
	
	
	
	public InMemoryUserActivate() {
		this.userActivationList = new ArrayList<UserActivation>();
	}

	@Override
	public void add(UserActivation userActivation) {
		this.userActivationList.add(userActivation);
	}

	@Override
	public void update(UserActivation userActivation) {
		this.userActivationList.set(this.userActivationList.indexOf(userActivation), userActivation);
		
	}

	@Override
	public void delete(UserActivation userActivation) {
		this.userActivationList.remove(this.userActivationList.indexOf(userActivation));
	}

	public List<UserActivation> getUserActivationList() {
		return userActivationList;
	}



}
