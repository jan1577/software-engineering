package main;

import java.util.ArrayList;

public class Project {
	
	private String name;
	private ArrayList<Student> members;
	private Course course;
	
	public Project(String name, Course course) {
		this.name = name;
		this.members = new ArrayList<Student>();
		this.course = course;
	}
	
	public void addMember(Student student) {
		this.members.add(student);
	}
	
	//GETTERS AND SETTERS

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Student> getMembers() {
		return members;
	}
}
