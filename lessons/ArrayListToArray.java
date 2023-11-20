package lessons;


import java.util.ArrayList;

public class ArrayListToArray {
	public static void main(String[] args) {
		
		// Declare Array, dont initialize
		String[] myArray;
		
		// Create Arraylist with elements
		ArrayList<String> myArrayList = new ArrayList();
		myArrayList.add("Canada");
		myArrayList.add("Egypt");
		myArrayList.add("Thailand");
		myArrayList.add("UAE");
		myArrayList.add("US");
		
		// Initialize Array using size of ArrayList
		myArray = new String[(myArrayList.size())];
		
		// Transfer all elements from ArrayList to Array
		myArrayList.toArray(myArray);
		
		// Print ArrayList
		for (int i = 0; i < myArrayList.size(); i++) {
			System.out.println(myArrayList.get(i));
		}
		
		// print Array
		for (int i = 0; i < myArray.length; i++) {
			System.out.println(myArray[i]);
		}
	}

}
