package main;

import java.util.ArrayList;

public class Composite implements Component{
	
	private String name;
	private int numberOfAthletes;
	private int numberOfGoldMedals;
	private ArrayList<Team> components;
	
	public Composite(String name, int numberOfAthletes, int numberOfGoldMedals) {
		this.name = name;
		this.numberOfAthletes =  numberOfAthletes;
		this.numberOfGoldMedals = numberOfGoldMedals;
		ArrayList<Team> components = new ArrayList<Team>();
	}
	

	
	public void addComp(Team team) {
		components.add(team);
	}
	public void removeComp(Team team) {
		components.remove(team);
	}
	
	public ArrayList<Component> getChildren(){
		return components;
	}
	@Override
	public void print() {
		for (Component team: components) {
			System.out.println("Team: " + name + ", Number of Athletes: " + numberOfAthletes + ", Numer of Gold Medals: " + numberOfGoldMedals);
		}
		
		
	}
}
