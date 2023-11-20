package lessons.myObjects;

public abstract class Vehicle {
	
	
	// variables
	private String make;
	private String model = "West Falia";
	private String color;
	
	// Constructors
	
	// Default Constructor
	public Vehicle() {
		
		this.make = "null";
		this.model = "null";
		this.color = "null";
		
	}
	
	// Parameterized Constructor
	public Vehicle(String mk, String mdl, String c) {
		
		this.make = mk;
		this.model = mdl;
		this.color = c;
		
	}
	
	
	// Get Methods
	public String getMake() {
		return this.make;
	}
	public String getModel() {
		return this.model;
	}
	public String getColor() {
		return this.color;
	}
	
	
	// Set Methods
	
	public void setMake(String mk) {
		
		this.make = mk;
		
	}
	public void setModel(String mdl) {
		
		this.model = mdl;
		
	}
	public void setColor(String c) {
		
		this.color = c;
		
	}
	
	// Overloaded .toString method
	
	public String toString() {
		return (getMake() + " " + getModel() + " " + getColor());
	}
	
}
