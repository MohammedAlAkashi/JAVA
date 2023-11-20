package assignments;

// imports

import java.util.Scanner;

public class sleepCLI {
	public static void main(String[] args) {
		
		double age = 0.0;
		double dayInAYear = 365;
		double hoursInADay = 24;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your age in years:");
		age = sc.nextDouble();
		double ageInDays = (dayInAYear * age);
		double hoursInTotal = (hoursInADay* ageInDays);
		double hoursSlept = (hoursInTotal * 0.3);
		double daysSlept = (hoursSlept / 24);
		double yearsSlept = (daysSlept / 365);
		double monthsSlept = (yearsSlept * 12);
		
		System.out.println(ageInDays);
		System.out.println(hoursInTotal);
		System.out.println("amount of hours you slept: " + hoursSlept + " hours");
		System.out.println("amount of days you slept: " + daysSlept + " days");
		System.out.println("amount of months you slept: " + monthsSlept + " months");
		System.out.println("amount of years slept: " + yearsSlept + " years");
		
	}

}
