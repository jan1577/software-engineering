package main;

import java.util.ArrayList;

public class Exam {
	
	private int maxValue;
	private ArrayList<Professor> professors;
	private ArrayList<Student> registeredStudents;
	private ArrayList<Question> examQuestions;
	
	public Exam(int maxValue, Question question) {
		this.maxValue = maxValue;
		this.registeredStudents = new ArrayList<Student>();
		this.examQuestions = new ArrayList<Question>();
		examQuestions.add(question);
		this.professors = new ArrayList<Professor>();
	}

	public boolean register(Student student) {
		return true;
	}
	public void addProfessor(Professor professor) {
		this.professors.add(professor);
	}
	
	public void addQuestion(int id, String task, int value) {
		this.examQuestions.add(new Question(id, task, value));
	}

	// GETTERS AND SETTERS
	public ArrayList<Student> getRegisteredStudents() {
		return registeredStudents;
	}
	
	
}
