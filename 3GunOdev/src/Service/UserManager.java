package Service;

import Model.Course;
import Model.User;

public class UserManager {

		public void add(User user) {
			System.out.println(user.getFirstName()+" "+user.getLastName() + "öðrenci olarak eklendi.");
		}
		
		public void update(User user) {
			System.out.println(user.getFirstName()+" "+user.getLastName() + "adlý öðrencinin bilgileri güncellendi.");
		}
		
		
		public void delete(User user) {
			System.out.println(user.getFirstName()+" "+user.getLastName() + "öðrencinin kaydý silindi.");
		}
		
		
		
		public Course[] getCourses(int UserId) {
			System.out.println("Kullanýcýnýn kurslarý listelendi.");
			return new Course[] {};
		}
		
		public User[] getAll() {
			System.out.println("Tüm kullancýlar getirildi. ");
			return new User[] {};
		}
		
		public User[] getById(int id) {
			System.out.println("Kullancýlar getirildi. ");
			return new User[] {};
		}
		
		
		
}
