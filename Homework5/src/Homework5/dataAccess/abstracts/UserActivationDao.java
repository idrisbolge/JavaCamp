package Homework5.dataAccess.abstracts;


import java.util.List;

import Homework5.entities.concretes.UserActivation;

public interface UserActivationDao {
	
	void add(UserActivation userActivation)	;
	void update(UserActivation userActivation)	;
	void delete(UserActivation userActivation)	;
	List<UserActivation> getUserActivationList();
}
