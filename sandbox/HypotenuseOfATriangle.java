package Sandbox;

// imports

import java.util.Scanner;

public class HypotenuseOfATriangle {
	public static void main(String[] args) {
		
		double adjecent;
		double opposite;
		double hypotenuse;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Adjecent: ");
		adjecent = sc.nextDouble();
		
		System.out.println("Enter the Opposite: ");
		opposite = sc.nextDouble();
		
		hypotenuse = Math.sqrt((adjecent * adjecent)+(opposite * opposite));
		
		System.out.println("the hypotenuse is: " + hypotenuse);
		
		sc.close();
	}

}
