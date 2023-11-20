package assignments;

import java.util.Scanner;

public class U2A2_1DArrays {
	public static void main(String[] args) {
		int[] myInt = new int[12];
		menu(myInt);
	}
	

	private static void menu(int[] myInt) {
		
		System.out.println(""
				+ "Enter option\n"
				+ "[1] Show contents\n"
				+ "[2] Insert Integer in Index of Array\n"
				+ "[3] Sum up the contents\n"
				+ "[4] List even and odd numbers in Array\n"
				+ "[5] Exit");
		
		Scanner input = new Scanner(System.in);
		int userInput = input.nextInt(); 
		
		
		if (userInput == 1) {
			
			showContents(myInt);
			
		}
		
		else if (userInput == 2) {
			
			insert(myInt);
			
		}
		
		else if (userInput == 3) {
			sumUp(myInt);
		}
		
		else if (userInput == 4) {
			evenOdd(myInt);
		}
		
		else if (userInput == 5) {
			System.exit(0);
		}
		
	}


	private static void evenOdd(int[] myInt) {
		
		// finds even and odd 
		
		int even = 0;
		int odd = 0;
		
		for(int i = 0; i < myInt.length; i++) {
			
			System.out.println("\n");
			
			if (myInt[i] % 2 == 0) {
				
				System.out.println(myInt[i] + " is even");
				even = (even + myInt[i]);
				
			}
			
			else {
				
				System.out.println(myInt[i] + " is odd");
				odd = (odd + myInt[i]);
				
			}
			
		}
		
		System.out.println("\nThe sum of even numbers is: " + even);
		System.out.println("The sum of odd numbers is: " + odd);
		
		System.out.println("\nDone\n\n");
		menu(myInt);
		
	}


	private static void sumUp(int[] myInt) {
		
		// sums up the value in a loop
		
		int value = 0;
		for(int i = 0; i < myInt.length; i++) {
			
			value = (value + myInt[i]);
			
		}
		System.out.println("sum of all the integers in the array: " + value + "\n\n");
		
		menu(myInt);
		
	}


	public static void insert(int[] myInt) {
		System.out.println("Enter what index you want to insert an Integer in\n");
		Scanner scanner = new Scanner(System.in);
		int index = scanner.nextInt();
		
		System.out.println("Enter what you want to insert in index " + index);
		Scanner data = new Scanner(System.in);
		int userInput = data.nextInt(); 
		
		myInt[index] = userInput;
		System.out.println("Done\n\n");
		
		menu(myInt);
		
	}


	private static void showContents(int[] myInt) {
		for(int i = 0; i < myInt.length; i++) {
			
			System.out.println("Content for index " + i + " is: " + myInt[i]);
			
		}
		
		System.out.println("\n");
		menu(myInt);
		
	}

}
