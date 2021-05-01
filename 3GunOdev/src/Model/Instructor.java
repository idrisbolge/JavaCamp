package Model;

public class Instructor extends User{

	private String information;
	
	public Instructor() {
		super();
	}

	public Instructor(int id, String firstName, String lastName, String email, String username, String password,String photoUrl,String information) {
		super(id, firstName, lastName, email, username, password,photoUrl);
		this.information = information;
	}

	public String getInformation() {
		return information;
	}

	public void setInformation(String information) {
		this.information = information;
	}
	

}
