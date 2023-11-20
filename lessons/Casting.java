package lessons;

public class Casting {
	public static void main(String[] args) {
		
		String myString1 = "";
		int myInteger1 = 13;
		myString1 = Integer.toString(myInteger1);
		System.out.println(myString1); // String
		System.out.println(myInteger1); // Integer
		
		// Double to String
		
		
		String myString2 = "";
		double myDouble1 = 13.3;
		myString2 = Double.toString(myDouble1);
		System.out.println(myString2); // String
		
		// String to Integer
		try {
			
			String myString3 = "18.4";
			int myInteger2;
			myInteger2 = Integer.parseInt(myString3);
			
			System.out.println(myInteger2);
			
		}
		catch(Exception e) {
			
			System.out.println("You didnt enter an Integer");
			
		}
		
		// String to Double
		
		String myString4 = "6.8";
		double myDouble2;
		myDouble2 = Double.parseDouble(myString4);
		System.out.println(myDouble2);
		
		// Integer to Double
		
		int myInteger3 = 42;
		double myDouble3 = (double)myInteger3;
		System.out.println(myDouble3);
		
		// Integer to Double (promotion/automatic)
		
		int myInteger4 = 5;
		double myDouble4 = myInteger4;
		System.out.println(myDouble4);
		
		// Double to Integer (truncates)
		
		double myDouble5 = 15.7;
		int myInteger5;
		//myIntege5r = myDouble5;
		//System.out.println(myInteger5);
		
	}
}
