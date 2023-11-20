package Sandbox;

// imports
import java.util.ArrayList;

public class ArrayListExample {
	public static void main(String[] args) {
		
		// array list = resizable array.
		// elements can also be added and removed even after
		// the compilation phase
		// can also store reference data types.
		
		ArrayList<String> food = new ArrayList<String>();
		
		// add function
		
		food.add("pizza");
		food.add("cheese");
		food.add("burger");
		
		// you can also manipulate the data, either by
		// changing, adding, removing, or wiping the array clean.
		
		food.set(0, "hotdog");
		food.remove(2);
		// deletes all the data in array
		food.clear();
		
		// for loop to show all the data in array
		
		for(int i=0; i<food.size(); i++) {
			
			System.out.println(food.get(i));
			
		}
		
	}
}
