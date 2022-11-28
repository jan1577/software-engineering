package main;

public interface Visitor {
	
	public double visit(Electronic electronic);
	
	public double visit(Glass glass);
	
	public double visit(Furniture furniture);

}
