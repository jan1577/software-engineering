package main;

import java.util.Random;

public class Shuffle {
	
	public int pickCard() {
		Random random = new Random();
		// return random number between 1 and 100
		return random.nextInt(100) + 1; 
	}
	

}
