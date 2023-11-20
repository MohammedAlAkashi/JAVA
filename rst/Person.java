package rst;
public abstract class Person {
	
	// variables
	
	private String firstName;
	private String lastName;
	
	
	// Parameterized Constructor
	public Person(String first, String last) {
		
		this.firstName = first;
		this.lastName = last;
		
	}
	
	
	// Get Methods
	public String getFirstName() {
		return this.firstName;
	}
	public String getLastName() {
		return this.lastName;
	}
	
	
	// Set Methods
	
	public void setFirstName(String mk) {
		this.firstName = mk;
	}
	public void setLastName(String mdl) {
		this.lastName = mdl;
	}
	
	// Overloaded .toString method
	
	public String toString() {
		return (getFirstName() + " " + getLastName());
	}
}
