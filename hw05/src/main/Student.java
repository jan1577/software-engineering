package main;

public class Student {
	
	private int id;
	private String name;
	private boolean hasProject;
	private Project project;
	
	public Student (int id, String name) {
		this.id = id;
		this.name = name;
		hasProject = false;
	}
	
	public void addToProject(Project project) {
		if (!hasProject){
			hasProject = true;
			this.project = project;
			project.addMember(this);
		}
	}

	//GETTERS AND SETTERS
	public String getName() {
		return name;
	}
	public Project getProject() {
		return project;
	}

	
	

}
