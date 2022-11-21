package main;

public class Player {
	private int number;
	private boolean user_selected = false;
	private static Shuffle s;
	
	public Player() {
		Shuffle s = new Shuffle();
		number = play(0);
	}
	
	public Player(boolean computer) {
		Shuffle s = new Shuffle();
		user_selected = true;
		number = play(0);
	}
	
	public int play(int repeated) {
		
		if (user_selected == true || repeated == 4) {
			return s.pickCard();
		}
		else {
			return play(repeated + 1);
		}
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
	
}


