package assignments;

//imports
import java.util.Scanner;

public class changeCLI {
	public static void main(String[] args) {
		int toonie = 0;
		int loonie = 0;
		int quarter = 0;
		int dime = 0;
		int nickel = 0;
		int pennie = 0;
		
		System.out.println("ENTER MONEY:");
		Scanner sc = new Scanner(System.in);
		
		double change = sc.nextDouble();
		
		toonies(change, toonie, loonie, quarter, dime, nickel, pennie);
		
	}

	private static void toonies(double change, int toonie, int loonie, int quarter, int dime, int nickel, int pennie) {
		double nextAmount = change;
		if (change >= 2) {
			change = nextAmount - 2;
			toonie++;
			
			System.out.println("works");
			System.out.println(nextAmount);
			System.out.println("toonies: " + toonie);
			toonies(change, toonie, loonie, quarter, dime, nickel, pennie);
			
			
		}
		else {
			
			System.out.println("next currency");
			loonies(change, toonie, loonie, quarter, dime, nickel, pennie);
		}
	
	}

	private static void loonies(double change, int toonie, int loonie, int quarter, int dime, int nickel, int pennie) {
		double nextAmount = change;
		if (change >= 1) {
			change = change - 1;
			loonie++;
			
			System.out.println("works");
			System.out.println(nextAmount);
			System.out.println("toonies: " + toonie);
			System.out.println("loonies: " + loonie);
			loonies(change,  toonie, loonie, quarter, dime, nickel, pennie);
			
			
		}
		else {
			
			System.out.println("next currency");
			quarters(change, toonie, loonie, quarter, dime, nickel, pennie);

		}
		
	}

	private static void quarters(double change, int toonie, int loonie, int quarter, int dime, int nickel, int pennie) {
		double nextAmount = change;
		if (change >= 0.25) {
			change = nextAmount - 0.25;
			quarter++;
			
			System.out.println("works");
			System.out.println(nextAmount);
			System.out.println("toonies: " + toonie);
			System.out.println("loonies: " + loonie);
			System.out.println("quarters: " + quarter);
			quarters(change,  toonie, loonie, quarter, dime, nickel, pennie);
			
			
		}
		else {
			
			System.out.println("next currency");
			dimes(change, toonie, loonie, quarter, dime, nickel, pennie);

		
		}
	}
	
	private static void dimes(double change, int toonie, int loonie, int quarter, int dime, int nickel, int pennie) {
		
		double nextAmount = change;
		if (change >= 0.10) {
			change = nextAmount - 0.10;
			dime++;
			
			System.out.println("works");
			System.out.println(nextAmount);
			System.out.println("toonies: " + toonie);
			System.out.println("loonies: " + loonie);
			System.out.println("quarters: " + quarter);
			System.out.println("dimes: " + dime);
			dimes(change,  toonie, loonie, quarter, dime, nickel, pennie);
			
			
		}
		else {
			
			System.out.println("next currency");
			nickels(change, toonie, loonie, quarter, dime, nickel, pennie);

		
		}
		
	}

	private static void nickels(double change, int toonie, int loonie, int quarter, int dime, int nickel, int pennie) {
		double nextAmount = change;
		if (change >= 0.05) {
			change = nextAmount - 0.05;
			nickel++;
			
			System.out.println("works");
			System.out.println(nextAmount);
			System.out.println("toonies: " + toonie);
			System.out.println("loonies: " + loonie);
			System.out.println("quarters: " + quarter);
			System.out.println("dimes: " + dime);
			System.out.println("nickels: " + nickel);
			nickels(change,  toonie, loonie, quarter, dime, nickel, pennie);
			
			
		}
		else {
			
			System.out.println("next currency");
			pennies(change, toonie, loonie, quarter, dime, nickel, pennie);
			
		
		}
		
	}

	private static void pennies(double change, int toonie, int loonie, int quarter, int dime, int nickel, int pennie) {
		double nextAmount = change;
		if (change >= 0.01) {
			change = nextAmount - 0.01;
			pennie++;
			
			System.out.println("works");
			System.out.println(nextAmount);
			System.out.println("toonies: " + toonie);
			System.out.println("loonies: " + loonie);
			System.out.println("quarters: " + quarter);
			System.out.println("dimes: " + dime);
			System.out.println("nickels: " + nickel);
			System.out.println("pennies: " + pennie);
			pennies(change,  toonie, loonie, quarter, dime, nickel, pennie);
			
			
		}
		else {
			System.out.println("DONE:");
			System.out.println("RESULTS:");
			System.out.println("toonies: " + toonie);
			System.out.println("loonies: " + loonie);
			System.out.println("quarters: " + quarter);
			System.out.println("dimes: " + dime);
			System.out.println("nickels: " + nickel);
			System.out.println("pennies: " + pennie);
			
		}
		
	}
}
