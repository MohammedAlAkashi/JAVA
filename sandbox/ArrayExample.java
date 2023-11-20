package sandbox;

public class ArrayExample {
	public static void main(String[] args) {
		
		// array = used to store multiple values in a single variable
		
		String[] cars = {"Camaro", "idk", "Corvette", "Tesla"};
		
		cars[0] = "Mustang";
		
		System.out.println(cars[0]);
		
		// you can create a new string on the go with no values to it
		// by doing this:
		
		String[] newtable = new String[3];
		
		// you can then set the data by doing this:
		
		newtable[0] = "BMW";
		newtable[1] = "Corvette";
		newtable[2] = "Tesla";
		
		System.out.println(newtable[0]);
		
		for(int i=0; i<newtable.length; i++) {
			
			System.out.println(newtable[i]);
			
		}	
	}	
}
