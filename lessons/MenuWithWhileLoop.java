package Lessons;

// imports

import java.util.Scanner;

public class MenuWithWhileLoop {
		public static void main(String[] args) {
		
		int choice = 0;
		Scanner sc = new Scanner(System.in);
		boolean validChoice = false;
		
		while (choice != 2) {
			
			System.out.println("Menu");
			System.out.println("1. Hello World");
			System.out.println("2. Exit");
			System.out.println("Enter choice: ");
			
			choice = sc.nextInt();
			
			if (choice == 1) {
				System.out.flush();
				System.out.println("Hello World!\n");
				
			}
			
			else {
				
				System.out.println("Exiting program");
				
			}
			
		}
		
		
		
	}
}
