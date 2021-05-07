package Homework5.dataAccess.concretes;

import Homework5.entities.concretes.User;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import Homework5.dataAccess.abstracts.UserDao;

public class InMemoryUserDao implements UserDao {

	private List<User> userList = new ArrayList<User>();
	
	
	@Override
	public void signin(User user) {
		System.out.println("kullan�c� kaydedildi.");
		this.userList.add(user);
	}



	@Override
	public List<User> getAll() {
		return userList;
	}



	@Override
	public void login(User user) {
		System.out.println("Giri� yapt�n�z.");
		
	}

	public void update(User user) {
		System.out.println("Kullan�c� g�ncellendi.");
	}
	


	@Override
	public User get(Predicate<User> predicate) {
		
		return this.userList.stream().filter(predicate).findFirst().orElse(null);
	}



}



