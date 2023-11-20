package Lessons;

import java.util.Scanner;

public class TryCatch {
	public static void main(String[] args) {
		
		int age = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter your age: ");
		
		try {
			
			age = sc.nextInt();
			if (age >= 16) {
				
				System.out.println("qualified for driving licence.");
				
			}
			
			else {
				
				System.out.println("not qualified for driving licence.");
				
			}
			
		}
		catch(Exception e) {
			
			System.out.println("enter a whole number.");
			
		}
		
	}

}
