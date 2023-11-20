package Lessons;

import java.util.Scanner;

public class ForLoop {
	public static void main(String[] args) {
		
		// for loop = executes a block of code
		// a limited amount of times
		
		for(int i = 0; i<=10; i++) {
			
			System.out.println(i);
			
			
		}
		
		// nested loops = a loop inside a loop
		
		// declaring variables.
				
		Scanner sc = new Scanner(System.in);
		int rows;
		int colums;
		String symbol = "";
		
		System.out.println("Enter amount of rows:");
		rows = sc.nextInt();
		System.out.println("Enter amount of colums:");
		colums = sc.nextInt();
		System.out.println("Enter a Symbol:");
		symbol = sc.next();
		
		for(int i = 1; i <= rows; i++) {
			
			System.out.println();
			
			for(int j = 1; j<=colums; j++) {
				
				System.out.print(symbol);
			}
		}
	}
}
