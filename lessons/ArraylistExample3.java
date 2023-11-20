package lessons;

public class ArraylistExample3 {
	public static void main(String[] args) {
		// Arraylist<int> myArrayList = new ArrayList();
		
		// Wrapper classes used to "wrap" around primitives
		
		int myInt = 13;			// primitive data type
		Integer myInt2 = 14;	// Object, "boxing" 14 into class Integer
		System.out.println(myInt2.max(3, 4));
		
		int answer = myInt + myInt2; // "Unboxing" myInt2 to use
		System.out.println(answer);
		
		/*
		 * Primitive: Wrapper Class
		 * int: Integer
		 * byte: Byte
		 * long: Long
		 * float: Float
		 * double: Double
		 * char: Character
		 * boolean: Boolean
		 */
		
		
		
	}

}
