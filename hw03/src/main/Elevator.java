package main;


public class Elevator{
	
	public int current_Floor=5;
	int dest_Floor;
	
	private Elv_States State = new Elv_States();
	
	public Elevator (int dest_floor){
		
		this.dest_Floor=dest_floor;
		System.out.println("*** Destination floor is: "+ dest_Floor);
		System.out.println("Current state: " + State.getCurrent_state());
		
		if (current_Floor < dest_Floor) {
			go_up();
		}
		else if (current_Floor > dest_Floor) {
			go_down();
		}
		else {
			exit();
		}
	}

	private void arrive_to_floor() {
		State.current_state = State.getIdle();
		System.out.println("Arrived at destination.");
		print();
		exit();
	}
	
	private void go_up() {
		State.current_state = State.getMoving_up();
		print();
		current_Floor += 1;
		if (current_Floor < dest_Floor) {
			go_up();
		}
		else{
			arrive_to_floor();
		}
	}
	
	private void go_down() {
		State.current_state = State.getMoving_down();
		print();
		current_Floor -= 1;
		if (current_Floor > dest_Floor) {
			go_down();
		}
		else{
			arrive_to_floor();
		}
		
	}
	private void exit() {
		System.out.println("Exit elevator");
	}
	
	public void print() {
		System.out.println("Current floor: " + current_Floor);
		System.out.println("Current state: " + State.getCurrent_state());
	}
	

	public int getCurrent_Floor() {
		return current_Floor;
	}

	public void setCurrent_Floor(int current_Floor) {
		this.current_Floor = current_Floor;
	}

	public int getDest_Floor() {
		return dest_Floor;
	}

	public void setDest_Floor(int dest_Floor) {
		this.dest_Floor = dest_Floor;
	}

	public Elv_States getState() {
		return State;
	}

	public void setState(Elv_States state) {
		State = state;
	}
	
}
