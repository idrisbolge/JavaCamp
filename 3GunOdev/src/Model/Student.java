package Model;

public class Student extends User{

	public Student() {
		super();
	}

	public Student(int id, String firstName, String lastName, String email, String username, String password, String photoUrl) {
		super(id, firstName, lastName, email, username, password,photoUrl);
	}
	
}
