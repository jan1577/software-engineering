package main;

public class TA {
	
	public String name;
	public Course course;
	
	public TA(String name, Course course) {
		this.name = name;
		this.course = course;
	}
	
	public void extendContract(Course course) {
		;
	}
	
	
	// GETTERS AND SETTERS
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public Course getCourse() {
		return course;
	}
}
