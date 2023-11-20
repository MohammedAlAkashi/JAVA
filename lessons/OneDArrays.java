package lessons;

import java.lang.reflect.Array;

public class OneDArrays {
	public static void main(String[] args) {
		
		// Creating array of size 7
		// Hold integers only
		// Fixed in size
		int[] myInt = new int[7];
		
		myInt[0] = 13;
		myInt[1] = 7;
		myInt[2] = 1;
		myInt[3] = 5;
		myInt[4] = 3;
        myInt[5] = 4;
		myInt[6] = 22;
		
		// Access first item (Index 0)
		System.out.println(myInt[0]);
		
		// Access last item (Index n-1)
		System.out.println(myInt[6]);
		
		// Length of array
		System.out.println("Array conatins " + myInt.length + " elements.");
		
		for(int i = 0; i < myInt.length; i++) {
			
			System.out.println(myInt[i]);
			
		}
		
	}

}
