package lessons;

public class TwoDArray {
	public static void main(String[] args) {
		
		// 2D array = an array of arrays
		
		// declare 2D array
		// you can think of it as a minecraft inventory,
		// or a coordinate or as a chessboards / x o x o
		
		
		String[][] cars = new String[3][3];
		
		cars[0][0] = "Camaro";
		cars[0][1] = "Corvette";
		cars[0][2] = "Silverado";
		cars[1][0] = "BMW";
		cars[1][1] = "Tesla";
		cars[1][2] = "Mustang";
		cars[2][0] = "F-150";
		cars[2][1] = "Ranger";
		cars[2][2] = "Tesla";
		
		// for loop to go through the entirety of the table
		
		System.out.println("stage 1");
		
		for(int i=0; i<cars.length; i++) {
			
			System.out.println();
			
			for(int j=0; j<cars[i].length; j++) {
				
				System.out.print(cars[i][j]+" ");
				
			}
		}
	}
}
