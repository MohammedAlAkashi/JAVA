package Lessons;

import java.util.Scanner;

public class IfElseIf {
	public static void main(String[] args) {
		
		/*
		 FORMAT:
		 
		  if (boolean) {
		  
		  }
		  
		  else if (boolean) {
		  
		  }
		  
		  else { 
		  
		  }
		 
		 */
		
		int age = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Program determins driving status");
				
		try {
			
			System.out.print("Enter your age: ");
			
			age = sc.nextInt();
			
			if (age < 16) {
				
				System.out.println("underage");
				
			} else if ( (age >= 16) && (age < 65) ) {
				
				System.out.println("permissible to drive");
				
			} else {
				
				System.out.println("retake driving test");
				
			}	
			
		} catch(Exception e) {
			System.out.println(e);
			}
	}
}
