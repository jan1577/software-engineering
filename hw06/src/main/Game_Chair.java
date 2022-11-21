package main;

public class Game_Chair {
	
	private static Player computer;
	private static Player player2;
	private static BetMore_Game betMoreGame;
	
	public Game_Chair() {
		
		computer = new Player(true);
		player2 = new Player();
		betMoreGame = new BetMore_Game();
	}
	
	
	public static void main() {
		Game_Chair gameChair = new Game_Chair();
		betMoreGame.findWinner(computer, player2);
	}
	
	

	
}

