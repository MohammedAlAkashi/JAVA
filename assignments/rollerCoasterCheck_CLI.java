package assignments;

import java.util.Scanner;

public class rollerCoasterCheck_CLI {
	public static void main(String[] args) {
//		for(int i = 0; i <= 1000; i++) {
//			
//			if(i % 2 == 0) {
//				
//				System.out.println(i + " is odd");
//				
//			}
//			
//			else {
//				
//				System.out.println(i + " is even");
//				
//			}
//			
//		}
		Scanner sc = new Scanner(System.in);
		System.out.println("Do you have back problems? Y / N");
		String backproblems = sc.next();
		
		if((backproblems.equals("Y")) || (backproblems.equals("y"))) {
			
			System.out.println("Cant enter the ride");
			System.exit(0);
			
		}
		else {
			System.out.println("Do you have heart problems? Y / N");
			String heartproblems = sc.next();
			
			if((heartproblems.equals("Y")) | (heartproblems.contentEquals("y"))) {
				
				System.out.println("cant go on ride");
				System.exit(0);
				
			}
			
			else {
				
				System.out.println("Enter your height");
				double height = sc.nextDouble();
				
				if((height < 188) && (height > 122)) {
					
					System.out.println("can go on ride, enjoy");
					System.exit(0);
				}
				
				else {
					
					System.out.println("cant go on ride");
					System.exit(0);
					
				}
			}	
			
		}
	}

}
