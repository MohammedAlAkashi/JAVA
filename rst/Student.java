package rst;
public class Student extends Person{
	
	// variables
	
	private String email;
	private String studentNumber;
	
	
	// Parameterized Constructor
	public Student(String first, String last, String studentNumber, String email) {
		super(first, last);
		
		this.email = email;
		this.studentNumber = studentNumber;
		
	}
	
	
	// Get Methods
	public String getEmail() {
		return this.email;
	}
	public String getStudentNumber() {
		return this.studentNumber;
	}
	
	
	// Set Methods
	
	public void setEmail(String mk) {
		this.email = mk;
	}
	public void setStudentNumber(String mdl) {
		this.studentNumber = mdl;
	}
	
	// Overloaded .toString method
	
	public String toString() {
		return (super.toString() + " " + getEmail() + " " + getStudentNumber());
	}
}
