package Lessons;

// imports

import java.util.Scanner;

public class WhileLoop {
	public static void main(String[] args) {
		
		int counter1 = 0;
		int counter = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("how much numbers or words.");
		counter1 = sc.nextInt();
		
		while (counter < counter1) {
			
			System.out.println(counter);
			counter++;
			
		}
		
	}

}
