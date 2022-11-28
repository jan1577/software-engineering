package main;

public class Team implements Component{
	
	private String name;
	private int numberOfAthletes;
	private int numberOfGoldMedals;
	
	public Team(String name, int numberOfAthletes, int numberOfGoldMedals) {
		
		super();
		this.name = name;
		this.numberOfAthletes = numberOfAthletes;
		this.numberOfGoldMedals = numberOfGoldMedals;
		
	}

	@Override
	public void print() {
		System.out.println("Team: " + name + ", Number of Athletes: " + numberOfAthletes + ", Numer of Gold Medals: " + numberOfGoldMedals);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumberOfAthletes() {
		return numberOfAthletes;
	}

	public void setNumberOfAthletes(int numberOfAthletes) {
		this.numberOfAthletes = numberOfAthletes;
	}

	public int getNumberOfGoldMedals() {
		return numberOfGoldMedals;
	}

	public void setNumberOfGoldMedals(int numberOfGoldMedals) {
		this.numberOfGoldMedals = numberOfGoldMedals;
	}
	
	
	

}
