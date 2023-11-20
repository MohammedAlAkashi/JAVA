package lessons.myObjects;

public class Car extends Vehicle {
	
	// Data members
	private int airBags;
	
	// Default Constructor
	public Car(String mk, String mdl, String c, int ab) {
		
		super(mk, mdl, c);
		this.airBags = 0;
		
	}
	

	// Set methods
	public void setAirbags(int w) {
		this.airBags = w;
	}
	
	// Get methods
	public int getAirbags() {
		return this.airBags;
	}
	
	// . toString
	public String toString() {
		
		return super.toString() + " " + this.airBags;		
	}
}
