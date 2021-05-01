package Service;

import Model.Course;
import Model.Student;

public class StudentManager extends UserManager{

		public void add(Student student) {
			super.add(student);
		}
		
		public void update(Student student) {
			super.update(student);
		}
		
		public void delete(Student student) {
			super.delete(student);
		}
		
		
		@Override 
		public Course[] getCourses(int studentId) {
			System.out.println("Öğrenci kursları listelendi.");
			return new Course[] {};
		}
}
