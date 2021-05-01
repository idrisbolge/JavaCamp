package Service;

import Model.Course;
import Model.Instructor;

public class InstructorManager extends UserManager {

	public void add(Instructor instructor) {
		super.add(instructor);
	}
	
	public void update(Instructor instructor) {
		super.update(instructor);
	}
	
	public void delete(Instructor instructor) {
		super.delete(instructor);
	}
	
	@Override
	public Course[] getCourses(int instructorId) {
		System.out.println("Eðitmene ait kurslar listelendi");
		return new Course[] {};
	}
	
}
