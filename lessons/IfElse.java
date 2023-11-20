package Lessons;

import java.util.Scanner;

public class IfElse {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
	    System.out.println("gimme mark grade NOW");
	    
	    sc.nextInt();
	
		
		int grade = 50;
		
		if (grade >= 50) {
			
			System.out.println("passed");
			
		
			
		}
		else {
			
			System.out.println("failed");
			
		}
		
		if (true) {
			
			System.out.println("true");
		}
		
		if (false) {
			
			System.out.println("how");
			
		}
		
		else {
			System.out.println("code block4 executed");
			
		}
	}

}
