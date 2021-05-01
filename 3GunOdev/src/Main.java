import Model.Course;
import Model.Instructor;
import Model.Student;
import Service.InstructorManager;
import Service.StudentManager;

public class Main {

	public static void main(String[] args) {

		
		// Öðrenci ekleyelim
		Student student = new Student();
		student.setId(1);
		student.setFirstName("Ýdris");
		student.setLastName("Bölge");
		student.setEmail("example@hotmail.com");
		student.setUsername("idrisbolge");
		student.setPassword("123456");
		student.setPhotoUrl(null);
		
		Student student1 = new Student(2,"Ali","Demirel","alidemirel@hotmail.com","alidemirel","123456","alidemirel.jpg");
		
		StudentManager studentManager=new StudentManager();
		studentManager.add(student);
		studentManager.add(student1);
		
		Instructor instructor = new Instructor(1,"Engin","Demirog","engindemirog@gmail.com","engin","12345","photo.jpg","---");
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.add(instructor);
		
		
		
		
		
		
	}

}
