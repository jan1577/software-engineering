package main;

public class VisitorImpl implements Visitor{

	@Override
	public double visit(Electronic electronic) {
		double cost;
		if (electronic.getFragile()) {
			cost = (double)electronic.getWeight()/10 * 5;
		}
		else {
			cost = (double)electronic.getWeight()/15 * 5;
		}
		System.out.println("The total cost for " + electronic.getName() + " is " + cost);
		System.out.println("Should be covered with Polyethylene foam film and packed in a box with a dimension of " 
				+ (electronic.getLength()+1) + "x" + (electronic.getWidth()+1) + "x" + (electronic.getHeight()+1));
		
		return cost;
	}

	@Override
	public double visit(Glass glass) {
		double cost;
		if (glass.getThickness() == 1) {
			cost = glass.getLength() * 2;
		}
		else if (glass.getThickness() == 2) {
			cost = (double)(glass.getThickness() * 1.2);
		}
		else {
			cost = (double)(glass.getThickness() * 0.7); 
		}
		
		System.out.println("The total cost for " + glass.getName() + " is " + cost);
		System.out.println("Should be filled with Bubble wraps and packed in a box with a dimension of " 
				+ (glass.getLength()+1) + "x" + (glass.getWidth()+1) + "x" + (glass.getHeight()+1));
		
		return cost;
	}

	@Override
	public double visit(Furniture furniture) {
		double cost = (double)((furniture.getWeight()/20) * 5);
		
		System.out.println("The total cost for " + furniture.getName() + " is " + cost);
		System.out.println("Should be covered with waterproof covers with an area " + furniture.getLength() + "x" + furniture.getHeight());
		
		return cost; 
	}
	
	

}
