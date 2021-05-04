package Concrete;

public class Player {
	private int Id;
	private String firstName;
	private String lastName;
	private String IdentityNumber;
	private String BirthYear;
	
	public Player() {
	}
	
	
	public Player(int id, String firstName, String lastName, String identityNumber, String birthYear) {
		Id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		IdentityNumber = identityNumber;
		BirthYear = birthYear;
	}


	public int getId() {
		return Id;
	}


	public void setId(int id) {
		Id = id;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getIdentityNumber() {
		return IdentityNumber;
	}


	public void setIdentityNumber(String identityNumber) {
		IdentityNumber = identityNumber;
	}


	public String getBirthYear() {
		return BirthYear;
	}


	public void setBirthYear(String birthYear) {
		BirthYear = birthYear;
	}
	
	
}
