package lessons;
import java.util.ArrayList;

public class ArrayLists {

	public static void main(String[] args) {
		/*
		 * ArrayLists used to store classes / objects, not primitives
		 * To put primitives, we use "wrapper classes"
		 * index 0-n-1 (like arrays)
		 * Dynamic, grows and shrinks in size
		 * includes predefined methods.
		 */
		
		
		// SYNTAX
		// ArrayList<Object-type> arrayListIdentifier = new ArrayList();
		
		ArrayList<String> students = new ArrayList();
		
		students.add("Neema");
		students.add("Praise");
		students.add("Avraj");
		students.add("Bennet");
		students.add("Stuart");
		students.add("Laura");
		students.add("Emily");
		
		for (int i = 0; i < students.size(); i++) {
			
			System.out.println(students.get(i));
			
		}
		
		System.out.println("Size of ArrayList: " + students.size());
		
	}

}
