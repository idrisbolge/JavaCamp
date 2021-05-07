package Homework5.dataAccess.abstracts;

import java.util.List;
import java.util.function.Predicate;

import Homework5.entities.concretes.User;

public interface UserDao {
	void signin(User user);
	void login(User user);
	List<User>getAll();
	User get(Predicate<User> predicate);
	public void update(User user);
}
