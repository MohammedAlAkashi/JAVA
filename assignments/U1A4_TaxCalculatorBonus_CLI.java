package assignments;

import java.util.Scanner;

public class U1A4_TaxCalculatorBonus_CLI {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your income:");
		Double income = sc.nextDouble();
		
		if(income < 53359) {
			
			System.out.println("15% TAX");
			System.out.println("taxable income: " + (income * 0.15));
			System.exit(0);
			
		}
		
		else if ((income > 53359) && (income <= 106717)) {
			
			System.out.println("20.5% TAX");
			System.out.println("taxable income: " + (income * 0.205));
			
		}
		
		
		else if ((income > 106717) && (income <= 165430)) {
			
			System.out.println("26% TAX");
			System.out.println("taxable income: " + (income * 0.26));
			
		}
		
		else if ((income > 165430) && (income <= 235675)) {
			
			System.out.println("29% TAX");
			System.out.println("taxable income: " + (income * 0.29));
			
		}
		
		else if (income > 235675) {
			
			System.out.println("33% TAX");
			System.out.println("taxable income: " + (income * 0.33));
			
		}
	}
}
