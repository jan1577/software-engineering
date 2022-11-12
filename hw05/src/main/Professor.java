package main;

import java.util.ArrayList;

public class Professor extends Employee{
	
	private ArrayList<Course> courses;
	private ArrayList<Exam> exams;
	
	public Professor(String name, int employeeId, ArrayList<Course> courses) {
		super(name, employeeId);
		this.courses = courses;
		this.exams = new ArrayList<Exam>();
	}
	
	public void publicCourse() {
		;
	}
	public void assignTA() {
		;
	}
	
	public void addCourse(Course course) {
		this.courses.add(course);
	}
	public void addExam(Exam exam) {
		this.exams.add(exam);
	}
	
	
	// GETTERS AND SETTERS

	public ArrayList<Course> getCourses() {
		return courses;
	}

	public void setCourses(ArrayList<Course> courses) {
		this.courses = courses;
	}
	

}
