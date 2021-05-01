package Model;

public class Course {
	private int id;
	private int InstructorId;
	private int categoryId;
	private String name;
	private String shortDescription;
	private String longDescription;
	
	
	public Course() {
	}


	public Course(int id, int instructorId, int categoryId, String name, String shortDescription,
			String longDescription) {

		this.id = id;
		InstructorId = instructorId;
		this.categoryId = categoryId;
		this.name = name;
		this.shortDescription = shortDescription;
		this.longDescription = longDescription;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getInstructorId() {
		return InstructorId;
	}


	public void setInstructorId(int instructorId) {
		InstructorId = instructorId;
	}


	public int getCategoryId() {
		return categoryId;
	}


	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getShortDescription() {
		return shortDescription;
	}


	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}


	public String getLongDescription() {
		return longDescription;
	}


	public void setLongDescription(String longDescription) {
		this.longDescription = longDescription;
	}
	
	
	

}
