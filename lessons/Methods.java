package Lessons;

//imports
import java.util.Scanner;

public class Methods {
	public static void main(String[] args) {
		
		menu();
		
	}

	private static void menu() {
		
		System.out.println("CLI calculator application");
		System.out.println("Menu:");
		System.out.println("1. Add");
		System.out.println("2. Subtract");
		System.out.println("3. Multiply");
		System.out.println("4. Divide");
		System.out.println("Choice: ");
		
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		
		choice1(choice);
		
	}

	private static void choice1(int choice) {
		
		switch(choice) {
		
			case 1: divide(choice);
			break;
			case 2: divide(choice);
			break;
			case 3: divide(choice);
			break;
			case 4: divide(choice);
			break;
			default: System.out.println("That is not an option");
	
		}
		
	}

	private static void divide(int choice) {
		int method = choice;
		
		System.out.println("Enter your first value");
		Scanner sc = new Scanner(System.in);
		double douuble1 = sc.nextDouble();
		
		System.out.println("Enter your second value");
		Scanner sc2 = new Scanner(System.in);
		double douuble2 = sc2.nextDouble();
		
		firstvalue(douuble1, douuble2, method);
		
	}

	private static void firstvalue(double douuble1, double douuble2, int method) {
		switch(method) {
		
			case 1: System.out.println(douuble1 + douuble2); menu();
			break;
			case 2: System.out.println(douuble1 - douuble2); menu();
			break;
			case 3: System.out.println(douuble1 * douuble2); menu();
			break;
			case 4: System.out.println(douuble1 / douuble2); menu();
			break;
			default: System.out.println("That is not an option");

		}
	}
}
