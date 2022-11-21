package main;

public class BetMore_Game {
	
	public int findWinner(Player computer, Player player2) {
		
		if (computer.getNumber() > player2.getNumber()){
			return 1;
		}
		else if (computer.getNumber() < player2.getNumber()){
			return -1;
		}
		else {
			return 0;
		}
	
	}
	

}
