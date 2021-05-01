package Service;

import Model.Course;
import Model.User;

public class UserManager {

		public void add(User user) {
			System.out.println(user.getFirstName()+" "+user.getLastName() + "��renci olarak eklendi.");
		}
		
		public void update(User user) {
			System.out.println(user.getFirstName()+" "+user.getLastName() + "adl� ��rencinin bilgileri g�ncellendi.");
		}
		
		
		public void delete(User user) {
			System.out.println(user.getFirstName()+" "+user.getLastName() + "��rencinin kayd� silindi.");
		}
		
		
		
		public Course[] getCourses(int UserId) {
			System.out.println("Kullan�c�n�n kurslar� listelendi.");
			return new Course[] {};
		}
		
		public User[] getAll() {
			System.out.println("T�m kullanc�lar getirildi. ");
			return new User[] {};
		}
		
		public User[] getById(int id) {
			System.out.println("Kullanc�lar getirildi. ");
			return new User[] {};
		}
		
		
		
}
