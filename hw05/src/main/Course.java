package main;

import java.util.ArrayList;

public class Course {
	
	private int id;
	private String name;
	private int maxCapacity;
	private boolean isFull;
	private Professor[] professor = new Professor[3];
	private ArrayList<TA> ta;
	private ArrayList<Student> students;
	
	public Course(int id, String name, int cap, boolean isFull, ArrayList<TA> ta){
		this.id = id;
		this.name = name;
		this.maxCapacity = cap;
		this.isFull = isFull;
		this.ta = new ArrayList<TA>();
		this.students = new ArrayList<Student>();
	}
	
	public void addProfessor(Professor prof) {
		for (int i=0; i<=2; i++) {
			if (this.professor[i]==null) {
				this.professor[i] = prof;
				break;
			}
		System.out.println("Maximum Number of Professors reached.");
		}
	}
	
	public void enroll(Student student) {
		this.students.add(student);
	}
	
	public void apply(TA ta) {
		;
	}

	
	//GETTERS AND SETTERS

	public void setName(String name) {
		this.name = name;
	}

	public void setMaxCapacity(int maxCapacity) {
		this.maxCapacity = maxCapacity;
	}

	public Professor[] getProfessor() {
		return professor;
	}

	public ArrayList<TA> getTa() {
		return ta;
	}

	public void setTa(ArrayList<TA> ta) {
		this.ta = ta;
	}
	
	
	

}
