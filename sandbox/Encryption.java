package sandbox;

import java.util.Scanner;

public class Encryption {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		menu();
	}

	private static void menu() {
		
		System.out.println("input");
		int myChoice = sc.nextInt();
		
		if (myChoice == 1) {
			
			encrypt();
			
		}
		
		else if (myChoice == 2) {
			
			decrypt();
			
		}
		
		else if (myChoice == 3) {
			
			fibonachi();
			
		}
		
		else {
			
			menu();
			
		}
		
	}

	private static void fibonachi() {
		Scanner sc = new Scanner(System.in);
		System.out.println("how much times to go in loop");
		int loop = sc.nextInt();
		int firstNum = 0;
		int secondNum = 1;
		int thirdNum;
		
		for (int i = 0; i <= loop; i++) {
			
			thirdNum = firstNum + secondNum;
			firstNum = secondNum;
			secondNum = thirdNum;
			System.out.println(thirdNum);
			
		}
		
		menu();
		
	}

	private static void decrypt() {
		Scanner sc = new Scanner(System.in);
		int tempAscii = 0;
		System.out.println("decrypt message");
		String myString = sc.nextLine();
		for (int i = 0; i < myString.length(); i++) {
				
				tempAscii = (int)myString.charAt(i) - 3;
				
				System.out.print((char)tempAscii);
				
		}
		
		System.out.println();
		menu();
		
	}

	private static void encrypt() {
		Scanner sc = new Scanner(System.in);
		int tempAscii = 0;
		System.out.println("encrypt message");
		String myString = sc.nextLine();
		for (int i = 0; i < myString.length(); i++) {
				
				tempAscii = (int)myString.charAt(i) + 3;
				
				System.out.print((char)tempAscii);
				
		}
		
		System.out.println();
		menu();
		
	}

}
